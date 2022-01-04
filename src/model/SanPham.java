package model;

import java.util.List;

public class SanPham {

	private int id;
	private String maSP;
	private NhaCungCap nhaCC;
	private String tenSP;
	private NhomSP nhomSP;
	private LoaiSP loaiSP;
	private float gianhap;
	private float giatang;
	private float giaban;
	private int tonkho;
	private String mota;
	private List<ThuocTinh> thuoctinh;
	public SanPham() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public NhaCungCap getNhaCC() {
		return nhaCC;
	}
	public void setNhaCC(NhaCungCap nhaCC) {
		this.nhaCC = nhaCC;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public NhomSP getNhomSP() {
		return nhomSP;
	}
	public void setNhomSP(NhomSP nhomSP) {
		this.nhomSP = nhomSP;
	}
	public LoaiSP getLoadSP() {
		return loaiSP;
	}
	public void setLoadSP(LoaiSP loadSP) {
		this.loaiSP = loadSP;
	}
	public float getGianhap() {
		return gianhap;
	}
	public void setGianhap(float gianhap) {
		this.gianhap = gianhap;
	}
	public float getGiatang() {
		return giatang;
	}
	public void setGiatang(float giatang) {
		this.giatang = giatang;
	}
	public float getGiaban() {
		return giaban;
	}
	public void setGiaban(float giaban) {
		this.giaban = giaban;
	}
	public int getTonkho() {
		return tonkho;
	}
	public void setTonkho(int tonkho) {
		this.tonkho = tonkho;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public List<ThuocTinh> getThuoctinh() {
		return thuoctinh;
	}
	public void setThuoctinh(List<ThuocTinh> thuoctinh) {
		this.thuoctinh = thuoctinh;
	}
}
