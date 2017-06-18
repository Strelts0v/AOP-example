package com.vg.app.config;

import com.vg.app.aop.TrackCounter;
import com.vg.app.logic.impls.SamsungPlayer;
import com.vg.app.logic.interfaces.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.vg.app")
public class PlayerConfig {

    @Bean(name = "sumsungPlayer")
    public Player player(){
        Map<Integer, String> tracks = new HashMap<>();
        tracks.put(1, "track 1");
        tracks.put(2, "track 2");
        tracks.put(3, "track 3");
        tracks.put(4, "track 4");
        tracks.put(5, "track 5");
        return new SamsungPlayer(tracks);
    }

    @Bean(name = "trackCounter")
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
