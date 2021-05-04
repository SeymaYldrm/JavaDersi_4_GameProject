package Business.Concrete;

import Business.Abstract.GameService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun sepetinize eklendi! : " + game.getGameName() + " - " + game.getUnitPrice());
	}

	@Override
	public void update(Game game) {
		System.out.println("Sepetinize Eklenen Oyun G�ncellendi! : " + game.getGameName());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun sepetinizden silindi! : " + game.getGameName());
	}

	@Override
	public void sell(Game game, User user) {
		System.out.println( user.getFirstName() + " " + user.getLastName()
		+ " Kullan�c�s� " + game.getGameName() + " Oyununu " 
		+ game.getUnitPrice() + " TL Sat�n Ald�."); 
	}

	@Override
	public void sellWithCampaign(Game game, User user, Campaign campaign) {
		double newPrice = game.getUnitPrice() - campaign.getDiscountRate();
		
		System.out.println( user.getFirstName() + " " + user.getLastName()
		+ " Kullan�c�s� " + game.getGameName() + " Oyununu " + campaign.getName() 
		+ " Kampanyas�ndan Sayesinde " + game.getUnitPrice()
		+ " Yerine " + newPrice 
		+ " TL Sat�n Ald�. Haydi Sende Bu Kampanya' dan Yararlan !!"); 
	}

}
