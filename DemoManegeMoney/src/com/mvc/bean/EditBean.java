package com.mvc.bean;

import java.util.Date;

public class EditBean {
	private String loai_tc, ten_tc, so_tien, nguoisua,id;
	
	private Date ngay_sua;//, ngay_tao;
	private int  nguoi_tao;
	private String ngay_tao;
	public String getLoai_tc() {
		return loai_tc;
	}
	public void setLoai_tc(String loai_tc) {
		this.loai_tc = loai_tc;
	}
	public String getTen_tc() {
		return ten_tc;
	}
	public void setTen_tc(String ten_tc) {
		this.ten_tc = ten_tc;
	}
	public String getSo_tien() {
		return so_tien;
	}
	public void setSo_tien(String so_tien) {
		this.so_tien = so_tien;
	}
	public String getNguoisua() {
		return nguoisua;
	}
	public void setNguoisua(String nguoisua) {
		this.nguoisua = nguoisua;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getNgay_sua() {
		return ngay_sua;
	}
	public void setNgay_sua(Date ngay_sua) {
		this.ngay_sua = ngay_sua;
	}
	public int getNguoi_tao() {
		return nguoi_tao;
	}
	public void setNguoi_tao(int nguoi_tao) {
		this.nguoi_tao = nguoi_tao;
	}
	public String getNgay_tao() {
		return ngay_tao;
	}
	public void setNgay_tao(String ngay_tao) {
		this.ngay_tao = ngay_tao;
	}
}