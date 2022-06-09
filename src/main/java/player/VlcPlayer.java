package player;

import context.PlayerContext;

public class VlcPlayer implements Player{
    @Override
    public void play() {
        PlayerContext playerContext =  PlayerContext.getInstance();
        playerContext.getFileName();
        playerContext.getFileType();
        
    }
}
