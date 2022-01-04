package model;

public class HoaDonNhapHang {

	private int id;
	private String maDH;
	private DonNhap donhap;
	public HoaDonNhapHang() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaDH() {
		return maDH;
	}
	public void setMaDH(String maDH) {
		this.maDH = maDH;
	}
	public DonNhap getDonhap() {
		return donhap;
	}
	public void setDonhap(DonNhap donhap) {
		this.donhap = donhap;
	}
}
