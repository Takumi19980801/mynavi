package com.example.mynavi.paiza;

import java.util.Scanner;

public class D230 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 1; // 積を格納する変数を初期化 (0ではなく1で初期化することに注意)
        while (sc.hasNextLine()) {
            String line = sc.nextLine(); // 改行で区切られた1行の入力を読み取る
            if (line.isEmpty()) // 入力が空行の場合はループを抜ける
                break;
            String[] numbers = line.split(" "); // 入力行をスペースで分割して配列に格納
            for (String number : numbers) {
                product *= Integer.parseInt(number); // 文字列を整数に変換して積に乗算する
            }
        }
        System.out.println(product); // 積を出力
        sc.close(); // Scannerオブジェクトを閉じる
    }
}