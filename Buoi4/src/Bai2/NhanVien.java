package Bai2;

public class NhanVien {
	private static int temp=1;
	private int Manv;
	private String Tennv;
	private int Tuoi;
	private String DiaChi;
	private String BoPhan;
	
	
	
	public NhanVien(String tennv, int tuoi, String diaChi, String boPhan) {
		Manv = temp++;
		Tennv = tennv;
		Tuoi = tuoi;
		DiaChi = diaChi;
		BoPhan = boPhan;
	}

	
	public void output() {
		System.out.printf("%-10d%-10s%-10d%-10s%-10s\n",Manv,Tennv,Tuoi,DiaChi,BoPhan);
	}

	public static void main(String[] args) {
		NhanVien NhanVienA = new NhanVien("A",23,"TH","CNTT");
		NhanVien NhanVienB = new NhanVien("B",21,"HN","QLI");
		NhanVien NhanVienC = new NhanVien("C",21,"HP","CNTT");
		NhanVien NhanVienD = new NhanVien("D",24,"QLI","CNTT");
		NhanVien NhanVienE = new NhanVien("E",25,"HN","QLI");
		
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Manv","Tennv","Tuoi","DiaChi","BoPhan");
		NhanVienA.output();
		NhanVienB.output();
		NhanVienC.output();
		NhanVienD.output();
		NhanVienE.output();
	}
}
