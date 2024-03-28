// 浮動小数点数の計算で正しい結果を得る
package com.example.mynavi.basic;
 
import java.math.BigDecimal;
 
public class OpeFloat {
 
  public static void main(String[] args) {
    BigDecimal bd1 = new BigDecimal("1.0");
    BigDecimal bd2 = new BigDecimal("0.1");
    BigDecimal bd3 = new BigDecimal("0.2");
    BigDecimal bd4 = new BigDecimal("0.3");
    System.out.println(bd1.subtract(bd2).subtract(bd3).subtract(bd4));
  // 結果：0.4
  }
}