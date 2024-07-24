package com.adnan.SpringBootProject.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ServiceConsumer {

    private FirstService firstService;
    private SecondService secondService;

    @Autowired
    ServiceConsumer (FirstService firstService){
        this.firstService = firstService;
    }

    @Autowired
    public void setSecondService(SecondService secondService) {
        this.secondService = secondService;
    }

    public void displayMessages() {
        System.out.println(firstService.getMessage() + " \n"
                + secondService.getMessage()
        );
    }
}
