package com.ninjacart.repostory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninjacart.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

    Optional<Feedback> findByUsernameAndUseremail(String uname, String uemail);

}