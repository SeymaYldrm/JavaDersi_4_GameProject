package ConsoleUI;

import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.UserCheckManager;
import Business.Concrete.UserManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public class Main {

	public static void main(String[] args) {
		User seyma = new User(1,"Şeyma","Yıldırım",1996,"123456789");
		User rumeysa = new User(2,"Rümeysa","Akdoğan",1998,"123456");
		User bahar = new User(3,"Bahar","Kalkan",2000,"1234");
		
		UserManager userManager = new UserManager(new UserCheckManager());
		userManager.add(seyma);
		userManager.add(rumeysa);
		userManager.update(seyma);
		userManager.delete(rumeysa);
		userManager.add(bahar);
		
		System.out.println("\n************************************");
		
		Campaign annelerGunuKampanyası = new Campaign(1,"Anneler Günü",60);
		Campaign baharKampanyası = new Campaign(2,"Bahar",50);
		Campaign yeniSezonKampanyası = new Campaign(3,"Yeni Sezon",45);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.delete(annelerGunuKampanyası);
		campaignManager.update(baharKampanyası);
		campaignManager.add(yeniSezonKampanyası);
		
		System.out.println("\n************************************");
		
		Game pubgMobile = new Game(1,"PUBG Mobile",100);
		Game callOfDuty = new Game(2,"Call of Duty",500);
		Game valorant = new Game(3,"Valorant",300);
		
		GameManager gameManager = new GameManager();
		gameManager.add(valorant);
		gameManager.delete(pubgMobile);
		gameManager.update(callOfDuty);
		
		System.out.println("\n************************************");
		
		gameManager.sell(valorant, seyma);
		gameManager.sell(callOfDuty, bahar);
		
		System.out.println("\n************************************");
		
		gameManager.sellWithCampaign(valorant, seyma, baharKampanyası);
		gameManager.sellWithCampaign(pubgMobile, rumeysa, yeniSezonKampanyası);
	}

}
