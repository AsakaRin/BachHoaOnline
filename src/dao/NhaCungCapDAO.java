package dao;


import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.NhomNCC;
import model.NhaCungCap;

public class NhaCungCapDAO extends DAO {
	
	public NguoiDungDAO nguoidungDAO = new NguoiDungDAO();
	
	public NhaCungCapDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<NhaCungCap> getDSNCC() {
		List<NhaCungCap> list = null;
		String sql = "{call NhaCungCap}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (list == null)
					list = new ArrayList<NhaCungCap>();
				NhaCungCap ncc = new NhaCungCap();
				
				ncc.setMaNCC(rs.getString("maNCC"));
				ncc.setTenNCC(rs.getString("tenNCC"));
				ncc.setSodienthoai(rs.getString("sodienthoai"));
				ncc.setCongty(rs.getString("congty"));
				ncc.setChinhanh(rs.getString("chinhanh"));
				ncc.setDiachi(nguoidungDAO.getDiacChiById(rs.getInt("idDiaChi")));
				ncc.setMasothue(rs.getString("masothue"));
				ncc.setTongtien(rs.getInt("tongtien"));			
				ncc.setGhichu(rs.getString("ghichu"));
				
				list.add(ncc);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return list;
	}
	
	public NhaCungCap getNCC(int id){
		
		NhaCungCap ncc = new NhaCungCap();
		String sql = "{call NhaCungCap(?)}";// su dung stored procedure
		try{
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, id);
			ResultSet rs = cs.executeQuery();
			while(rs.next()){
			
				ncc.setMaNCC(rs.getString("maNCC"));
				ncc.setTenNCC(rs.getString("tenNCC"));
				ncc.setSodienthoai(rs.getString("sodienthoai"));
				ncc.setCongty(rs.getString("congty"));
				ncc.setChinhanh(rs.getString("chinhanh"));
				ncc.setDiachi(nguoidungDAO.getDiacChiById(rs.getInt("idDiaChi")));
				ncc.setMasothue(rs.getString("masothue"));
				ncc.setTongtien(rs.getInt("tongtien"));			
				ncc.setGhichu(rs.getString("ghichu"));

			}
		} catch(Exception e){
			e.printStackTrace();
			ncc = null;
		}
			return ncc;
		}
}


