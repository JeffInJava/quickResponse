package controller;

public class Qr {
	public static final String QR_STATUS="123";
	public static void main(String[] args) {
		String str[] = {"aa","bb","cc"};
		for(String s:str){
			System.out.println(s);
			if("bb".equals(s)){
				System.out.println("---------");
				System.out.println(QR_STATUS);
			}
		}
	}
}
