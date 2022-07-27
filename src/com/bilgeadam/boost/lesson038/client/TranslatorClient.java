package com.bilgeadam.boost.lesson038.client;

import com.bilgeadam.boost.utilites.BAUtil;

public class TranslatorClient {

	public static void main(String[] args) {
		
		BAUtil.header("Translator demander");
		
		if(args.length != 2) {
			System.err.println("Not enough. Program is ending");
			System.exit(-10);
		}
		
		BAUtil.footer();

	}

}
