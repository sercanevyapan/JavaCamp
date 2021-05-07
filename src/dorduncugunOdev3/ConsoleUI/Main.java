package dorduncugunOdev3.ConsoleUI;

import java.util.Date;

import dorduncugunOdev3.Abstract.BaseUserManager;
import dorduncugunOdev3.Adapters.MernisServiceAdapter;
import dorduncugunOdev3.Concrete.CampaignManager;
import dorduncugunOdev3.Concrete.GameManager;
import dorduncugunOdev3.Concrete.SaleManager;
import dorduncugunOdev3.Concrete.UserManager;
import dorduncugunOdev3.Entities.Admin;
import dorduncugunOdev3.Entities.Campaign;
import dorduncugunOdev3.Entities.Game;
import dorduncugunOdev3.Entities.User;

public class Main {

	public static void main(String[] args) {
		
		BaseUserManager userManager = new UserManager(new MernisServiceAdapter());
		User user = new User(1,"Sercan","Evyapan","29680770874",new Date(1983,11,25));
		userManager.register(user);
	
		Game game = new Game(1,"Counter Strike",25);
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "ÖzelKampanya");
		Admin admin= new Admin(1,"AdminFirstName","AdminLastName","29680770874",new Date(1990,5,15),"admindepartment","admindeposition");
		campaignManager.addCampaign(campaign, admin);
		
		
		SaleManager saleManager = new SaleManager(campaign);
		saleManager.saleGame(game, user);
		

	}

}
