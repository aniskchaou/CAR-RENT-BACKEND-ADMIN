package fr.uha.anis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.uha.anis.models.user.User;
import fr.uha.anis.models.user.UserPrincipal;
import fr.uha.anis.repositories.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUsername(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("user not found !");
		}
		return new UserPrincipal(user);
	}

}
