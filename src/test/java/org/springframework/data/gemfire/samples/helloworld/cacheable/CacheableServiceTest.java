package org.springframework.data.gemfire.samples.helloworld.cacheable;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.gemfire.samples.helloworld.CacheableI;
import org.springframework.stereotype.Component;


@Component
@Cacheable(value="books", key="#root.target	")
public class CacheableServiceTest implements CacheableI {

	public String invoke(){
		return "invoked";
	}
	
	public String invokeAgain(){
		return "invoked";
	}	
}
