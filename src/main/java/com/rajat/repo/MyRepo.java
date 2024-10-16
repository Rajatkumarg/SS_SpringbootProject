package com.rajat.repo;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepo {

	public MyRepo() {
		System.out.println("Repo bean created");
	}
}
