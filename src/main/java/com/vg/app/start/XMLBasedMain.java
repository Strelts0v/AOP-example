package com.vg.app.start;

import com.vg.app.logic.interfaces.Performance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLBasedMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/application-context.xml");
        Performance performance = (Performance)ctx.getBean("trancePerformance");
        performance.perform();
    }
}
