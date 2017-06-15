package com.vg.app.config;

import com.vg.app.aop.Audience;
import com.vg.app.logic.impls.TrancePerformance;
import com.vg.app.logic.interfaces.Performance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy         // enables AspectJ auto-proxying
@ComponentScan("com.vg.app")
public class PerformanceConfig {

    @Bean(name = "trancePerformance")
    public Performance performance(){
        return new TrancePerformance();
    }

    @Bean(name = "audience")
    public Audience audience(){
        return new Audience();
    }
}
