package dao;


import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.NhomNCC;
import model.NhaCungCap;

public class NhaCungCapDAO extends DAO {
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
				NhaCungCap sp = new NhaCungCap();
				sp.setId(rs.getInt("id"));
				sp.setMaNCC(rs.getString("maNCC"));
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}
	
	public NhaCungCap setNCC(){
		NhaCungCap ncc = new NhaCungCap();
		String sql = "{call NhaCungCap()}";// su dung stored procedure
		try{
		CallableStatement cs = con.prepareCall(sql);

		ResultSet rs = cs.executeQuery();
		while(rs.next()){
		
		ncc.setMaNCC(rs.getString("maNCC"));
		ncc.setTenNCC(rs.getString("tenNCC"));
		ncc.setSodienthoai(rs.getString("sodienthoai"));
		ncc.setCongty(rs.getString("congty"));
		ncc.setChinhanh(rs.getString("chinhanh"));
		ncc.setDiachi(rs.getString("diachi"));
		ncc.setMasothue(rs.getString("masothue"));
		ncc.setTongtien(rs.getInt("tongtien"));
		ncc.setNhomNCC(rs.getString("nhomNCC"));
		ncc.setGhichu(rs.getString("ghichu"));

		}
		}catch(Exception e){
		e.printStackTrace();
		ncc = null;
		}
		return ncc;
		}
	

    private NhaCungCap getNhomNCC(int id) {
    	NhomNCC nhomNCC = null;
        String sql = "{call NhomNCC(?)}";

        try {
            CallableStatement cs = con.prepareCall(sql);
            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                if (NhaCungCap == null)
                	NhaCungCap = new LoaiSP();
                NhomNCC.setId(rs.getInt("id"));
                NhomNCC.setMaNhomNCC(rs.getString("maNhomNCC"));
                NhomNCC.setTenNhomNCC(rs.getString("tenNhomNCC"));
            }

            return NhomNCC;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            NhomNCC = null;
        }
}


