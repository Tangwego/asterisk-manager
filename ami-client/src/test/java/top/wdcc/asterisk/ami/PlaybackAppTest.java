package top.wdcc.asterisk.ami;

import top.wdcc.asterisk.ami.apps.Playback;

public class PlaybackAppTest {
    public static void main(String[] args) {
        Playback playback = new Playback("test.wav", "haha");
        System.out.println(playback.getData());
    }
}
