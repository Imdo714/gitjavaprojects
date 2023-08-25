package kh.model.net;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void server() {
		int port = 3000;
		ServerSocket server;
		try {
			server = new ServerSocket(port);
			while(true) {
				Socket client = server.accept();
				client.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		server();
	}
}
