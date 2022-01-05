package model;

import java.util.List;

public class DonNhap {

	private int id;
	private String madonnhap;
	private QuanLy quanly;
	private NhaCungCap nhaCC;
	private HangNhap hangnhap;
	private String ngaynhap;
	private float tongtien;
	public DonNhap() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMadonnhap() {
		return madonnhap;
	}
	public void setMadonnhap(String madonnhap) {
		this.madonnhap = madonnhap;
	}
	public QuanLy getQuanly() {
		return quanly;
	}
	public void setQuanly(QuanLy quanly) {
		this.quanly = quanly;
	}
	public NhaCungCap getNhaCC() {
		return nhaCC;
	}
	public void setNhaCC(NhaCungCap nhaCC) {
		this.nhaCC = nhaCC;
	}
	public HangNhap getHangnhap() {
		return hangnhap;
	}
	public void setHangnhap(HangNhap hangnhap) {
		this.hangnhap = hangnhap;
	}
	public String getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(String ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public float getTongtien() {
		return tongtien;
	}
	public void setTongtien(float tongtien) {
		this.tongtien = tongtien;
	}
}
