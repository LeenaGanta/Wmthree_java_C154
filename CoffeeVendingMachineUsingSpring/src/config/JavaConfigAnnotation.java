package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.persistence,com.presentation,com.service")
public class JavaConfigAnnotation {

}
