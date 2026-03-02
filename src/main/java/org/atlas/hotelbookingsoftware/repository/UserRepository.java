package org.atlas.hotelbookingsoftware.repository;

import org.atlas.hotelbookingsoftware.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
