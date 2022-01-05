package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.KhachHang;
import model.NhanVien;
import model.DonHang;
//import DAO.java;

public class QuanLyDonHangDAO extends DAO {
	
	KhachHangDAO khDAO = new KhachHangDAO();
	NhanVienDAO nvDAO = new NhanVienDAO();
	
	public QuanLyDonHangDAO() {
		super();
		// TODO Auto-generated constructor stub
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

	public ArrayList<DonHang> getDanhSachDonHang() throws SQLException {
		ArrayList<DonHang> kq= null;
		String sql = "{call danhsachDonHang()}";
		CallableStatement cs = con.prepareCall(sql);
		ResultSet rs = cs.executeQuery();
		
		QuanLyDAO qldao = new QuanLyDAO();
		
		while(rs.next()) {
			
			DonHang dh = new DonHang();
			
			KhachHang kh = khDAO.getKHbyId(rs.getInt("idKhachHang"));			
			dh.setKH(kh);
			
			dh.setNgaydat(rs.getString("ngaydat"));
			dh.setNgaygiao(rs.getString("ngaygiao"));
			
			NhanVien nv = nvDAO.getNVbyId(rs.getInt("idNguoiDuyetDon"));
			dh.setNguoiduyetdon(nv);
			
			dh.setTrangthai(rs.getInt("trangthai"));
			
			kq.add(dh);				
		}
		
		return kq;
	}
	
	public void setHuyDonHang(int id) {
		String sql = "{call huyDonHang(?)}";
		try {
			CallableStatement ps = con.prepareCall(sql);
			ps.setInt(1,id);
	        ps.executeQuery();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateDonHang(DonHang dh) {
		String sql = "{call updateDonHang(?,?,?,?,?,?,?)}";
		try {
			CallableStatement ps = con.prepareCall(sql);
	        ps.setInt(1, dh.getId());
	        ps.setInt(2, dh.getKH().getId());
	        ps.setInt(3, dh.getThongtinthanhtoan().getId());
	        ps.setString(4, dh.getNgaydat());
	        ps.setString(5, dh.getNgaygiao());
	        ps.setInt(6, dh.getNguoiduyetdon().getId());
	        ps.setInt(7, dh.getTrangthai());
	        ps.executeQuery();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}