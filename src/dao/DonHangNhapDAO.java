package dao;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.DonHangDatDAO.SPTheoDoanhThu;
import model.DonHang;
import model.DonHangDat;
import model.DonHangNhap;
import model.DonNhap;
import model.HangNhap;
import model.NhaCungCap;
import model.SanPham;

public class DonHangNhapDAO extends DAO{ 

	DonNhapDAO dnDAO = new DonNhapDAO();
	SanPhamDAO spDAO = new SanPhamDAO();	
	
	public class SPTheoNCC {
		
		public HangNhap hangnhap;
		public int soluong;
		public NhaCungCap ncc;		
	}
	
	public boolean containsHN(final ArrayList<SPTheoNCC> list, final HangNhap hangnhap){
	    return list.stream().filter(o -> o.hangnhap.equals(hangnhap)).findFirst().isPresent();
	}
	
	public int indexHN(final ArrayList<SPTheoNCC> list, final HangNhap hangnhap){
		for (int i = 0; i < list.size(); i ++) {
			if (list.get(i).hangnhap.equals(hangnhap)) {
				return i;
			}
		}
		return -1;
	}
	
	
	public ArrayList<SanPham> getDonHangNhap() throws SQLException {
		
		ArrayList<SanPham> kq = null;
		
		String sql = "{call danhsachDonHangNhap()}";		
		CallableStatement cs = con.prepareCall(sql);
		ResultSet rs = cs.executeQuery();
		
		while(rs.next()){
			
			DonHangNhap dhn = new DonHangNhap();		
			dhn.setId(rs.getInt("id"));
			
			DonNhap dn = dnDAO.getDonNhapById(rs.getInt("idDonNhap"));
			dhn.setDonnhap(dn);
			
			SanPham sp = spDAO.getSanPhamById(rs.getInt("idSanPham"));
			dhn.setSanpham(sp);
		}
				
		
		return kq;
	}
	

	
	public ArrayList<SPTheoNCC> getThongKeSPTheoNCC(String startTime, String endTime) throws SQLException {
		
		ArrayList<DonNhap> danhSachSanPham = dnDAO.getDanhSachDonNhapTheoThoiGian(startTime, endTime);
		
		ArrayList<SPTheoNCC> dsspTheoNCC = null;
		
		danhSachSanPham.forEach((dhn) -> {
			
			if (this.containsHN(dsspTheoNCC, dhn.getHangnhap())) {
				int index = indexHN(dsspTheoNCC, dhn.getHangnhap());
				
				dsspTheoNCC.get(index).soluong += 1;				
				dsspTheoNCC.get(index).ncc = dhn.getNhaCC();
			}
			else {
				SPTheoNCC spTheoDoanhThu = new SPTheoNCC();
				spTheoDoanhThu.hangnhap = dhn.getHangnhap();
				spTheoDoanhThu.soluong = 1;
				spTheoDoanhThu.ncc = dhn.getNhaCC();
				dsspTheoNCC.add(spTheoDoanhThu);
			}
		});
		
		return dsspTheoNCC;
	}
	
	public ArrayList<DonHangNhap> getDanhSachDonHangNhapTheoThoiGian(String startTime, String endTime) throws SQLException {
		
		ArrayList<DonHangNhap> list = null;
		
		String sql = "{call getDonHangNhapTheoThoiGian(?, ?)";
		CallableStatement cs = con.prepareCall(sql);
		cs.setString(1, startTime);
		cs.setString(2, endTime);
		ResultSet rs = cs.executeQuery();
		
		while(rs.next()){
			
			DonHangNhap dhn = new DonHangNhap();
			dhn.setId(rs.getInt("id"));
			
			DonNhap dn = dnDAO.getDonNhapById(rs.getInt("idDonHang"));
			dhn.setDonnhap(dn);
			
			SanPham sp = spDAO.getSanPhamById(rs.getInt("idSanPham"));
			dhn.setSanpham(sp);
			
			list.add(dhn);
		}
		
		return list;		
	}
}




