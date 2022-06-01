package com.bilgeadam.boost.lesson031;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
	
	public static void main(String[] args) {
		System.out.println("Server started");
		
		String hostName = "localhost"; //127.0.0.1
		int port = 4711;
		
		try(ServerSocket server = new ServerSocket(port)) {
			Socket socket = server.accept();
			System.out.println( "Connected to the " + socket.getPort() + " number of port");
		} catch (UnknownHostException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Server stopped");
	}

}
