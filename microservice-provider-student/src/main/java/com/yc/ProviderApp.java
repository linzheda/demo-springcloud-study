package com.yc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lzd
 * @date 2018/01/17
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class ProviderApp {
    public static void main( String[] args ) {
        SpringApplication.run(ProviderApp.class,args);
    }
}
