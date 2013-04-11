package org.springframework.data.gemfire.samples.helloworld.cacheable;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InvokeWatch {
	
	  @Around("execution (* org.springframework.cache.Cache.put(..))")
	  public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
	    // start stopwatch
	    Object retVal = pjp.proceed();
	    
	    System.out.println(pjp.getSignature());
	    
	    for(Object o : pjp.getArgs()){
	    	System.out.println(o);
	    }
	    // stop stopwatch
	    return retVal;
	  }
}
