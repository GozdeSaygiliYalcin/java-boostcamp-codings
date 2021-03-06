package com.bilgeadam.boost.lesson031.afternoon;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private Socket socket;
	private ServerSocket server;
	private DataInputStream in;

	
	public Server(int port) {
		
		try {
			server =new ServerSocket(port);
			System.out.println("Server started");
			System.out.println("Waiting for a client...");
			
			socket = server.accept();
			System.out.println("Client accepted");
			
			in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
			
			String line = " ";
			
			while (!line.equals("Exit")) {
				line =in.readUTF(in);
				System.out.println(line);
			}
			System.out.println("Closing connection");
			socket.close();
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
		Server server = new Server(5000);
		
		
		
	}
	

}
