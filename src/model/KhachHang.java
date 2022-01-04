package model;

public class KhachHang extends NguoiDung {

	private int id;
	private String maKH;
	private GioHang gioHang;
	private int trangthai;	
	public KhachHang() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public GioHang getGioHang() {
		return gioHang;
	}
	public void setGioHang(GioHang gioHang) {
		this.gioHang = gioHang;
	}
	public int getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
}
