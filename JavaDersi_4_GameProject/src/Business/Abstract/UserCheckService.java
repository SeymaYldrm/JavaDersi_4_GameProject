package Business.Abstract;

import Entities.Concrete.User;

public interface UserCheckService  {
	public boolean checkIfPersonReal(User user);
}
