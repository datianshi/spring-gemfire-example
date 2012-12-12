package org.springframework.data.gemfire.samples.helloworld;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.gemstone.gemfire.cache.CacheLoader;
import com.gemstone.gemfire.cache.CacheLoaderException;
import com.gemstone.gemfire.cache.LoaderHelper;

public class CacheLoaderImpl implements CacheLoader<String, String>{
	
	private static final Log log = LogFactory.getLog(CacheLoaderImpl.class);

	Map<String, String> map;
	
	public CacheLoaderImpl(Map<String, String> map) {
		super();
		this.map = map;
	}

	@Override
	public void close() {
		
	}

	@Override
	public String load(LoaderHelper<String, String> arg0)
			throws CacheLoaderException {
		log.info("Load the cache from external asset");
		return map.get(arg0.getKey());
		
	}

}
