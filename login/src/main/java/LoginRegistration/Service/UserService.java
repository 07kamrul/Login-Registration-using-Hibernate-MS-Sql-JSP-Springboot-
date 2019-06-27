package LoginRegistration.Service;

import LoginRegistration.Model.User;

public interface UserService {
	public User findByEmail(String email);
	public void saveUser(User user);
}
