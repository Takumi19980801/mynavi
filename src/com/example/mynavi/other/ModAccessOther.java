package com.example.mynavi.other;

import com.example.mynavi.modifier.ModAccess;

  // ModAccessと継承関係のない他パッケージのクラス
public class ModAccessOther {
	public static void main(String[] args) {
		ModAccess my = new ModAccess();
		System.out.println(my.pub_var);
		// protected以下のメンバーにはアクセス不可
		// System.out.println(my.prot_var);
		// System.out.println(my.pack_var);
		// System.out.println(my.pri_var);
	}

}
