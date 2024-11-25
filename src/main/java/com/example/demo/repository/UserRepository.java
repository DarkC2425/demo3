package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;

@Repository
public interface UserRepository {
	@Query("SELECT u FROM Users u WHERE u.username = :username")
	public Users getUserByUsername(@Param("username") String username);

	Optional<Users> findByEmail(String email);

	Optional<Users> findByUsernameOrEmail(String username, String email);

	Optional<Users> findByUsername(String username);

	<S extends Users> S save(S entity);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
