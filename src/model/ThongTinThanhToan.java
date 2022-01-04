package model;

public class ThongTinThanhToan {

	private int id;
	private String nguoinhan;
	private String sodienthoai;
	private DiaChi diachi;
	private int phuongthucthanhtoan;
	public ThongTinThanhToan() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNguoinhan() {
		return nguoinhan;
	}
	public void setNguoinhan(String nguoinhan) {
		this.nguoinhan = nguoinhan;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public DiaChi getDiachi() {
		return diachi;
	}
	public void setDiachi(DiaChi diachi) {
		this.diachi = diachi;
	}
	public int getPhuongthucthanhtoan() {
		return phuongthucthanhtoan;
	}
	public void setPhuongthucthanhtoan(int phuongthucthanhtoan) {
		this.phuongthucthanhtoan = phuongthucthanhtoan;
	}
	
}
