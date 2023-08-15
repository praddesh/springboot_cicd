package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welome to CICD using gitacions";
	}

}

/*
63  git add src
64  git add pom.xml
65  git status
66  git commit -m "inital code changes"
67  git branch -M master
68  git remote add origin https://github.com/praddesh/springboot_cicd.git
69  git push -u origin master
70  git pull
71  git log
72  ls
73  git pull --rebase origin

*/
