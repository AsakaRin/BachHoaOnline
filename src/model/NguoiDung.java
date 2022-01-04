package model;

public class NguoiDung {

	private int id;
	private String hovaten;
	private String avater;
	private String email;
	private String sodienthoai;
	private String matkhau;
	private int gioitinh;
	private String ngaysinh;
	private DiaChi diachi;
	private String ghichu;
	private String ngaytao;
	private String lancuoidangnhap;
	
	public NguoiDung() {
		super();
	}
	public NguoiDung(String email, String matkhau) {
		super();
		this.email = email;
		this.matkhau = matkhau;
	}
	public NguoiDung(int id, String hovaten, String avater, String email, String sodienthoai, String matkhau,
			int gioitinh, String ngaysinh, DiaChi diachi, String ghichu, String ngaytao, String lancuoidangnhap) {
		super();
		this.id = id;
		this.hovaten = hovaten;
		this.avater = avater;
		this.email = email;
		this.sodienthoai = sodienthoai;
		this.matkhau = matkhau;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.ghichu = ghichu;
		this.ngaytao = ngaytao;
		this.lancuoidangnhap = lancuoidangnhap;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getGhichu() {
		return ghichu;
	}
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	public String getNgaytao() {
		return ngaytao;
	}
	public void setNgaytao(String ngaytao) {
		this.ngaytao = ngaytao;
	}
	public String getLanCuoidangnhap() {
		return lancuoidangnhap;
	}
	public void setLanCuoidangnhap(String lanCuoidangnhap) {
		this.lancuoidangnhap = lanCuoidangnhap;
	}		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public String getAvater() {
		return avater;
	}
	public void setAvater(String avater) {
		this.avater = avater;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public int getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(int gioitinh) {
		this.gioitinh = gioitinh;
	}
	public DiaChi getDiachi() {
		return diachi;
	}
	public void setDiachi(DiaChi diachi) {
		this.diachi = diachi;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
}
