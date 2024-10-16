package com.rajat.runners;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ApplicationRunner executed");
		Set<String> keys = args.getOptionNames();
		System.out.println("pair length "+keys.size());
		for(String key: keys) {
			System.out.println(key+" : "+args.getOptionValues(key));
		}
	}

}
