package org.springframework.data.gemfire.samples.helloworld;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;

@Component
public class CacheEvictService {
	
	@CacheEvict(value="myWorld")
	public void cacheEvict(String key){
		System.out.println("Evict Execution");
	}
}
