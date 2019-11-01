package com.spartaglobal.IO_Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MovieManager {

    public void searchForFilm( String titleName) {
        try {


            BufferedReader csvReader = new BufferedReader(new FileReader("resources/movie_metadata.csv"));

            String csvLine;

            while ((csvLine = csvReader.readLine()) != null) {
                String[] csvLineData = csvLine.split(",");
                if (csvLineData[0].toLowerCase().contains(titleName)){
                    System.out.println(csvLineData[0]);
                }
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
