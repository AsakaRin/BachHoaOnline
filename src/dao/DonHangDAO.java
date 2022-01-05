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
		
		String sql = "{call getDonHangById()}";		
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
	
	public void addDonHang(DonHang dh) {
		String sql = "{call addDonHang()}";
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
	
	public ArrayList<DonHang> getLichSuGiaoDichCuaKhachHang(int idKH) {
		
		ArrayList<DonHang> list = null;
		String sql = "{call getDonHangByIdKH()?";
		try {
			CallableStatement ps = con.prepareCall(sql);
            ps.setInt(1, idKH);
            ResultSet rs = ps.executeQuery();
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
    			
    			list.add(dh);
    		}
            
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
