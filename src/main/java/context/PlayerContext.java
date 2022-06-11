package context;

import java.io.File;

public class PlayerContext {

    private static PlayerContext playerInstance = null;
    private File file;
    private String fileType;

    public static PlayerContext getInstance()
    {
        if (playerInstance == null)
            playerInstance = new PlayerContext();

        return playerInstance;
    }

    public File getFile(){
        return file;
    }

    public void setFile(File file){
        this.file = file;
    }

    public String getFileType(){
        return fileType;
    }

    public void setFileType(String fileType){
        this.fileType = fileType;
    }

}
