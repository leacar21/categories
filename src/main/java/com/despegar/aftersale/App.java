package com.despegar.aftersale;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.despegar.aftersale.dto.PersonDTO;
import com.despegar.aftersale.dto.ReplieDTO;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * Hello world!
 *
 */
public class App 
{    
    public static final char SEPARATOR=',';
    public static final char QUOTE='"';

    public static void main(String[] args) {

       CSVReader reader = null;
       try {
    	   List<ReplieDTO> beans = new CsvToBeanBuilder<ReplieDTO>(new FileReader("files/replies.csv"))
         		  .withSeparator(SEPARATOR)
         		  //.withEscapeChar(QUOTE)
         	      .withType(ReplieDTO.class).build().parse();
           
    	   int count = 0;
           for (ReplieDTO replieDTO : beans) {
        	   if (replieDTO.getType().equals("Client")){
        		   count++;
        		   System.out.println(count + ")" + replieDTO.getText());
        		   System.out.println("===================================================================");
        	   }
           }

       } catch (Exception e) {
    	   e.printStackTrace();
       } finally {
          if (null != reader) {
             try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          } 
       }
    }
}
