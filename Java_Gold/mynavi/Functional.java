package mynavi;

@FunctionalInterface
public interface Functional<T> {
	/*関数型インターフェースの要件として、１つの抽象メソッドを持つ必要がある
	 equalsはデフォルトメソッドのため、抽象メソッドにカウントされない*/
	boolean test(T t);
	//boolean equals(Object obj);
}
