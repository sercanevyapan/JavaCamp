package dorduncugunOdev3.Concrete;

import dorduncugunOdev3.Abstract.CampaignService;
import dorduncugunOdev3.Entities.Admin;
import dorduncugunOdev3.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign, Admin admin) {
		System.out.println(admin.getFirstName()+" " +admin.getLastName()+" admini "+campaign.getName()+" adlý kapmanyayý eklendi.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign, Admin admin) {
		System.out.println(admin.getFirstName()+" " +admin.getLastName()+" admini "+campaign.getName()+" adlý kapmanyayý güncelledi.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign, Admin admin) {
		System.out.println(admin.getFirstName()+" " +admin.getLastName()+" admini "+campaign.getName()+" adlý kapmanyayý sildi.");
		
	}
	
	

}
