package dorduncugunOdev1StaticDemo;

public class ProductValidator {
	
	static{
		System.out.println("Static yap�c� blok �al��t�");
	}
	
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void bisey() {
		
	}
}

