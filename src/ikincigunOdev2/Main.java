package ikincigunOdev2;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		
		///////////////////////////
		
		String mesaj = "Bugün hava çok güzel";
		String yenimesaj = sehirVer();
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(2, 3, 4);
		System.out.println(toplam);
		
		
		/////////////////////////////
		
		
		Product product = new Product(1,"Laptop","Asus Laptop",5000,3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		

	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 4, 5, 6 };
		int aranacak = 6;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayi mevcuttur" + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayi mevcuttur deðildir" + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}
	
	//////////////////////////////////////
	
	public static void add() {
		System.out.println("Eklendi.");
	}

	public static void delete() {
		System.out.println("Silindi.");
	}

	public static void update() {
		System.out.println("Güncellendi.");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}
	
	

	
	

}
