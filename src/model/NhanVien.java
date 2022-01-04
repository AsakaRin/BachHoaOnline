package model;

public class NhanVien extends NguoiDung{

	private int id;
	private String maNV;
	private String cmnd;
	private int trangthai;
	private QuanLy nguoitao;
	public NhanVien() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public int getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
	public QuanLy getNguoitao() {
		return nguoitao;
	}
	public void setNguoitao(QuanLy nguoitao) {
		this.nguoitao = nguoitao;
	}
}
