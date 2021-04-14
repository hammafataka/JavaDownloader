package com.URL;
import java.io.File;

public class Main {

    public static void main(String[] args) {
	String link="https://www.nature.com/articles/453028a.pdf";
	File out=new File("C:\\Users\\hamma\\OneDrive\\Desktop\\hamma downloader.pdf");
	new Thread(new download(link,out)).start();
    }
}
