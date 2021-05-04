package Business.Concrete;

import Business.Abstract.UserCheckService;
import Business.Abstract.UserService;
import Entities.Concrete.User;

public class UserManager implements UserService {
	
	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if (userCheckService.checkIfPersonReal(user)) {
			System.out.println("Giri� Ba�ar�l�.. " + user.getFirstName() + " " + user.getLastName() +
					"  Sisteme ho� geldiniz");
		}
		else {
			System.out.println("Hata! Kullan�c� eklenmedi");
		}
		
	}

	@Override
	public void update(User user) {
		if (userCheckService.checkIfPersonReal(user)) {
			System.out.println("G�ncelleme Ba�ar�l�.. " + user.getFirstName() 
			+ " " + user.getLastName() + "  Kullan�c� G�ncellendi");
		}
		else {
			System.out.println("Hata! Kullan�c� G�ncellenemedi");
		}
	}

	@Override
	public void delete(User user) {
		if (userCheckService.checkIfPersonReal(user)) {
			System.out.println("Silinme ��lemi Ba�ar�l�.. " + user.getFirstName() 
			+ " " + user.getLastName() + "  Kullan�c� Silindi");
		}
		else {
			System.out.println("Hata! Kullan�c� Silinemedi");
		}
		
	}

}
