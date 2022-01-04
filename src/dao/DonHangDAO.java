package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DonHang;
import model.KhachHang;
import model.NhanVien;

public class DonHangDAO extends DAO{

	KhachHangDAO khDAO = new KhachHangDAO();
	NhanVienDAO nvDAO = new NhanVienDAO();

	public ArrayList<DonHang> getTatCaDonHang() throws SQLException {
		
		// get tat ca - 0
		return getDonHangTheoTrangThai(0);
	}
	
	public ArrayList<DonHang> getDonChoLayHang() throws SQLException {
		
		// get don cho lay hang - 1
		return getDonHangTheoTrangThai(1);
	}
	
	public ArrayList<DonHang> getDonDangGiao() throws SQLException {
	
		return getDonHangTheoTrangThai(2);
	}
	
	public ArrayList<DonHang> getDonChoXacNhan() throws SQLException {
	
		return getDonHangTheoTrangThai(3);
	}
	
	public ArrayList<DonHang> getDonDaHuy() throws SQLException {
	
		return getDonHangTheoTrangThai(4);
	}
	
	public ArrayList<DonHang> getDonHangTheoTrangThai(int status) throws SQLException {
		
		ArrayList<DonHang> kq = null;
		
		String sql = "{call danhsachDonHang()}";		
		CallableStatement cs = con.prepareCall(sql);
		ResultSet rs = cs.executeQuery();
		
		while(rs.next()) {
			
			DonHang dh = new DonHang();
			dh.setId(rs.getInt("id"));
			
			KhachHang kh = khDAO.getKHbyId(rs.getInt("idKhachHang"));			
			dh.setKH(kh);
			
			dh.setNgaydat(rs.getString("ngaydat"));
			dh.setNgaygiao(rs.getString("ngaygiao"));
			
			NhanVien nv = nvDAO.getNVbyId(rs.getInt("idNguoiDuyetDon"));
			dh.setNguoiduyetdon(nv);
			
			// chua xu ly thong tin thanh toan
			dh.setThongtinthanhtoan(null);
			
			dh.setTrangthai(rs.getInt("trangthai"));
			
			if (dh.getTrangthai() == status) {
				
				kq.add(dh);
			}			
		}
		
		return kq;
		
	}
	
	public DonHang getDonHangById(int id) throws SQLException {
		
		String sql = "{call donHangById()}";		
		CallableStatement cs = con.prepareCall(sql);
		ResultSet rs = cs.executeQuery();
		
		while(rs.next()) {
			
			DonHang dh = new DonHang();
			dh.setId(rs.getInt("id"));
			
			KhachHang kh = khDAO.getKHbyId(rs.getInt("idKhachHang"));			
			dh.setKH(kh);
			
			dh.setNgaydat(rs.getString("ngaydat"));
			dh.setNgaygiao(rs.getString("ngaygiao"));
			
			NhanVien nv = nvDAO.getNVbyId(rs.getInt("idNguoiDuyetDon"));
			dh.setNguoiduyetdon(nv);
			
			// chua xu ly thong tin thanh toan
			dh.setThongtinthanhtoan(null);
			
			dh.setTrangthai(rs.getInt("trangthai"));
			
			return dh;
		}
		
		return null;
	}
	
	public void setHuyDonHang() {
		
	}
	
	public void addDonHang() {
		
	}
}
