package delta.dev.software.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import delta.dev.software.models.user.UserPrincipal;
import delta.dev.software.models.user.Userss;
import delta.dev.software.repositories.UserRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class MyUserDetailService implements UserDetailsService {

	/**
	 * userRepository
	 */
	@Autowired
	UserRepository userRepository;
	
	/**
	 * loadUserByUsername
	 * @param username
	 * @return UserDetails
	 * @throws UsernameNotFoundException
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Userss user=userRepository.findByUsername(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("user not found !");
		}
		return new UserPrincipal(user);
	}

}
