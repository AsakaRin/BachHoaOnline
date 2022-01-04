package model;

public class HangDat {

	private int id;
	private SanPham sanpham;
	private int soluong;
	private float giaban;
	public HangDat() {
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
	public float getGiaban() {
		return giaban;
	}
	public void setGiaban(float giaban) {
		this.giaban = giaban;
	}
}
