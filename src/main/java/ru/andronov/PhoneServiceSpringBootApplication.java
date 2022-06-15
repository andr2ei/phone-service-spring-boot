package ru.andronov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.andronov.services.PhoneMarket;

@SpringBootApplication
public class PhoneServiceSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appCtx =
				SpringApplication.run(PhoneServiceSpringBootApplication.class, args);
		PhoneMarket phoneMarket = appCtx.getBean("phoneMarket", PhoneMarket.class);
		phoneMarket.greetAndSellPhone();
	}

}
