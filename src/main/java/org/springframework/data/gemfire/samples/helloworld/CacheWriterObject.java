package org.springframework.data.gemfire.samples.helloworld;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.gemfire.samples.domain.CustomObject;

import com.gemstone.gemfire.cache.CacheWriter;
import com.gemstone.gemfire.cache.CacheWriterException;
import com.gemstone.gemfire.cache.EntryEvent;
import com.gemstone.gemfire.cache.RegionEvent;

public class CacheWriterObject implements CacheWriter<String, CustomObject>{

	private static final Log log = LogFactory.getLog(CacheWriterObject.class);

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeCreate(EntryEvent<String, CustomObject> arg0)
			throws CacheWriterException {
		log.info("Object logger "+ arg0.getKey() + " " + arg0.getNewValue());
		
	}

	@Override
	public void beforeDestroy(EntryEvent<String, CustomObject> arg0)
			throws CacheWriterException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeRegionClear(RegionEvent<String, CustomObject> arg0)
			throws CacheWriterException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeRegionDestroy(RegionEvent<String, CustomObject> arg0)
			throws CacheWriterException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeUpdate(EntryEvent<String, CustomObject> arg0)
			throws CacheWriterException {
		// TODO Auto-generated method stub
		
	}
	

}
