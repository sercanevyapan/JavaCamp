package dorduncugunOdev3.Concrete;

import dorduncugunOdev3.Abstract.CampaignService;
import dorduncugunOdev3.Entities.Admin;
import dorduncugunOdev3.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign, Admin admin) {
		System.out.println(admin.getFirstName()+" " +admin.getLastName()+" admini "+campaign.getName()+" adl� kapmanyay� eklendi.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign, Admin admin) {
		System.out.println(admin.getFirstName()+" " +admin.getLastName()+" admini "+campaign.getName()+" adl� kapmanyay� g�ncelledi.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign, Admin admin) {
		System.out.println(admin.getFirstName()+" " +admin.getLastName()+" admini "+campaign.getName()+" adl� kapmanyay� sildi.");
		
	}
	
	

}
