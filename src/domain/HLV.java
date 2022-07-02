package domain;

import java.util.Date;

public class HLV {
	private int soAo;
	private String name;
	private Date ngaySinh;
	private String chucVu;
	public HLV() {
		super();
	}
	public HLV(int soAo, String name, Date ngaySinh, String chucVu) {
		super();
		this.soAo = soAo;
		this.name = name;
		this.ngaySinh = ngaySinh;
		this.chucVu = chucVu;
	}
	public int getSoAo() {
		return soAo;
	}
	public void setSoAo(int soAo) {
		this.soAo = soAo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
}
