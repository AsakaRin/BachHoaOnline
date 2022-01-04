package model;

public class DonHangNhap {

	private int id;
	private SanPham sanpham;
	private DonNhap donnhap;
	public DonHangNhap() {
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
	public DonNhap getDonnhap() {
		return donnhap;
	}
	public void setDonnhap(DonNhap donnhap) {
		this.donnhap = donnhap;
	}
}
