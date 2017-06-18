package com.vg.app.aop;

import com.vg.app.config.PlayerConfig;
import com.vg.app.logic.interfaces.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PlayerConfig.class)
public class TrackCounterTest {

    @Autowired
    private Player player;

    @Autowired
    private TrackCounter counter;

    @Test
    public void testTrackCounter() {
        player.playTrack(1);
        player.playTrack(2);
        player.playTrack(3);
        player.playTrack(3);
        player.playTrack(3);
        player.playTrack(3);
        player.playTrack(4);
        player.playTrack(4);
        assertEquals(1, counter.getPlayCount(1));
        assertEquals(1, counter.getPlayCount(2));
        assertEquals(4, counter.getPlayCount(3));
        assertEquals(2, counter.getPlayCount(4));
        assertEquals(0, counter.getPlayCount(5));
        assertEquals(0, counter.getPlayCount(6));
        assertEquals(0, counter.getPlayCount(7));
    }
}