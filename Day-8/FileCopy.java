package com.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
//file writing
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\hello.txt");
		FileWriter fw = new FileWriter("D:\\MyFile.txt");
		
		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);

		}

		fr.close();
		fw.close();
		System.out.println("File Copied");
	}
}
