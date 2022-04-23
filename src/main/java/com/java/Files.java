package com.java;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Files {

    public static void run() throws IOException {





        BufferedWriter bw = new BufferedWriter(new FileWriter("bufferWriter.txt"));

        bw.write("asd1\n");
        bw.write("asd2\n");
        bw.write("asd3\n");

        bw.close();

        Scanner scanner = new Scanner(new File("bufferWriter.txt"));

        System.out.println(scanner.nextLine());


        FileWriter fileWriter = new FileWriter("fileWrite.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println("hello");

        printWriter.close();



    }
}
