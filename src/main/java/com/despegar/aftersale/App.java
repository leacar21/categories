package com.despegar.aftersale;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.despegar.aftersale.dto.ReplieDTO;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

public class App 
{    
    public static final char SEPARATOR=',';

    public static void main(String[] args) {

       CSVReader reader = null;
       try {
    	   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("files/replies-original.csv"), "UTF-8"));
    	   List<ReplieDTO> beans = new CsvToBeanBuilder<ReplieDTO>(bufferedReader)
         		  .withSeparator(SEPARATOR)
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
				e.printStackTrace();
			}
          } 
       }
    }
}
