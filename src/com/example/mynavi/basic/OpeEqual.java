// 基本型と参照型の違い
package com.example.mynavi.basic;
 
import java.util.Arrays;
 
public class OpeEqual {
 
  public static void main(String[] args) {
    // 基本型の代入
    int x = 1;
    int y = x;
    y++;
    System.out.println(x);  // 結果：1
    System.out.println(y);  // 結果：2
 
    // 参照型の代入
    int[] data1 = { 1, 2, 3 };
    int[] data2 = data1;
    data2[0] = 100;
    System.out.println(Arrays.toString(data1)); // 結果：[100, 2, 3]
    System.out.println(Arrays.toString(data2)); // 結果：[100, 2, 3]
  }
}