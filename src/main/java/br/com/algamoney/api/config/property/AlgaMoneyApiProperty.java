package br.com.algamoney.api.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("algamoney")
public class AlgaMoneyApiProperty {
	
	@Getter
	@Setter
	private String originPermitida = "http://localhost:8000";
	
	@Getter
	private final Seguranca Seguranca = new Seguranca();
	
	@Setter
	public static class Seguranca{
		
		private boolean enableHttps;
		
		public boolean isEnableHttps() {
			return enableHttps;
		}
		
	}
	
	
}
