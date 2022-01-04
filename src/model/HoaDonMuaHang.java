package model;

public class HoaDonMuaHang {

	private int id;
	private String maHD;
	private DonHang donhang;
	public HoaDonMuaHang() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public DonHang getDonhang() {
		return donhang;
	}
	public void setDonhang(DonHang donhang) {
		this.donhang = donhang;
	}
}
