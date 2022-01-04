package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.NhomSP;

public class NhomSPDAO extends DAO {
	public NhomSPDAO() {
		super();
	}

	public NhomSP getNhomSP(int id) {
		NhomSP nhomSP = null;
		String sql = "{call NhomSP(?)}";

		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, id);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (nhomSP == null)
					nhomSP = new NhomSP();
				nhomSP.setId(rs.getInt("id"));
				nhomSP.setManhomSP(rs.getString("manhomSP"));
				nhomSP.setTennhomSP(rs.getString("tennhomSP"));
			}

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			nhomSP = null;
		}
		return nhomSP;
	}
	public List<NhomSP> getDSNhomSP() {
		List<NhomSP> list = null;
		String sql = "{call NhomSP}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (list == null)
					list = new ArrayList<NhomSP>();
					NhomSP nsp = new NhomSP();
					nsp.setId(rs.getInt("id"));
					nsp.setManhomSP(rs.getString("manhomSP"));
					nsp.setTennhomSP(rs.getString("tennhomSP"));
					list.add(nsp);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}