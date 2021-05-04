package Business.Concrete;

import Business.Abstract.UserCheckService;
import Entities.Concrete.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfPersonReal(User user) {
		if(!user.getNationalityId().isEmpty() && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
