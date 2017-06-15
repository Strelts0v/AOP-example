package com.vg.app.start;

import com.vg.app.config.PerformanceConfig;
import com.vg.app.logic.interfaces.Performance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PerformanceConfig.class);
        Performance performance = (Performance)ctx.getBean("trancePerformance");
        performance.perform();
    }
}
