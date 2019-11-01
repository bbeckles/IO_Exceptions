package com.spartaglobal.IO_Exceptions;

import com.spartaglobal.IO_Exceptions.exceptions.ExceptionExamples;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


      //  ByteReaderManager byteReaderManager = new ByteReaderManager();

        //byteReaderManager.charReader();

      /*  BufferedFileManager bufferedFileManager = new BufferedFileManager();
        try {
            bufferedFileManager.readerWriter();
        }catch (IOException e){
            e.printStackTrace();
        }
*/

//        RatingsManager ratingsManager = new RatingsManager();
//        ratingsManager.searchForRatings(7.5);

        ExceptionExamples exceptions = new ExceptionExamples();
        exceptions.readfile();


    }

}
