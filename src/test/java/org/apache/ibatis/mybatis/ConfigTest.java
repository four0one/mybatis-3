package org.apache.ibatis.mybatis;

import org.apache.ibatis.builder.xml.XMLConfigBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.junit.Test;

import java.io.InputStream;

public class ConfigTest {

	@Test
	public void loadXMLConfigFile() throws Exception {
		String resource = "org/apache/ibatis/mybatis/MapperConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		XMLConfigBuilder builder = new XMLConfigBuilder(inputStream);
		builder.parse();

	}
}
