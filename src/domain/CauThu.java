package domain;

import java.util.Date;

public class CauThu {
	private int soAo;
	private String name;
	private Date ngaysinh;
	private String viTri;
	public CauThu() {
		super();
	}
	public CauThu(int soAo, String name, Date ngaysinh, String viTri) {
		super();
		this.soAo = soAo;
		this.name = name;
		this.ngaysinh = ngaysinh;
		this.viTri = viTri;
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
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getViTri() {
		return viTri;
	}
	public void setViTri(String viTri) {
		this.viTri = viTri;
	}
}
