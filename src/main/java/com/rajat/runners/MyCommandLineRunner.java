package com.rajat.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunner executed");
		System.out.println("CommandLineRunner length "+args.length);
		for(String arg: args) {
			System.out.println(arg);
		}
	}

	
}
