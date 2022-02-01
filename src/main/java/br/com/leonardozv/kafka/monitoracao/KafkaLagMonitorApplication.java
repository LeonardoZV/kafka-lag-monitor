package br.com.leonardozv.kafka.monitoracao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaLagMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaLagMonitorApplication.class, args);
	}

}
