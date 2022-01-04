package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.LoaiSP;

public class LoaiSPDAO extends DAO {
	public LoaiSPDAO() {
		super();
	}
	public LoaiSP getLoaiSP(int id) {
		LoaiSP lsp = null;
		String sql = "{call LoaiSP(?)}";

		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, id);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (lsp == null)
					lsp = new LoaiSP();
				lsp.setId(rs.getInt("id"));
				lsp.setMaloaiSP("maloaiSP");
				lsp.setTenloadSP("tenloaiSP");
			}

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			lsp = null;
		}
		return lsp;
	}
	public List<LoaiSP> getDSLoaiSP() {
		List<LoaiSP> list = null;
		String sql = "{call LoaiSP}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (list == null)
					list = new ArrayList<LoaiSP>();
				LoaiSP lsp = new LoaiSP();
				lsp.setId(rs.getInt("id"));
				lsp.setMaloaiSP(rs.getString("maloaiSP"));
				lsp.setTenloadSP(rs.getString("tenloaiSP"));
				list.add(lsp);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}