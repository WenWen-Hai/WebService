package com.offcn;

public class testWebClient {
    public static void main(String[] args) {
        HelloServer server=new HelloServerService().getPort(HelloServer.class);
        String s=server.sayHello("WenWenŒ Œ ");
        System.out.println(s);

    }
}
