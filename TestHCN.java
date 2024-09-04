package huyenTran_23664731;

public class TestHCN {
	public static void inTD () {
		for (int i = 0; i < 45; i++) {
			System.out.printf("-");	
		}
		System.out.println( );
		System.out.printf("|%10s|%10s|%10s|%10s|","Chieu Dai","Chieu Rong","Chu Vi","Dien Tich");
		System.out.println( );
		for (int i = 0; i < 45; i++) {
			System.out.printf("-");	
		}
		System.out.println( );
	}
	
	public static void main(String [] args) {
		//Khoi tao h1 HCn
		HinhChuNhat h1 = new HinhChuNhat();
		h1.setChieuDai(10);
		h1.setChieuRong(5);
		inTD();
		System.out.println(h1.toString());
		for (int i = 0; i < 45; i++) {
			System.out.printf("-");	
		}
	}
	
}
