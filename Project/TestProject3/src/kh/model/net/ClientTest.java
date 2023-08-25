package kh.model.net;
import java.io.*;
import java.net.*;
public class ClientTest {
	public static void client() {
		int port = 3000;
		String serverIP;
		try {
			serverIP = "192.168.20.34";
			Socket socket = new Socket(serverIP, 3000);
			socket.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		client();
	}
}
