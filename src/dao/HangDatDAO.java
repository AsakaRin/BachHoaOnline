package dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.HangDat;
import model.SanPham;

public class HangDatDAO extends DAO{
	SanPhamDAO spDAO = new SanPhamDAO();
	public HangDatDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean addToGioHang(HangDat hangdat) {
		String sqlThem = "{call addGioHang(?)}";
		try {
			PreparedStatement ps = con.prepareStatement(sqlThem);
            ps.setInt(1, hangdat.getId());
            SanPham sp = new SanPham();
            sp = spDAO.getSanPhamById(hangdat.getSanpham().getId());
            ps.setObject(2, sp);
            ps.setInt(3, hangdat.getSoluong());
            ps.setFloat(4, hangdat.getGiaban());
            
            ps.executeQuery();
            return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;	
	}
	public HangDat getHangDatById(int id) {
		HangDat hd = null;
		String sql = "{call HangDat(?)}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1,id);
			ResultSet rs = cs.executeQuery();
			while(rs.next()) {
				if(hd == null) hd = new HangDat();
				hd.setId(rs.getInt("id"));
				SanPham sp = new SanPham();
				sp = spDAO.getSanPhamById(rs.getInt("idSanPham"));
				hd.setSanpham(sp);
				hd.setSoluong(rs.getInt("soluong"));
				hd.setGiaban(rs.getFloat("giaban"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			hd = null;
		}
		
		return hd;
	}
	public List<HangDat> getDSHangDat() {
		List<HangDat> list = null;
		String sql = "{call dsHangDat}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (list == null)
					list = new ArrayList<HangDat>();
				HangDat hd = getHangDatById(rs.getInt("id"));
				list.add(hd);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			list = null;
		}

		return list;
	}
}