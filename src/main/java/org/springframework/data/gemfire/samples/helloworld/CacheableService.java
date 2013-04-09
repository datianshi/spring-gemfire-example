package org.springframework.data.gemfire.samples.helloworld;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.gemfire.samples.domain.CustomObject;
import org.springframework.stereotype.Component;

@Component
public class CacheableService {
	
	@Cacheable("myWorld")
	public String findCustomObject(){
		System.out.println("Cacheable Execution");
		return "Key is 0";
	}
	
	@Cacheable("myWorld")
	public String findCustomObject(String key){
		System.out.println("Cacheable Execution");
		return "Key is " + key;
	}
	
	@Cacheable(value="myWorld", key="#argument")
	public String findCustomObject(String key, String argument){
		System.out.println("Cacheable Execution");
		return "Key is " + argument;
	}	
}
