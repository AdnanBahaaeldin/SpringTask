package com.adnan.SpringBootProject.SpringProject;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    //The bean annotation specifies that the returned object is a bean
    @Bean
    public FirstService getFirstService (){
        return new FirstService();
    }

    //The bean annotation specifies that the returned object is a bean
    //The scope annotation sets the scope of the bean to prototype
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //@Scope("protoype")
    public SecondService getSecondService (){
        return new SecondService();
    }

}
