package model;

public class DonHang {

	private int id;
	private KhachHang KH;
	private ThongTinThanhToan thongtinthanhtoan;
	private String ngaydat;
	private String ngaygiao;
	private NhanVien nguoiduyetdon;
	private int trangthai;
	public DonHang() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public KhachHang getKH() {
		return KH;
	}
	public void setKH(KhachHang kH) {
		KH = kH;
	}
	public ThongTinThanhToan getThongtinthanhtoan() {
		return thongtinthanhtoan;
	}
	public void setThongtinthanhtoan(ThongTinThanhToan thongtinthanhtoan) {
		this.thongtinthanhtoan = thongtinthanhtoan;
	}
	public String getNgaydat() {
		return ngaydat;
	}
	public void setNgaydat(String ngaydat) {
		this.ngaydat = ngaydat;
	}
	public String getNgaygiao() {
		return ngaygiao;
	}
	public void setNgaygiao(String ngaygiao) {
		this.ngaygiao = ngaygiao;
	}
	public NhanVien getNguoiduyetdon() {
		return nguoiduyetdon;
	}
	public void setNguoiduyetdon(NhanVien nguoiduyetdon) {
		this.nguoiduyetdon = nguoiduyetdon;
	}
	public int getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
}
