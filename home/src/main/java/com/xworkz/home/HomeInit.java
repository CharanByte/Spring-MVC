package com.xworkz.home;

import com.xworkz.home.configuration.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HomeInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    HomeInit(){
        System.out.println("created no args HomeInit const");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {Configuration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("running getServletMappings method ");
        return new String[] {"/"};
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
        configurer.enable();
    }
}
