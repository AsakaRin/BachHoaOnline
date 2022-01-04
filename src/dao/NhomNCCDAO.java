package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.LoaiSP;
import model.NhaCungCap;
import model.NhomNCC;

public class NhomNCCDAO extends DAO{
	public NhomNCCDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	private NhomNCC getNhomNCC(int id) {
    	NhomNCC nhomNCC = null;
        String sql = "{call NhomNCC(?)}";

        try {
            CallableStatement cs = con.prepareCall(sql);
            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {

            	nhomNCC.setId(rs.getInt("id"));
            	nhomNCC.setManhomNCC(rs.getString("maNhomNCC"));
            	nhomNCC.setTennhomNCC(rs.getString("tenNhomNCC"));
            }

//            return NhomNCC;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
        return nhomNCC;
    }
	
	public ArrayList<NhomNCC> getDSNhomNCC() {
		ArrayList<NhomNCC> list = null;
		String sql = "{call DSNhomNCC}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {

				NhomNCC nhomNCC = new NhomNCC();
				nhomNCC.setId(rs.getInt("id"));
            	nhomNCC.setManhomNCC(rs.getString("maNhomNCC"));
            	nhomNCC.setTennhomNCC(rs.getString("tenNhomNCC"));
            	
            	list.add(nhomNCC);
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
            return null;
		}

		return list;
	}
}
