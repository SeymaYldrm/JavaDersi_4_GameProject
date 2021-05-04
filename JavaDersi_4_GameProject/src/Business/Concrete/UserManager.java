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
			System.out.println("Giriþ Baþarýlý.. " + user.getFirstName() + " " + user.getLastName() +
					"  Sisteme hoþ geldiniz");
		}
		else {
			System.out.println("Hata! Kullanýcý eklenmedi");
		}
		
	}

	@Override
	public void update(User user) {
		if (userCheckService.checkIfPersonReal(user)) {
			System.out.println("Güncelleme Baþarýlý.. " + user.getFirstName() 
			+ " " + user.getLastName() + "  Kullanýcý Güncellendi");
		}
		else {
			System.out.println("Hata! Kullanýcý Güncellenemedi");
		}
	}

	@Override
	public void delete(User user) {
		if (userCheckService.checkIfPersonReal(user)) {
			System.out.println("Silinme Ýþlemi Baþarýlý.. " + user.getFirstName() 
			+ " " + user.getLastName() + "  Kullanýcý Silindi");
		}
		else {
			System.out.println("Hata! Kullanýcý Silinemedi");
		}
		
	}

}
