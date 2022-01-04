
package dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.GioHang;
import model. KhachHang;

public class QuanLyKhachHangDAO extends NguoiDungDAO{
	
	public QuanLyKhachHangDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

public KhachHang getKHbyId(int id) {		
		
		String sql = "{call getKHbyId(?)";
		
		try{
			CallableStatement cs = con.prepareCall(sql);
			cs.setLong(1, id);
			ResultSet rs = cs.executeQuery();

			if(rs.next()){
				KhachHang kh = new KhachHang();				
				kh.setAvater(rs.getString("avatar"));
				kh.setEmail(rs.getString("email"));
				kh.setGhichu(rs.getString("ghichu"));
				kh.setGioitinh(rs.getInt("gioitinh"));
				kh.setHovaten(rs.getString("hovaten"));
				kh.setId(rs.getInt("id"));
				kh.setLanCuoidangnhap(rs.getString("lancuoidangnhap"));
				kh.setMaKH(rs.getString("maNV"));
				kh.setMatkhau(rs.getString("matkhau"));
				kh.setNgaysinh(rs.getString("ngaysinh"));
				kh.setNgaytao(rs.getString("ngaytao"));
				kh.setSodienthoai(rs.getString("sodienthoai"));
				
				return kh;
			}
			
				
		} catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		return null; 
	}
	
	public ArrayList<KhachHang> getDanhSachKhachHang() throws SQLException {
		ArrayList<KhachHang> kq= null;
		String sql = "{call danhsachNhanVien()}";
		CallableStatement cs = con.prepareCall(sql);
		ResultSet rs = cs.executeQuery();
		
		GioHangDAO ghdao = new GioHangDAO();
		
		while(rs.next()) {
			
			KhachHang kh = new KhachHang();
			kh.setId(rs.getInt("id"));
			kh.setMaKH(rs.getString("maKH"));
			kh.setTrangthai(rs.getInt("trangthai"));
			GioHang gh = ghdao.getGioHangById(rs.getInt("id"));
			kh.setGioHang(gh);
			kq.add(kh);				
		}
		
		return kq;
	}
	
	public boolean addKhachHang(KhachHang khachHang) {
		String sql = "{call KhachHang(?)}";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, khachHang.getId());
            ps.setString(2, khachHang.getMaKH());
            ps.setInt(3, khachHang.getTrangthai());
            ps.setInt(5, khachHang.getGioHang().getId());
            ps.executeQuery();
            return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}
	
	public boolean suaTrangThai(KhachHang khachHang, int trangthai) {
		String sql = "{call KhachHang(?,?)}";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, khachHang.getId());
            ps.setString(2, khachHang.getMaKH());
            ps.setInt(3, trangthai);
            ps.setInt(5, khachHang.getGioHang().getId());
            ps.executeQuery();
            return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}
	
	public boolean xoaKhachHang(int id) {
		String sql = "{call KhachHang(?)}";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}
}
