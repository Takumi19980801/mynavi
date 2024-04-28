package com.example.mynavi.modifier;
 
public class ModFinal2 {
  final void test() { } 
}
class ChildClass2 extends ModFinal2 {
  //void test() {}  → メソッドをオーバーライドできない
}