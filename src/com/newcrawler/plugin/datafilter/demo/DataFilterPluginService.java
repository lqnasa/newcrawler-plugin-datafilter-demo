package com.newcrawler.plugin.datafilter.demo;

import java.util.Map;

import com.soso.plugin.bo.DataFilterPluginBo;

public class DataFilterPluginService implements com.soso.plugin.DataFilterPlugin{

	@Override
	public String execute(final DataFilterPluginBo dataFilterPluginBo) {
		Map<String, String> properties=dataFilterPluginBo.getProperties();
		final String value=dataFilterPluginBo.getValue();
		final Map<String, String> vMap=dataFilterPluginBo.getvMap();
		
		return "数据过滤插件-DEMO.";
	}

}
