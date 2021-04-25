package ikincigunOdev2;

public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount) {
		System.out.println("Yapıcı blok çalıştı");
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.description = description;
		this.stockAmount = stockAmount;
		this.price = price;

	}

	public Product() {

	}

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;

	}

	private String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	private String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	private int getStockAmount() {
		return stockAmount;
	}

	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	private double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	private String getKod() {
		return kod;
	}

	private void setKod(String kod) {
		this.kod = kod;
	}

	private String getRenk() {
		return renk;
	}

	private void setRenk(String renk) {
		this.renk = renk;
	}

}
