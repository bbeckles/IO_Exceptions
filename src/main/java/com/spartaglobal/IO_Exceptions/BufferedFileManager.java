package com.spartaglobal.IO_Exceptions;

import java.io.*;

public class BufferedFileManager {

    public void readerWriter() throws IOException {
        // current file managed by buffer
        File file = new File("resources/TestFile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        // new file to be managed by buffer writer
        File newfile = new File("resources/newFile.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(newfile));

        // line manager variable
        String line;

        while ((line = reader.readLine())!= null){
            if (!line.equals("")){
                writer.append(line.trim() + "\n");
                System.out.println("Friyay i've added a new line ");
            }
        }

        writer.flush();
        writer.close();
        reader.close();

    }
}
