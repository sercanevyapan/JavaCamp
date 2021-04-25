package birincigunOdev3;


public class Main {

	public static void main(String[] args) {
		
		double sayi = 12.5;
		sayi =-129;
		char karakter ='A';
		boolean dogruMu=false;
		
		int sayi1 =24;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk =sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En b�y�k ="+ enBuyuk);
		
		
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel : Ge�tiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("�yi : Ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena De�il : Ge�tiniz");
			break;
		case 'F':
			System.out.println("Malesef : Kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz not girdiniz");
		}
		
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For D�ng�s� Bitti");
		
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While D�ng�s� Bitti");
		
		int j = 100;
		do {
			System.out.println(j);
			
			j += 2;
		} while (j < 10);
		System.out.println("Do-While D�ng�s� Bitti");
		
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		// String -arrays
		// index element: [0],[1],[2]
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		
		
		double[] myList2 = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0;
		double max = myList2[0];

		for (double number : myList2) {
			if (max < number) {
				max = number;
			}

			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En B�y�k = " + max);
		
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Eski�ehir";
		sehirler[1][2] = "Nev�ehir";
		sehirler[2][0] = "Mu�la";
		sehirler[2][1] = "Antalya";
		sehirler[2][2] = "Ayd�n";

		// navigating the rows
		for (int k = 0; k <= 2; k++) {
			System.out.println("-----------------------");
			
			for (int l = 0; l <= 2; l++) {
				System.out.println(sehirler[k][l]);
			}
		}
		
		
		String message = "Bug�n hava �ok g�zel.";
		System.out.println(message);
		
		System.out.println("Eleman say�s� : " + message.length());
		System.out.println("5. eleman : " + message.charAt(4));
		System.out.println(message.concat(" Ya�as�n!"));
		System.out.println(message);
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("."));
		char[] karakterler = new char[5];
		message.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(message.indexOf('a'));
		System.out.println(message.indexOf("av"));
		System.out.println(message.lastIndexOf("a"));
		System.out.println(message.replace(' ', '-'));
		System.out.println(message);
		System.out.println(message.substring(2));
		System.out.println(message.substring(2, 5));
		
		for (String kelime : message.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());

		int number = 2;
		int remainder = number % 2;
		System.out.println(remainder + ": remainder");
		boolean isPrime = true; 

	
		if (number == 1) {
			System.out.println(number + " : Say� asal de�ildir");
			return; 

		} else if (number < 1) {
			System.out.println(number + ": Ge�ersiz sayi");
		} else {
			System.out.println(number + ": Sayi asaldir.");
		}

		for (int v = 2; v < number; v++) {

			if (number % v == 0) {
				isPrime = false;
			}

		}
		
		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("kal�n sesli harf");
			break;
		default:
			System.out.println("�nce sesli harf");
		}
		
		int number1 = 5;
		int total1 = 0;

		for (int z = 1; z < number1; z++) { // D�ng�ye 1 den ba�la.
			if (number1 % z == 0) {
				total1 = total1 + z; // toplam de�i�kenine k de�erini ata.
			}
		}
		// e�er girilen say� d�ng�deki b�l�mlerin toplam�na e�itse
		if (total1 == number1) {
			System.out.println(number1 + " : The number is Perfect");
		} else {
			System.out.println(number1 + " : The number is not Perfect");
		}
		
		int friendnumber1 = 220;
		int friendnumber2 = 284;
		int toplamFriendNumber1 = 0;
		int toplamFriendNumber2 = 0;

		
		for (int m = 1; m < friendnumber1; m++) {
			if (friendnumber1 % m == 0) {
				toplamFriendNumber1 = toplamFriendNumber1 + m;
			}
		}

		for (int m = 1; m < friendnumber2; m++) {
			if (friendnumber2 % m == 0) {
				toplamFriendNumber2 = toplamFriendNumber2 + m;
			}
		}

		if (friendnumber1 == toplamFriendNumber1 && friendnumber2 == toplamFriendNumber2) {
			System.out.println( "bu iki say� arkada�t�r.");
		} else {
			System.out.println("bu iki say� arkada� de�ildir.");
		}

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false; 

		for (int findNumber : sayilar) {
			if (findNumber == aranacak) {
				varMi = true;
				break;
			}

		}
		if (varMi) {
			System.out.println("Sayi mevcuttur.");
		} else {
			System.out.println("Sayi mevcut de�ildir.");
		}

	}

}

