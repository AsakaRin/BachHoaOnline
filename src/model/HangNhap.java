package model;

public class HangNhap {
	private int id;
	private SanPham sanpham;
	private int soluong;
	private float gianhap;
	public HangNhap() {
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
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public float getGianhap() {
		return gianhap;
	}
	public void setGianhap(float gianhap) {
		this.gianhap = gianhap;
	}
	
}
