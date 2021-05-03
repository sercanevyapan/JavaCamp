package dorduncugunOdev3.Concrete;

import dorduncugunOdev3.Abstract.SaleServices;
import dorduncugunOdev3.Entities.Campaign;
import dorduncugunOdev3.Entities.Game;
import dorduncugunOdev3.Entities.User;

public class SaleManager implements SaleServices {

	private Campaign campaign;

	public SaleManager(Campaign campaign) {

		this.campaign = campaign;
	}

	@Override
	public void saleGame(Game game, User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanýcý tarafýndan "
				+ campaign.getName() + " isimli kampanyayla " + game.getName() + " isimli oyun "+ game.getPrice()+" TL'YE "+ "satýn alýndý.");
	}

}
