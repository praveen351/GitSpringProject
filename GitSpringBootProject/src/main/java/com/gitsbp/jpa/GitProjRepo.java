package com.gitsbp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gitsbp.model.GitSpringdata;

@Repository
public interface GitProjRepo extends JpaRepository<GitSpringdata, Long> {
	
}
