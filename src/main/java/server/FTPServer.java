package server;

import context.ServerContext;

public class FTPServer implements Server{

    private ServerContext serverContext = ServerContext.getInstance();
    @Override
    public boolean connect() {
        return false;
    }

    @Override
    public boolean isConnected() {
        return serverContext.isConnected();
    }

}
