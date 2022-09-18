package vertipleri;

import javax.sound.midi.Soundbank;

public class veritipi {
	public static void main(String[] args) {
		
		// -128 ve 127 arasınde değerleri alır. 1 byte
		
		byte sayi = 125;
		
		System.out.println(sayi);
		
		// -32768 ve 32767 arasında değerler alır. 2 byte
		
		short sayi1 = 32765;
				
		System.out.println(sayi1);
		
		// 9 Basamağa kadar çıkabilen değerler alır. 4 Byte
		
		int sayi2 = 545636743;
		
		System.out.println(sayi2);
		
		// çok büyük sayılar için. 8 Byte
		
		long maxDeger = Long.MAX_VALUE; // Long veri tipinin alabileceği en yüksek sayıyı alır.
		long minDeger = Long.MIN_VALUE; // long veri tipinin alabileceği en düşük sayıyı alır.
		
		System.out.println(maxDeger);
		System.out.println(minDeger);
		
		long sayi3 = 4534343473543L; // Long veri tipinde değer tanımlamak için sonuna L eklenmeli
		System.out.println(sayi3);
		
		//ondalıklı sayı tanımlamak için kullanılır .'dan sonra 7 basamağa kadar çıkar 4 byte
		
		float maxDeger1 = Float.MAX_VALUE;
		float minDeger1 = Float.MIN_VALUE;
		
		System.out.println(maxDeger1);
		System.out.println(minDeger1);
		
		float sayi4 = 16.75454f;
		
		System.out.println(sayi4);
		
		//ondalıklı sayı tanımlamak için kullanılır .'dan sonra 17 basamağa kadar çıkar 8 Byte
		
		double sayi5 = 16.65465465465465;
		
		System.out.println(sayi5);
		
		boolean sonuc = true; // sadece true veya false değerleri alabilir.
		//ornak
		boolean sonuc1 = 5>2;
		
		System.out.println(sonuc1);
		
		//tek bir karekter tanımlamak için tek tırnaklar içinde tutulur.
		
		char karakter =  '?';
		System.out.println(karakter);
		char karakter1 = 33; //ASCII kodları ilede kullanılabilir.
		System.out.println(karakter1);
		
		// metinsel ifadeleri tutmak için kullanılan veri tipi
		
		String metin = "Mustafa Coban" +" Anadolu University";
		System.out.println(metin);
		
	}

}
