package com.spartaglobal.IO_Exceptions;

import java.io.*;

public class RatingsManager {

    public void searchForRatings(double ratings){

        try {

            BufferedReader csvReader = new BufferedReader(new FileReader("resources/movie_metadata.csv"));

            String csvLine;
            csvReader.readLine();

            while ((csvLine = csvReader.readLine()) != null) {
                String[] csvLineData = csvLine.split(",");
                if (Double.parseDouble(csvLineData[1]) >= ratings){
                    System.out.println(csvLineData [0]);
                    System.out.println(csvLineData[1]);
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
