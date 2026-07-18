package day9;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class hi {
    static void main(String[] args) throws Exception{
        File f=new File("C:\\Users\\arivu\\OneDrive\\Documents\\Custom Office Templates\\my_self\\new_java\\demo.txt");
        f.createNewFile();
        Scanner sc=new Scanner(f);
        int i=1;
        while(sc.hasNext()){
            String s=sc.nextLine();
            System.out.println("TestCase "+i+"-->"+s);
            i++;
        }
//        System.out.println("File created");
//        FileWriter f1=new FileWriter(f);
//        f1.write("Hello World\n");
//        f1.close();
//        FileWriter f3=new FileWriter(f,true);
//        f3.write("Hello World...................................");
//        f3.close();



    }
}


