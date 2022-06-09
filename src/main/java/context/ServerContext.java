package context;

public class ServerContext {

    private static ServerContext serverInstance = null;
    private boolean isConnected = false;

    public static ServerContext getInstance()
    {
        if (serverInstance == null)
            serverInstance = new ServerContext();

        return serverInstance;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }
}
