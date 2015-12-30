package uk.co.dashery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import uk.co.dashery.rabbitmq.RabbitMqConfig;

@SpringBootApplication
@Import(RabbitMqConfig.class)
public class DasheryProductIngestorApplication {

    public static void main(String args[]){
        SpringApplication.run(DasheryProductIngestorApplication.class);
    }
}
