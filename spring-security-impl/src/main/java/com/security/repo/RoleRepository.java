package com.security.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.model.Role;
import com.security.model.RoleName;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByrolename(RoleName roleName);

}
