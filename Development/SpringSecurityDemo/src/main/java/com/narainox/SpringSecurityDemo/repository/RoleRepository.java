package com.narainox.SpringSecurityDemo.repository;

import com.narainox.SpringSecurityDemo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
