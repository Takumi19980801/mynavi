package mynavi1;

public class Sample2_10 {

    public static void main(String[] args) {
        String str = "hoge, world.";
        //String型は不変なため、新しくインスタンスを作成する
        String st = hello(str); 
        System.out.println(st);
    }

    private static String hello(String msg) {
        String replacedMsg = msg.replaceAll("hoge", "hello");
        return replacedMsg; // 置換後の文字列を返す
    }

}