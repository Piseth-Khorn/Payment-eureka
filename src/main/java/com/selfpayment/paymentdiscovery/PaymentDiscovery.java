package com.selfpayment.paymentdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@RefreshScope
@EnableEurekaServer
@SpringBootApplication
public class PaymentDiscovery {

  public static void main(String[] args) {
    SpringApplication.run(PaymentDiscovery.class, args);
  }
}
