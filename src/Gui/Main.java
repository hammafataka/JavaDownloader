package Gui;
import  javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JButton;

public class Main {
    public static void main(String[] args) {
        JButton button1=new JButton();
        button1.setText("download");
        button1.setBounds(100,100,150,150);
        button1.setFocusable(false);



        JLabel label1=new JLabel();//crate new label
        ImageIcon image1=new ImageIcon("hamma.jpg");//creating instance of image
        label1.setIcon(image1);//importing the image
        label1.setText("Welcome to M downloader");//set text input
        label1.setHorizontalTextPosition(JLabel.CENTER);//setting horzantile position of text
        label1.setVerticalTextPosition(JLabel.BOTTOM);//setting vertical position of text
        label1.setVerticalAlignment(JLabel.BOTTOM);//setting text allignments
        label1.setForeground(new Color(250,250,250));//label text color
        label1.setFont(new Font("",Font.PLAIN,20));//setting text size and font
        label1.setIconTextGap(50);//setting how far text will be to the image
        label1.setBackground(new Color(0,0,0));//setting text background color
        label1.setOpaque(true);//set display background color
        Border border=BorderFactory.createLineBorder(Color.RED);
        label1.setBorder(border);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setBounds(100,100,350,250);





        JFrame frame=new JFrame();//creating frame
        frame.setVisible(true);//set visibility
        frame.add(label1);
        //frame.add(button1);
        frame.getContentPane().setBackground(new Color(123,50,250));//background color
        frame.setSize(500,500);//set size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit prigram when exit clicked, by default it is hide
        frame.setResizable(true);//prevents resizing the window
        frame.setTitle("M downloader");//set app title
        ImageIcon image=new ImageIcon("hamma.jpg");//create image instance
        frame.setIconImage(image.getImage());//upload the image to java
        //frame.pack();





    }
}
