package com.example.observable.service;


import com.example.observable.service.openapi.BookingController;


import com.example.observable.service.config.ConfigTestController;



import com.example.observable.service.metric.MetricController;



import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
@ApplicationPath("/data")
@ApplicationScoped
public class ObservableserviceRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        // resources
        classes.add(HelloController.class);
        
        classes.add(BookingController.class);
        
        
        classes.add(ConfigTestController.class);
        
        
        
        classes.add(MetricController.class);
        
        
        
        return classes;
    }
}
