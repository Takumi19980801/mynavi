package com.example.mynavi.exception;
 
import java.io.FileNotFoundException;
import java.io.FileReader;
 
public class ExTry {
 
  public static void main(String[] args) {
    try {
      FileReader reader = new FileReader("C:/data.txt");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}