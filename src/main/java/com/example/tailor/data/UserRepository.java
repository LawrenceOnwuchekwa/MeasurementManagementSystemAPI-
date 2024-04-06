package com.example.tailor.data;

import com.example.tailor.models.SignUp;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<SignUp,Integer> {

    @Query("SELECT u FROM  u WHERE SignUp u.username = :username")
    Optional<SignUp> findUserByUsername(String username);
}
