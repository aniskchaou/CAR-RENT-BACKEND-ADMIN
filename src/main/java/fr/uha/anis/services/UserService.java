package fr.uha.anis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.uha.anis.models.user.Userss;
import fr.uha.anis.repositories.UserRepository;
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	public void save(Userss user)
	{
		userRepository.save(user);
	}
}
