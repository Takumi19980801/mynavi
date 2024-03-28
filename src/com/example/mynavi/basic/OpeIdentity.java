package com.example.mynavi.basic;
 
public class OpeIdentity {
  public static void main(String[] args) {
    final int[] data1 = { 1, 2, 3 };
    final int[] data2 = { 1, 2, 3 };
    System.out.println(data1 == data2); // 結果：false
  }
}