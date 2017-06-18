package com.vg.app.logic.impls;

import com.vg.app.logic.interfaces.Player;
import java.util.Map;

public class SamsungPlayer implements Player {

    private Map<Integer, String> tracks;

    public SamsungPlayer(Map<Integer, String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void playTrack(int trackNumber) {
       if(tracks.containsKey(trackNumber)) {
           System.out.println("Playing " + tracks.get(trackNumber));
       } else {
           System.out.println("No such a track in playlist...");
       }
    }

    public Map<Integer, String> getTracks() {
        return tracks;
    }

    public void setTracks(Map<Integer, String> tracks) {
        this.tracks = tracks;
    }
}
