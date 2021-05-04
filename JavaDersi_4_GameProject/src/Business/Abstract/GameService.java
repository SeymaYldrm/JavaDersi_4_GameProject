package Business.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public interface GameService extends BaseService<Game> {
	
	public void sell(Game game, User user);

	public void sellWithCampaign(Game game, User user, Campaign campaign);
}
