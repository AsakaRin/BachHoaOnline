package dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.LoaiSP;
import model.NhomSP;
import model.SanPham;
import model.ThuocTinh;

public class SanPhamDAO extends DAO {

	public SanPhamDAO() {
		super();
		// TODO Auto-generated constructor stub
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
		List<NhomSP> listnhomSP = null;
		String sql = "{call NhomSP}";

		try {
			CallableStatement cs = con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (listnhomSP == null)
					listnhomSP = new ArrayList<NhomSP>();
				NhomSP sp = getNhomSP(rs.getInt("id"));
				listnhomSP.add(sp);
			}

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			listnhomSP = null;
		}
		return listnhomSP;
	}

	public LoaiSP getLoaiSP(int id) {
		LoaiSP loaiSP = null;
		String sql = "{call LoaiSP(?)}";

		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, id);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (loaiSP == null)
					loaiSP = new LoaiSP();
				loaiSP.setId(rs.getInt("id"));
				loaiSP.setMaloaiSP(rs.getString("maloaiSP"));
				loaiSP.setTenloadSP(rs.getString("tenloaiSP"));
			}

			return loaiSP;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			loaiSP = null;
		}
		return loaiSP;
	}
	public List<LoaiSP> getDSLoaiSP() {
		List<LoaiSP> listloaiSP = null;
		String sql = "{call LoaiSP}";

		try {
			CallableStatement cs = con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (listloaiSP == null)
					listloaiSP = new ArrayList<LoaiSP>();
//				loaiSP.setId(rs.getInt("id"));
				LoaiSP sp = getLoaiSP(rs.getInt("id"));
				listloaiSP.add(sp);
				
			}

			return listloaiSP;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			listloaiSP = null;
		}
		return listloaiSP;
	}
	public ThuocTinh getThuocTinh(int id) {
		ThuocTinh thuocTinh = null;
		String sql = "{call ThuocTinh(?)}";

		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1, id);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (thuocTinh == null)
					thuocTinh = new ThuocTinh();
				thuocTinh.setId(rs.getInt("id"));
				thuocTinh.setTenthuoctinh(rs.getString("tenthuoctinh"));
				thuocTinh.setGiatri(rs.getString("giatri"));	
			}

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			thuocTinh = null;
		}
		return thuocTinh;
	}
	
	public SanPham getSanPhamById(int id) {
		SanPham sp = null;
		String sql = "{call SanPham(?)}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			cs.setInt(1,id);
			ResultSet rs = cs.executeQuery();
			while(rs.next()) {
				if(sp == null) sp = new SanPham();
				sp.setId(rs.getInt("id"));
				sp.setMaSP(rs.getString("maSp"));
				sp.setTenSP(rs.getString("tenSP"));
				sp.setGiaban(rs.getFloat("giaban"));
				sp.setGianhap(rs.getFloat("gianhap"));
				sp.setGiatang(rs.getFloat("giatang"));
				sp.setTonkho(rs.getInt("tonkho"));
				sp.setMota(rs.getString("mota"));
				sp.setNhomSP(getNhomSP(rs.getInt("NhomSPid")));
				sp.setLoadSP(getLoaiSP(rs.getInt("LoaiSPid")));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			sp = null;
		}
		
		return sp;
	}
	
	// TODO 
	public List<SanPham> getDSSanPham() {
		List<SanPham> listSP = null;
		String sql = "{call SanPham}";
		try {
			CallableStatement cs = con.prepareCall(sql);
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				if (listSP == null)
					listSP = new ArrayList<SanPham>();
				SanPham sp = getSanPhamById(rs.getInt("id"));
				listSP.add(sp);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			listSP = null;
		}

		return listSP;
	}

}