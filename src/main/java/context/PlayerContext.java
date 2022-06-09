package context;

public class PlayerContext {

    private static PlayerContext playerInstance = null;
    private String fileName;
    private String fileType;

    public static PlayerContext getInstance()
    {
        if (playerInstance == null)
            playerInstance = new PlayerContext();

        return playerInstance;
    }

    public String getFileName(){
        return fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileType(){
        return fileType;
    }

    public void setFileType(String fileType){
        this.fileType = fileType;
    }

}
