package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.HoaDonMuaHang;
import model.DonHang;

public class HoaDonMuaHangDAO extends DAO{
	DonHangDAO dhDAO = new DonHangDAO();
	public HoaDonMuaHangDAO() {
		super();
	}
	public List<HoaDonMuaHang> getDSHoaDon(){
		List<HoaDonMuaHang> list = null;
		String sql = "{call HoaDonMuaHang}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();

			while (rs.next()){
				if (list == null)
					list = new ArrayList<HoaDonMuaHang>();
					HoaDonMuaHang hdmh = new HoaDonMuaHang();
					hdmh.setId(rs.getInt("id"));
					hdmh.setMaHD(rs.getString("maHD"));
					DonHang dh = dhDAO.getDonHangById(rs.getInt("idDonHang"));
					hdmh.setDonhang(dh);
					list.add(hdmh);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}