package com.bilgeadam.boost.lesson031;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("Client started");
		
		String hostName = "localhost"; //127.0.0.1
		int port = 4711;
		
		try(Socket socket =new Socket(hostName, port);) {
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		System.out.println("Client stopped");

	}

}
