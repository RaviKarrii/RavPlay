package server;

import context.ServerContext;

public class LocalServer implements Server{

    private ServerContext serverContext = ServerContext.getInstance();
    @Override
    public boolean connect() {
        serverContext.setConnected(true);
        return true;
    }

    @Override
    public boolean isConnected() {
        return serverContext.isConnected();
    }

}
