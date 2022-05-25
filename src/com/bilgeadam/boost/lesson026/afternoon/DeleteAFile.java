package com.bilgeadam.boost.lesson026.afternoon;

import java.io.File;

public class DeleteAFile {

	public static void main(String[] args) {
		File filedel = new File("newFile");
		
		boolean isDelete= filedel.delete();
		
		if(isDelete) {
			
			System.out.println("The file is deleted");
		}
		else {
			System.out.println("The file is not deleted");
		}

	}

}
