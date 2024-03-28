// インクリメント／デクリメント演算子
package com.example.mynavi.basic;
 
public class OpeIncrement {
  public static void main(String[] args) {
    int x = 1;
    int y = x++;
    System.out.println("yは" + y);   // 結果：yは1
    int a = 1;
    int b = ++a;
    System.out.println("bは" + b);   // 結果：bは2
  }
}