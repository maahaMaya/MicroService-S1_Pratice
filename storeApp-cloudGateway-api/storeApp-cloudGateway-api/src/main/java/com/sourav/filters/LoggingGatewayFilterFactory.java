package com.sourav.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Mono;

@Component
public class LoggingGatewayFilterFactory extends AbstractGatewayFilterFactory<LoggingGatewayFilterFactory.Config> {

	private final Logger logger = LoggerFactory.getLogger(LoggingGatewayFilterFactory.class);

	public LoggingGatewayFilterFactory() {
		super(Config.class);
	}

	@Override
	public GatewayFilter apply(Config config) {
		return (exchange, chain) -> {
			// pre Processing
			if (config.isPreLogger()) {
				logger.info("Pre GatewayFilter Logging" + config.getBaseMessage());
			}

			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				// post processing
				if (config.isPostLogger()) {
					logger.info("Post GatewayFilter Logging" + config.getBaseMessage());
				}
			}));
		};
	}

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	static class Config {

		// specify your configuration
		private String baseMessage;
		private boolean preLogger;
		private boolean postLogger;

		public boolean isPostLogger() {
			return postLogger;
		}

		public void setPostLogger(boolean postLogger) {
			this.postLogger = postLogger;
		}

		public String getBaseMessage() {
			return baseMessage;
		}

		public void setBaseMessage(String baseMessage) {
			this.baseMessage = baseMessage;
		}

		public boolean isPreLogger() {
			return preLogger;
		}

		public void setPreLogger(boolean preLogger) {
			this.preLogger = preLogger;
		}

		public Config(String baseMessage, boolean preLogger, boolean postLogger) {
			super();
			this.baseMessage = baseMessage;
			this.preLogger = preLogger;
			this.postLogger = postLogger;
		}

		public Config() {
			super();
			// TODO Auto-generated constructor stub
		}
	}
}
