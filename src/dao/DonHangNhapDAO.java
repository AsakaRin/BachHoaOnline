package dao;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DonHangNhap;
import model.DonNhap;
import model.SanPham;

public class DonHangNhapDAO extends DAO{ 

	DonNhapDAO dhDAO = new DonNhapDAO();
	SanPhamDAO spDAO = new SanPhamDAO();
	
	
	public class SPTheoDoanhThu {
	
		public SanPham sanpham;
		public int soluong;
		public float tongtien;		
	}
	
	
	public ArrayList<SanPham> getDonHangNhap() throws SQLException {
		
		ArrayList<SanPham> kq = null;
		
		String sql = "{call danhsachDonHangNhap()}";		
		CallableStatement cs = con.prepareCall(sql);
		ResultSet rs = cs.executeQuery();
		
		while(rs.next()){
			
			DonHangNhap dhn = new DonHangNhap();		
			dhn.setId(rs.getInt("id"));
			
			DonNhap dn = dhDAO.getDonNhapById(rs.getInt("idDonNhap"));
			dhn.setDonnhap(dn);
			
			SanPham sp = spDAO.getSanPhamById(rs.getInt("idSanPham"));
			dhn.setSanpham(sp);
		}
				
		
		return kq;
	}
	

	
	public ArrayList<SPTheoDoanhThu> getThongKeSPTheoNCC(String startTime, String endTime) throws SQLException {
		
		ArrayList<DonNhap> danhSachSanPham = getLichSuDanhSachSanPhamTheoThoiGian(startTime, endTime);
		
		ArrayList<SPTheoDoanhThu> dsspTheoDoanhThu = null;
		
		danhSachSanPham.forEach((dhd) -> {
			
			if (this.containsSP(dsspTheoDoanhThu, dhd.getSanpham())) {
				int index = indexSP(dsspTheoDoanhThu, dhd.getSanpham());
				
				dsspTheoDoanhThu.get(index).soluong += 1;
				dsspTheoDoanhThu.get(index).tongtien = dhd.getSanpham().getGiaban();
			}
			else {
				SPTheoDoanhThu spTheoDoanhThu = new SPTheoDoanhThu();
				spTheoDoanhThu.sanpham = dhd.getSanpham();
				spTheoDoanhThu.soluong = 1;
				spTheoDoanhThu.tongtien = dhd.getSanpham().getGiaban();
				dsspTheoDoanhThu.add(spTheoDoanhThu);
			}
		});
		
		return dsspTheoDoanhThu;
	}
	
}




