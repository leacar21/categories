package com.despegar.aftersale;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.despegar.aftersale.dto.PersonDTO;
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
          List<PersonDTO> beans = new CsvToBeanBuilder(new FileReader("files/ejemplo.csv"))
        		  .withSeparator(SEPARATOR)
        		  //.withEscapeChar(QUOTE)
        	      .withType(PersonDTO.class).build().parse();
          
          for (PersonDTO personDTO : beans) {
        	  System.out.println("Name: " + personDTO.getFirstName() + " " + personDTO.getLastName() + " (" + personDTO.getAge() + ")");
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
