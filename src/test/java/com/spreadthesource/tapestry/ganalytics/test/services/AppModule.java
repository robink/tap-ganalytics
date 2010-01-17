package com.spreadthesource.tapestry.ganalytics.test.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.ioc.annotations.SubModule;

import com.spreadthesource.tapestry.ganalytics.GAnalyticsConstants;
import com.spreadthesource.tapestry.ganalytics.services.GAnalyticsModule;

@SubModule(GAnalyticsModule.class)
public class AppModule {
	public static void bind(ServiceBinder binder) {
	}

	public static void contributeApplicationDefaults(
			MappedConfiguration<String, String> configuration) {
		configuration.add(SymbolConstants.SUPPORTED_LOCALES, "en");
		configuration.add(SymbolConstants.PRODUCTION_MODE, "true");
		configuration.add(SymbolConstants.APPLICATION_VERSION, "1.0-SNAPSHOT");
		configuration.add(GAnalyticsConstants.GANALYTICS_KEY, "dummy");
	}
}
