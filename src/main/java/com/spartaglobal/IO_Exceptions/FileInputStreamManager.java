package com.spartaglobal.IO_Exceptions;

import java.io.*;

public class FileInputStreamManager {

    public void fileStreamReader() {
        try {
            BufferedReader file = new BufferedReader(new FileReader("resources/newFile.txt"));

            String line;
            while ((line = file.readLine()) != null){
                String[] LineData = line.split("");
                System.out.println(LineData);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}