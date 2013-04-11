/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.data.gemfire.samples.helloworld;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.gemfire.GemfireTemplate;
import org.springframework.data.gemfire.samples.domain.CustomObject;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app-client-context.xml")
public class BasicTest {
	
	@Autowired
	@Qualifier("stringRegion")
	GemfireTemplate strRegion;
	
	@Autowired
	@Qualifier("objectRegion")
	GemfireTemplate objectRegion;	

	@Test
	public void testBasic() throws Exception {
		//Main.main(new String[] {});
		
		System.out.println(strRegion.get("nihao"));
	}
	
	@Test
	public void testPdx() throws Exception {
		//Main.main(new String[] {});
		objectRegion.put("Shaozhen", new CustomObject("Shaozhen", "Ding"));
		
		System.out.println(objectRegion.get("Shaozhen").getClass().getName());
	}	
}

