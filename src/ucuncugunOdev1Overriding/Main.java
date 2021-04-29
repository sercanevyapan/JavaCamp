package ucuncugunOdev1Overriding;

public class Main {

	public static void main(String[] args) {

		BaseKerdiManager[] krediManagers= new BaseKerdiManager[] { new OgretmenKrediManager(),
				new TarimKrediManager(),new OgrenciKrediManager() };

		for (BaseKerdiManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}

	}

}
