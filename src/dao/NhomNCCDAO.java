package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import model.LoaiSP;
import model.NhaCungCap;

public class NhomNCCDAO extends DAO{
	public NhomNCCDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	private NhomNCCDAO getNhomNCC(int id) {
    	NhomNCCDAO nhomNCC = null;
        String sql = "{call NhomNCC(?)}";

        try {
            CallableStatement cs = con.prepareCall(sql);
            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                if (NhaCungCap == null)
                	NhaCungCap = new LoaiSP();
                NhomNCCDAO.setId(rs.getInt("id"));
                NhomNCCDAO.setMaNhomNCC(rs.getString("maNhomNCC"));
                NhomNCCDAO.setTenNhomNCC(rs.getString("tenNhomNCC"));
            }

//            return NhomNCC;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            nhomNCC = null;
        }
        return nhomNCC;
    }
	
	public List<NhaCungCap> getDSNhomNCC() {
		List<NhomNCCDAO> list = null;
		String sql = "{call NhomNCC}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (list == null)
					list = new ArrayList<NhomNCCDAO>();
				NhomNCCDAO sp = new NhomNCCDAO();
				sp.setId(rs.getInt("id"));
				sp.setMaNhomNCC(rs.getString("MaNhomNCC"));
				
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}
}
