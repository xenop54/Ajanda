package agenda.dao;


import agenda.model.User;

public interface UserDao {
	
	public void saveUser(User user);

	public void deleteUser(User user);

	public void saveOrUpdateUser(User user);

	public User findByUsernameAndPassword(String username, String password);
	
	public User findByUsername(String username);
	
}
