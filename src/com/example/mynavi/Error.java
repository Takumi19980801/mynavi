package com.example.mynavi;

import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        // 文字列に "A" が含まれているかチェック
        if (line.contains("A")) {
            System.out.println("A");
        } 
        // 文字列に "W" が含まれているかチェックし、含まれている場合は整数を出力
        else if (line.contains("W")) {
            int indexW = line.indexOf("W");
            int indexSpaceBefore = line.lastIndexOf(" ", indexW - 1);
            int indexSpaceAfter = line.indexOf(" ", indexW + 1);
            
            // "W"の直前または直後にある整数を取り出す
            String number;
            if (indexSpaceAfter == -1) {
                number = line.substring(indexSpaceBefore).trim();
            } else {
                number = line.substring(indexSpaceAfter).trim();
            }
            System.out.println(number);
        }
    }
}