package org.springframework.data.gemfire.samples.helloworld.cacheable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.data.gemfire.samples.helloworld.CacheableI;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cacheable-context-test.xml")
public class CacheableTest {
	
	@Autowired
	CacheableI service;
	
//	@Autowired
//	@Qualifier("books")
//	ConcurrentMapCache cache;
	
	@Autowired
	CacheManager manager;
	
	@Test
	public void invoke(){
		service.invoke();
		
	}
}
