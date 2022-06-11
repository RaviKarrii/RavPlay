package cli;

import context.PlayerContext;
import context.ServerContext;
import player.Player;
import player.VlcPlayer;

import java.io.File;

public class play {
    PlayerContext playerContext = PlayerContext.getInstance();
    ServerContext serverContext = ServerContext.getInstance();

    public void serverSetup(File file){
        serverContext.setConnected(true);
        playerContext.setFile(file);
    }

    public static void main(String [] args){
        play play = new play();
        File file = new File("/Users/ravikarri/Documents/Media/TV/Peacemaker/Season\\ 1/Peacemaker\\ -\\ S01E01\\ -\\ A\\ Whole\\ New\\ Whirled\\ WEBDL-1080p.mkv");
        play.serverSetup(file);
        Player player = new VlcPlayer();
        player.play();
    }
}
