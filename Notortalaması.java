import java.util.Scanner;
public class Notortalamasý {
	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,tarih,muzik;
		Scanner input= new Scanner(System.in);
		
		System.out.print("matematik notunu giriniz:");
		mat = input.nextInt();
		
		System.out.print("fizik notunu giriniz:");
		fizik = input.nextInt();
		
		System.out.print("kimya notunu giriniz:");
		kimya = input.nextInt();
		
		System.out.print("türkçe notunu giriniz:");
		turkce = input.nextInt();
		
		System.out.print("tarih notunu giriniz:");
		tarih = input.nextInt();
		
		System.out.print("müzik notunu giriniz:");
		muzik = input.nextInt();
		
		int toplam= (mat+fizik+kimya+turkce+tarih+muzik);
		double ortalama=(toplam/6.00);
		System.out.println("ortalama notunuz:"+ortalama);
		
		boolean sonuc=(ortalama<60);
		String str=(sonuc)? "Sinifta Kaldi":"Sinifi Geçti";
		System.out.println(str);
		
	}
	
	

}
