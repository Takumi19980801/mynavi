package mynavi;

@FunctionalInterface
public interface Functional<T> {
	boolean test(T t);
	boolean equals(Object obj);
}
