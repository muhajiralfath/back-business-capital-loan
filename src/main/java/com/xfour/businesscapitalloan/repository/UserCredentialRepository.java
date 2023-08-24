package com.xfour.businesscapitalloan.repository;

import com.xfour.businesscapitalloan.entity.UserCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserCredentialRepository extends JpaRepository<UserCredential, String> {
    Optional<UserCredential> findFirstByEmail(String email);
}
