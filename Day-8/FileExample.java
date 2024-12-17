package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D:\\Bird.JPG");
		FileOutputStream fw = new FileOutputStream("D:\\World.JPG");
		
		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);

		}

		fr.close();
		fw.close();
		System.out.println("Image copied");
	}

	}

