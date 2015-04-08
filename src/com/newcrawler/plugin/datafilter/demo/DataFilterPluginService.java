package com.newcrawler.plugin.datafilter.demo;

import java.util.Map;

public class DataFilterPluginService implements com.soso.plugin.DataFilterPlugin{

	@Override
	public String execute(Map<String, String> properties, final String value, final Map<String, String> vMap) {
		
		return "数据过滤插件-DEMO.";
	}

}
