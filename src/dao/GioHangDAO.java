package dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.GioHang;
import model.HangDat;

public class GioHangDAO extends DAO {
	HangDatDAO hdDAO = new HangDatDAO();

	public GioHangDAO() {
		super();
	}

	public GioHang getGioHangById(int id) throws SQLException {

		String sql = "{call gioHangById(?)}";
		CallableStatement cs = con.prepareCall(sql);
		ResultSet rs = cs.executeQuery();

		while (rs.next()) {

			GioHang gh = new GioHang();
			gh.setId(rs.getInt("id"));
			gh.setTongtien(rs.getFloat("tongtien"));

			List<HangDat> l = new ArrayList<HangDat>();
			l = hdDAO.getDSHangDat();
			gh.setHangdat(l);

			return gh;
		}

		return null;
	}

	public boolean setGioHang(GioHang gh) {
		String sql = "call setGioHang()";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, gh.getId());
			ps.setFloat(2, gh.getTongtien());
			ps.setObject(3, gh.getHangdat());
			ps.executeQuery();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
