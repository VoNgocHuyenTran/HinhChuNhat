package huyenTran_23664731;

import javax.swing.plaf.basic.BasicToolBarSeparatorUI;

public class HinhChuNhat {
	
	//khai bao cac thuoc tinh
	private double chieuDai;
	private double chieuRong;

	// dong goi
	public double getChieuDai() {
		return chieuDai;
	}
	// rang buoc
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai = d;
		} else {
		 System.out.println(" loi d");

		}
		
	}
	public double getChieuRong() {
		return chieuRong;
	}
	
	public void setChieuRong(double r) {
		if (r<=0) {
			System.out.println(" loi r");
			
		} else {
			this.chieuRong = r;

		}
		
	}  //  contructor (ham tao) dung khoi tao doi tuong (new)
	public HinhChuNhat () {}
	public HinhChuNhat(double d, double r) {
		if (d>0) {
			this.chieuDai = d;
		} else {
		 System.out.println(" loi d");

		}
		if (r<=0) {
			System.out.println(" loi r");
			
		} else {
			this.chieuRong = r;

		}
		
		
	}
	// Phuong thuc
	public double getCV() {
		return (getChieuDai()*getChieuRong())*2;
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
		
	}
	// tao mau in toString
	public String toString() {
		String s = "";
		s = s + s.format("|%10s|%10s|%10s|%10s|",getChieuDai(),getChieuRong(),getCV(),getDienTich());
	return s;
	
	 }
	
	}
