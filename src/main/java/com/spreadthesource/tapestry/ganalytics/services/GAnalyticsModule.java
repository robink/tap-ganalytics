package com.spreadthesource.tapestry.ganalytics.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.OrderedConfiguration;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.apache.tapestry5.services.MarkupRendererFilter;

import com.spreadthesource.tapestry.ganalytics.GAnalyticsConstants;

public class GAnalyticsModule {

	public static void contributeFactoryDefaults(MappedConfiguration<String, String> configuration) {
		configuration.add(GAnalyticsConstants.GANALYTICS_KEY, "");
	}

	public void contributeMarkupRenderer(OrderedConfiguration<MarkupRendererFilter> configuration,
			@Symbol(SymbolConstants.PRODUCTION_MODE) final boolean productionMode) {

		if (productionMode) {
			configuration.addInstance("GAnalyticsScript", GAnalyticsScriptsInjector.class, "after:RenderSupport");
		}

	}
}
