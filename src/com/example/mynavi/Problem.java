package com.example.mynavi;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        String[] numbers = line.split(" "); // スペースで区切って文字列を分割
        
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number); // 文字列を整数に変換して足し合わせる
        }
        
        System.out.println(sum);
    }
}