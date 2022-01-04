package model;

import java.util.List;

public class GioHang {

	private int id;
	private List<HangDat> hangdat;	
	public GioHang() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<HangDat> getHangdat() {
		return hangdat;
	}
	public void setHangdat(List<HangDat> hangdat) {
		this.hangdat = hangdat;
	}
	public float getTongtien() {
		return tongtien;
	}
	public void setTongtien(float tongtien) {
		this.tongtien = tongtien;
	}
	private float tongtien;
}
