package com.example.mynavi.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaReplace {

	public static void main(String[] args) {
		List<String> list = new ArrayList<> (
			Arrays.asList("あかさか", "さくらきちょう", "よよき", "あおもり")
		);
		list.replaceAll(str -> {
			if(str.startsWith("あ")) {
				return "＊" + str;
			} else {
		        return str;
		    }
		 });
		 System.out.println(list);
		    // 結果：[＊あかさか, さくらぎちょう, よよぎ, ＊あおもり]
	}

}
