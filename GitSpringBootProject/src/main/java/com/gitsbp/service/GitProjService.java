package com.gitsbp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gitsbp.jpa.GitProjRepo;
import com.gitsbp.model.GitSpringdata;

@Service
public class GitProjService {

	@Autowired
	private GitProjRepo gitprojrepo;

	public GitSpringdata saveGitProjData(GitSpringdata gitdpringdata) {
		GitSpringdata gitSpringdata = gitprojrepo.save(gitdpringdata);
		return gitSpringdata;
	}
}
