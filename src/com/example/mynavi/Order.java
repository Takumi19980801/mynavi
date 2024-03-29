package com.example.mynavi;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> numbersList = new ArrayList<>();
        String line;
        while (sc.hasNextLine()) { // 入力があるかどうかをチェック
            line = sc.nextLine();
            if (line.isEmpty()) // 空行が入力されたらループを終了
                break;
            int number = Integer.parseInt(line);
            numbersList.add(number);
        }
        
        // 入力された数値を昇順でソート
        Collections.sort(numbersList);
        
        // ソートされた数値を改行区切りで出力
        int previousNumber = Integer.MIN_VALUE; // 直前の数値を初期化
        for (int num : numbersList) {
            if (num != previousNumber) { // 現在の数値が直前の数値と異なる場合のみ出力
                System.out.println(num);
                previousNumber = num; // 直前の数値を更新
            }
        }
    }
}