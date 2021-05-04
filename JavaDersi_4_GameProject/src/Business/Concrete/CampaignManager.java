package Business.Concrete;

import Business.Abstract.CampaignService;
import Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanyas� Ba�lad�.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanyas� G�ncellendi.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanyas�n�n S�resi Doldu.");
	}
}
