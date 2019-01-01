package com.nsksoft.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ComponentScan(basePackages = "com.nsksoft.domain")
public class SpringConfiguration {

}
