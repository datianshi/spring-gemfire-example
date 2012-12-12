package org.springframework.data.gemfire.samples.helloworld;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.gemstone.gemfire.cache.CacheWriter;
import com.gemstone.gemfire.cache.CacheWriterException;
import com.gemstone.gemfire.cache.EntryEvent;
import com.gemstone.gemfire.cache.RegionEvent;

public class CacheWriterImpl implements CacheWriter<String, String>{

	private static final Log log = LogFactory.getLog(CacheWriterImpl.class);
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeCreate(EntryEvent<String, String> arg0)
			throws CacheWriterException {
		// TODO Auto-generated method stub
		log.info("Writer before create");
		
	}

	@Override
	public void beforeDestroy(EntryEvent<String, String> arg0)
			throws CacheWriterException {
		// TODO Auto-generated method stub
		log.info("Writer before destroy");
	}

	@Override
	public void beforeRegionClear(RegionEvent<String, String> arg0)
			throws CacheWriterException {
		// TODO Auto-generated method stub
		log.info("Region before clear");
	}

	@Override
	public void beforeRegionDestroy(RegionEvent<String, String> arg0)
			throws CacheWriterException {
		// TODO Auto-generated method stub
		log.info("Writer before destroy");
	}

	@Override
	public void beforeUpdate(EntryEvent<String, String> arg0)
			throws CacheWriterException {
		// TODO Auto-generated method stub
		log.info("Writer before update");
	}

}
