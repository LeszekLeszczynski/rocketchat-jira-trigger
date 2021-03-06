package se.gustavkarlsson.rocketchat.jira_trigger.routes;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import se.gustavkarlsson.rocketchat.jira_trigger.configuration.MessageConfiguration;

public class RouteModule extends AbstractModule {
	@Override
	protected void configure() {
	}

	@Provides
	@Singleton
	JiraKeyParser provideJiraKeyParser(MessageConfiguration messageConfig) {
		return new JiraKeyParser(messageConfig.getWhitelistedJiraKeyPrefixes(), messageConfig.getWhitelistedJiraKeySuffixes());
	}
}
