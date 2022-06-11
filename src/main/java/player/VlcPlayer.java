package player;

import context.PlayerContext;
import uk.co.caprica.vlcj.media.callback.CallbackMedia;
import uk.co.caprica.vlcj.media.callback.seekable.RandomAccessFileMedia;
import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import java.io.File;

public class VlcPlayer implements Player{
    @Override
    public void play() {
        EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        PlayerContext playerContext =  PlayerContext.getInstance();
        playerContext.getFileType();
        CallbackMedia media = new RandomAccessFileMedia(playerContext.getFile());
        mediaPlayerComponent.mediaPlayer().media().play(media);
    }
}
