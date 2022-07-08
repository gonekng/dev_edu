
package 컬렉션프레임워크;

//<E> : Element
//<K> : Key
//<N> : Number
//<T> : Type
//<V> : Value

public class Box<T> {
	private T t;
	
	public Box(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
