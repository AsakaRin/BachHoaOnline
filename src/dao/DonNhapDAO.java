package dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.DonHangNhap;
import model.DonNhap;
import model.HangDat;
import model.HangNhap;
import model.NhaCungCap;
import model.SanPham;

public class DonNhapDAO extends DAO{	

	public DonHangNhapDAO dhnDAO = new DonHangNhapDAO();
	
	public DonNhapDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public class LichSuNhapHang {
		
		HangNhap hangnhap;
		String ngaynhap;
	}
	
	public ArrayList<DonNhap> getDanhSachDonNhapTheoThoiGian(String startTime, String endTime) {
		ArrayList<DonNhap> list = null;
		String sql = "{call getDSDonNhap(?, ?)}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setString(1, startTime);
			cs.setString(2, endTime);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (list == null)
					list = new ArrayList<DonNhap>();
				DonNhap dn = new DonNhap();
				dn.setId(rs.getInt("id"));
				dn.setMadonnhap(rs.getString("madonnhap"));
				dn.setNgaynhap(rs.getString("ngaynhap"));
				dn.setTongtien(rs.getFloat("tongtien"));
				list.add(dn);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			list = null;
		}

		return list;
	}
	
	public DonNhap getDonNhapById(int id) {
		String sql = "{call getDonNhap}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				DonNhap dn = new DonNhap();
				dn.setId(rs.getInt("id"));
				dn.setMadonnhap(rs.getString("madonnhap"));
				dn.setNgaynhap(rs.getString("ngaynhap"));
				dn.setTongtien(rs.getFloat("tongtien"));
				return dn;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

		return null;
	}

	public boolean luuThongTin(List<SanPham> list) {
		for(SanPham sp: list) {
			String sqlThem = "INSERT INTO tblSanPham(id, maSP, tenSP, tblNhomSPid, tblLoaiSPid, gianhap,\r\n"
					+ " giatang, giaban, tonkho, mota) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement ps = con.prepareStatement(sqlThem);
	            ps.setInt(1, sp.getId());
	            ps.setString(2, sp.getMaSP());
	            ps.setString(3, sp.getTenSP());
	            ps.setInt(4, sp.getNhomSP().getId());
	            ps.setInt(5, sp.getLoadSP().getId());
	            ps.setFloat(8, sp.getGiaban());
	            ps.setFloat(6, sp.getGianhap());
	            ps.setFloat(7, sp.getGiatang());
	            ps.setInt(9, sp.getTonkho());
	            ps.setString(10, sp.getMota());
	            ps.executeQuery();
			}
			catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;	
	}
	public List<SanPham> getSanPhamTheoNCC(int idNCC) {
		List<SanPham> list = null;
		try {
			String sql = "Select * from tblSanPham where tblNhaCungCapid=" +idNCC+"";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				if (list == null)
					list = new ArrayList<SanPham>();
				SanPham sp = new SanPham();
				sp.setId(rs.getInt("id"));
				sp.setMaSP(rs.getString("maSp"));
				sp.setTenSP(rs.getString("tenSP"));
				sp.setGianhap(rs.getFloat("gianhap"));
				sp.setGiatang(rs.getFloat("giatang"));
				sp.setGiaban(rs.getFloat("giaban"));
				sp.setTonkho(rs.getInt("tonkho"));
				sp.setMota(rs.getString("mota"));
				list.add(sp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return list;
	}
	
	public ArrayList<LichSuNhapHang> getLichSuGiaoDichCuaHangNhapTheoThoiGian(String startTime, String endTime) throws SQLException {
		ArrayList<LichSuNhapHang> dslichSuNhapHang = null;
		
		ArrayList<DonHangNhap> dsdhn = dhnDAO.getDanhSachDonHangNhapTheoThoiGian(startTime, endTime);
		dsdhn.forEach(dhn -> {
			
			LichSuNhapHang lsnh = new LichSuNhapHang();
			lsnh.hangnhap = dhn.getDonnhap().getHangnhap();
			lsnh.ngaynhap = dhn.getDonnhap().getNgaynhap();
			
			dslichSuNhapHang.add(lsnh);
		});
		
		return dslichSuNhapHang;
	}
}






