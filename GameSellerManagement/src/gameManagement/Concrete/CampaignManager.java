package gameManagement.Concrete;

import gameManagement.Abstract.CampaignService;
import gameManagement.Entites.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Added " + campaign.getGameId() + " in " + campaign.getCampaignName());
		System.out.println("Campaign Price : " + campaign.getUnitPriceAfterDiscountRate());
		
	}


	@Override
	public void delete(Campaign campaign) {
		System.out.println("Delete " +  campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Update " +  campaign.getCampaignName());
		System.out.println("Campaign Price : " + campaign.getUnitPriceAfterDiscountRate());
	}

	


}
