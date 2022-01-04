package dao;
import java.sql.CallableStatement;
import java.sql.ResultSet;

import model.KhachHang;
import model.NhanVien;

public class KhachHangDAO extends DAO {

	public KhachHangDAO() {
		super();
	}
	
	public boolean register(KhachHang kh){
		boolean kq = false;
		
		String sql = "{call kiemtraDK(?, ?, ?)}";
		try{
			CallableStatement cs = con.prepareCall(sql);
			cs.setString(1, kh.getHovaten());
			cs.setString(2, kh.getEmail());
			cs.setString(3, kh.getMatkhau());
			ResultSet rs = cs.executeQuery();
			if(rs.next()){
				kq = true;
			}
		} catch(Exception e){
			e.printStackTrace();
			kq = false;
		}
		return kq;
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
}