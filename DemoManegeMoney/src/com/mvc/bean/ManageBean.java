package com.mvc.bean;

import java.util.Date;

public class ManageBean {
	private String loai_tc, ten_tc, so_tien, nguoisua;
	private Date ngay_sua;
	private String ngay_tao;
	private int ID;
	private String nguoi_tao;
	private String userName;
	private String mo_ta;

	
	
	public String getMo_ta() {
		return mo_ta;
	}
	public void setMo_ta(String mo_ta) {
		this.mo_ta = mo_ta;
	}
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
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
	
	
	

	public Date getNgay_sua() {
		return ngay_sua;
	}
	public void setNgay_sua(Date ngay_sua) {
		this.ngay_sua = ngay_sua;
	}

	
	
	public String getNgay_tao() {
		return ngay_tao;
	}
	public void setNgay_tao(String date) {
		this.ngay_tao = date;
	}

	
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

	
	
	
	public String getNguoi_tao() {
		return nguoi_tao;
	}
	public void setNguoi_tao(String nguoi_tao) {
		this.nguoi_tao = nguoi_tao;
	}

}
