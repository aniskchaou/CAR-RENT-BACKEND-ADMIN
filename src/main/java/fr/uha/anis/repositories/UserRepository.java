package fr.uha.anis.repositories;

import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uha.anis.models.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  User findByUsername(String username);
}
