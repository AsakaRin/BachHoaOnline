package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import model.QuanLy;

public class QuanLyDAO extends NguoiDungDAO{

	public QuanLyDAO() {
		super();
	}
	
	public QuanLy getQuanLyById(int id) {
		
		String sql = "{call getQLbyId(?)";
		try{
			CallableStatement cs = con.prepareCall(sql);
			cs.setLong(1, id);
			ResultSet rs = cs.executeQuery();
			if(rs.next()){
				QuanLy ql = new QuanLy();
				ql.setAvater(rs.getString("avatar"));
				ql.setCmnd(rs.getString("cmnd"));
				ql.setEmail(rs.getString("diachi"));
				ql.setGhichu(rs.getString("ghichu"));
				ql.setGioitinh(rs.getInt("gioitinh"));
				ql.setHovaten(rs.getString("hovaten"));
				ql.setId(rs.getInt("id"));
				ql.setLanCuoidangnhap(rs.getString("lancuoidangnhap"));
				ql.setMaQL(rs.getString("maQL"));
				ql.setMatkhau(rs.getString("matkhau"));
				ql.setNgaysinh(rs.getString("ngaysinh"));
				ql.setNgaytao(rs.getString("ngaytao"));
				ql.setSodienthoai(rs.getString("sodienthoai"));
				ql.setTrangthai(rs.getInt("trangthai"));
				
				return ql;
			}
		} catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return null;
	}
}
