package model;

public class DonHangDat {

	private int id;
	private SanPham sanpham;
	private DonHang donhang;
	public DonHangDat() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public SanPham getSanpham() {
		return sanpham;
	}
	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}
	public DonHang getDonhang() {
		return donhang;
	}
	public void setDonhang(DonHang donhang) {
		this.donhang = donhang;
	}
}
