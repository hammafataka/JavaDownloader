package com.URL;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;

public class download implements Runnable{
    String link;
    File out;
    public download(String link,File out){
        this.link=link;
        this.out=out;

    }
    @Override
    public void run() {
        try {
            URL url=new URL(link);
            HttpURLConnection http=(HttpURLConnection) url.openConnection();
            double fileSize=(double) http.getContentLengthLong();
            BufferedInputStream in=new BufferedInputStream(http.getInputStream());
            FileOutputStream fos=new FileOutputStream(this.out);
            BufferedOutputStream bOut=new BufferedOutputStream(fos,1024);
            byte[] buffer=new byte[1024];
            Double downloaded=0.00;
            int read=0;
            Double percentDownload=0.00;
            while ((read=in.read(buffer,0,1024))>=0){
                bOut.write(buffer,0,read);
                downloaded+=read;
                percentDownload=(downloaded*100)/fileSize;
                String percent=String.format("%.2f",percentDownload);
                System.out.println("Downloaded "+percent+"% of the file..");
            }
            bOut.close();
            in.close();
            System.out.println("Completed bitch");

        }
        catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
