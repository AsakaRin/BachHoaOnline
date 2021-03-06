package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.sql.CallableStatement;

import model.DonHangDat;
import model.KhachHang;
import model.SanPham;
import model.DonHang;

public class DonHangDatDAO extends DAO{

	DonHangDAO dhDAO = new DonHangDAO();
	SanPhamDAO spDAO = new SanPhamDAO();
	
	public class SPTheoDoanhThu {
	
		public SanPham sanpham;
		public int soluong;
		public float tongtien;		
	}
	
	public class KHTheoDoanhThu {
		
		public KhachHang khachhang;
		public float tongtien;
	}
	
	public boolean containsSP(final ArrayList<SPTheoDoanhThu> list, final SanPham sanpham){
	    return list.stream().filter(o -> o.sanpham.equals(sanpham)).findFirst().isPresent();
	}
	
	public boolean containsKH(final ArrayList<KHTheoDoanhThu> list, final KhachHang khachhang){
	    return list.stream().filter(o -> o.khachhang.equals(khachhang)).findFirst().isPresent();
	}
	
	public int indexSP(final ArrayList<SPTheoDoanhThu> list, final SanPham sanpham){
		for (int i = 0; i < list.size(); i ++) {
			if (list.get(i).sanpham.equals(sanpham)) {
				return i;
			}
		}
		return -1;
	}
	
	public int indexKH(final ArrayList<KHTheoDoanhThu> list, final KhachHang khachhang){
		for (int i = 0; i < list.size(); i ++) {
			if (list.get(i).khachhang.equals(khachhang)) {
				return i;
			}
		}
		return -1;
	}
	
	public ArrayList<SPTheoDoanhThu> getTKSPTheoDoanhThu(String startTime, String endTime) throws SQLException {
	
		ArrayList<DonHangDat> danhSachSanPham = getLichSuDanhSachSanPhamTheoThoiGian(startTime, endTime);
		
		ArrayList<SPTheoDoanhThu> dsspTheoDoanhThu = null;
		
		danhSachSanPham.forEach((dhd) -> {
			
			if (this.containsSP(dsspTheoDoanhThu, dhd.getSanpham())) {
				int index = indexSP(dsspTheoDoanhThu, dhd.getSanpham());
				
				dsspTheoDoanhThu.get(index).soluong += 1;
				dsspTheoDoanhThu.get(index).tongtien = dhd.getSanpham().getGiaban();
			}
			else {
				SPTheoDoanhThu spTheoDoanhThu = new SPTheoDoanhThu();
				spTheoDoanhThu.sanpham = dhd.getSanpham();
				spTheoDoanhThu.soluong = 1;
				spTheoDoanhThu.tongtien = dhd.getSanpham().getGiaban();
				dsspTheoDoanhThu.add(spTheoDoanhThu);
			}
		});
		
		return dsspTheoDoanhThu;
	}
	
	public ArrayList<DonHangDat> getLichSuDanhSachSanPhamTheoThoiGian(String startTime, String endTime) throws SQLException {
		
		ArrayList<DonHangDat> kq = null;
		
		String sql = "{call danhsachDonHangDat(?, ?)}";		
		CallableStatement cs = con.prepareCall(sql);
		cs.setString(1, startTime);
		cs.setString(2, endTime);
		ResultSet rs = cs.executeQuery();
		
		while(rs.next()){
			
			DonHangDat dhd = new DonHangDat();
			dhd.setId(rs.getInt("id"));
			
			DonHang dh = dhDAO.getDonHangById(rs.getInt("idDonHang"));
			dhd.setDonhang(dh);
			
			SanPham sp = spDAO.getSanPhamById(rs.getInt("idSanPham"));
			dhd.setSanpham(sp);
		}
				
		
		return kq;
	}		
	
	public ArrayList<DonHangDat> getLichsumuahangcuaSP(String startTime, String endTime, String maSP) throws SQLException {
		
		ArrayList<DonHangDat> danhSachSanPham = getLichSuDanhSachSanPhamTheoThoiGian(startTime, endTime);
		
		List<DonHangDat> result = danhSachSanPham.stream().filter(o -> o.getSanpham().getMaSP().equals(maSP)).collect(Collectors.toList());
		
		return new ArrayList<DonHangDat>(result);
	}
	
	public ArrayList<KHTheoDoanhThu> getTKKHTheoDoanhThu(String startTime, String endTime) throws SQLException {
		
		ArrayList<DonHangDat> danhSachSanPham = getLichSuDanhSachSanPhamTheoThoiGian(startTime, endTime);
		
		ArrayList<KHTheoDoanhThu> dskhTheoDoanhThu = null;
		
		danhSachSanPham.forEach((dhd) -> {
			
			DonHang dh = dhd.getDonhang();
			KhachHang kh = dh.getKH();
			
			if (this.containsKH(dskhTheoDoanhThu, kh)) {
				int index = indexKH(dskhTheoDoanhThu, kh);
				
				dskhTheoDoanhThu.get(index).tongtien = dhd.getSanpham().getGiaban();
			}
			else {
				
				KHTheoDoanhThu khTheoDoanhThu = new KHTheoDoanhThu();
				khTheoDoanhThu.khachhang = kh;
				khTheoDoanhThu.tongtien = dhd.getSanpham().getGiaban();
				dskhTheoDoanhThu.add(khTheoDoanhThu);
			}
		});
		
		return dskhTheoDoanhThu;
	}
}
