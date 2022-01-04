package model;

public class NhaCungCap {

	private int id;
	private String maNCC;
	private String tenNCC;
	private String sodienthoai;
	private String email;
	private String congty;
	private String chinhanh;
	private DiaChi diachi;
	private String masothue;
	private float tongtien;
	private NhomNCC nhomNCC;
	private String ghichu;
	public NhaCungCap() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaNCC() {
		return maNCC;
	}
	public void setMaNCC(String maNCC) {
		this.maNCC = maNCC;
	}
	public String getTenNCC() {
		return tenNCC;
	}
	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCongty() {
		return congty;
	}
	public void setCongty(String congty) {
		this.congty = congty;
	}
	public String getChinhanh() {
		return chinhanh;
	}
	public void setChinhanh(String chinhanh) {
		this.chinhanh = chinhanh;
	}
	public DiaChi getDiachi() {
		return diachi;
	}
	public void setDiachi(DiaChi diachi) {
		this.diachi = diachi;
	}
	public String getMasothue() {
		return masothue;
	}
	public void setMasothue(String masothue) {
		this.masothue = masothue;
	}
	public float getTongtien() {
		return tongtien;
	}
	public void setTongtien(float tongtien) {
		this.tongtien = tongtien;
	}
	public NhomNCC getNhomNCC() {
		return nhomNCC;
	}
	public void setNhomNCC(NhomNCC nhomNCC) {
		this.nhomNCC = nhomNCC;
	}
	public String getGhichu() {
		return ghichu;
	}
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
}
