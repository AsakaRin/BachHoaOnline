package dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.SanPham;
import model.ThuocTinh;
import model.LoaiSP;
import model.NhaCungCap;
import model.NhomSP;

public class DonNhapDAO extends DAO{

	public DonNhapDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean luuThongTin(List<SanPham> list) {
		for(SanPham sp: list) {
			String sqlThem = "INSERT INTO tblSanPham(id, maSP, tenSP, tblNhomSPid, tblLoaiSPid, gianhap,\r\n"
					+ " giatang, giaban, tonkho, mota, tblThuoctinhid) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
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
	            ps.setInt(11, sp.getThuoctinh().getId());
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
}