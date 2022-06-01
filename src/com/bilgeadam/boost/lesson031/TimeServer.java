package com.bilgeadam.boost.lesson031;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {
	
	private int port;
	
	public static void main(String[] args) {
		
		TimeServer server = new TimeServer();
		
		if(args.length >= 1 ) {
			server.port = Integer.parseInt(args[0]);
			
			
		}
		else {
			System.out.println("Please define a port number in order to connect server");
			System.exit(-10);
		}
		server.serve();
	}

	private void serve() {
		try(ServerSocket serverSocket =new ServerSocket(this.port)) {
		
			System.out.println("Server is listening on port " + port);
			
			while(true) {
			Socket socket = serverSocket.accept(); //new client connection is waiting
			System.out.println("New client connection created with using " + socket.getPort());
			
			OutputStream os = socket.getOutputStream();
			PrintWriter sender = new PrintWriter(os, true); //automatic sending
			for(int i = 0; i<10; i++) {
				sender.println(LocalDateTime.now());
				Thread.sleep(3000);
			
			}
		}
	} 
	catch (IOException | InterruptedException e) {
		e.printStackTrace();
		}

	}
}
