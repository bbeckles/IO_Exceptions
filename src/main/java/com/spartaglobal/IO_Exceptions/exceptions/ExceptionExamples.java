package com.spartaglobal.IO_Exceptions.exceptions;

import java.io.*;


public class ExceptionExamples {
    public void readfile() {
        File file = new File("resources/TestFile.txt");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while((line= bufferedReader.readLine()) !=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                bufferedReader.close();
            } catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
