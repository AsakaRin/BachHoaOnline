package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import model.NhanVien;

public class NhanVienDAO extends NguoiDungDAO{

	public NhanVienDAO() {
		super();
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
}
