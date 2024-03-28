package com.example.mynavi.basic;
 
import java.util.Arrays;
 
public class OpeConst {
  public static void main(String[] args) {
    final int[] data = { 1, 2, 3 };
    System.out.println(Arrays.toString(data));  // 結果：[1, 2, 3]
    data[0] = 100;
    System.out.println(Arrays.toString(data));  // 結果：[100, 2, 3]
  }
}