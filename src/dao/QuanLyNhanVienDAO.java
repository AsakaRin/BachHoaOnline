package dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.NhanVien;
import model.QuanLy;

public class QuanLyNhanVienDAO extends NguoiDungDAO{
	
	public QuanLyNhanVienDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public NhanVien getNVbyId(int id) {
		
		String sql = "{call getNVbyId(?)";
		try{
			CallableStatement cs = con.prepareCall(sql);
			cs.setLong(1, id);
			ResultSet rs = cs.executeQuery();

			if(rs.next()){
				NhanVien nv = new NhanVien();
				nv.setAvater(rs.getString("avatar"));
				nv.setCmnd(rs.getString("cmnd"));
				nv.setEmail(rs.getString("email"));
				nv.setGhichu(rs.getString("ghichu"));
				nv.setGioitinh(rs.getInt("gioitinh"));
				nv.setHovaten(rs.getString("hovaten"));
				nv.setId(rs.getInt("id"));
				nv.setLanCuoidangnhap(rs.getString("lancuoidangnhap"));
				nv.setMaNV(rs.getString("maNV"));
				nv.setMatkhau(rs.getString("matkhau"));
				nv.setNgaysinh(rs.getString("ngaysinh"));
				nv.setNgaytao(rs.getString("ngaytao"));
				nv.setSodienthoai(rs.getString("sodienthoai"));
				
				return nv;
			}
			
				
		} catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return null;
	}
	
	public ArrayList<NhanVien> getDanhSachNhanVien() {
		ArrayList<NhanVien> kq= null;
		String sql = "{call danhsachNhanVien()}";
		CallableStatement cs = con.prepareCall(sql);
		ResultSet rs = cs.executeQuery();
		
		QuanLyDAO qldao = new QuanLyDAO();
		
		while(rs.next()) {
			
			NhanVien nv = new NhanVien();
			nv.setId(rs.getInt("id"));
			nv.setMaNV(rs.getString("MaNV"));
			nv.setCmnd(rs.getString("Cmnd"));
			nv.setTrangthai(rs.getInt("Trangthai"));
			QuanLy ql = qldao.getQuanLyById(rs.getInt("id"));
			nv.setNguoitao(ql);
			kq.add(nv);				
		}
		
		return kq;
	}
	
	public boolean addNhanVien(NhanVien nhanVien) {
		String sql = "{call NhanVien(?)}";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nhanVien.getId());
            ps.setString(2, nhanVien.getMaNV());
            ps.setString(3, nhanVien.getCmnd());
            ps.setInt(4, nhanVien.getTrangthai());
            ps.setInt(5, nhanVien.getNguoitao().getId());
            ps.executeQuery();
            return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}
	
	public boolean suaTrangThai(NhanVien nhanVien, int trangthai) {
		String sql = "{call NhanVien(?,?)}";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nhanVien.getId());
            ps.setString(2, nhanVien.getMaNV());
            ps.setString(3, nhanVien.getCmnd());
            ps.setInt(4, trangthai);
            ps.setInt(5, nhanVien.getNguoitao().getId());
            ps.executeQuery();
            return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}
	
	public boolean xoaNhanVien(int id) {
		String sql = "{call NhanVien(?)}";
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
