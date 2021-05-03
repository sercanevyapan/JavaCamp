package dorduncugunOdev3.Abstract;

import dorduncugunOdev3.Entities.Admin;
import dorduncugunOdev3.Entities.Campaign;

public interface CampaignService {

	void addCampaign(Campaign campaign, Admin admin);

	void updateCampaign(Campaign campaign, Admin admin);

	void deleteCampaign(Campaign campaign, Admin admin);

}
