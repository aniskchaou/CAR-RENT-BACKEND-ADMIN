package delta.dev.software.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import delta.dev.software.models.user.Userss;
import delta.dev.software.repositories.UserRepository;
/**
 * 
 * @author Admin
 *
 */
@Service
public class UserService {

	/**
	 * userRepository
	 */
	@Autowired
	UserRepository userRepository;
	
	/**
	 * save
	 * @param user
	 */
	public void save(Userss user)
	{
		userRepository.save(user);
	}
}
