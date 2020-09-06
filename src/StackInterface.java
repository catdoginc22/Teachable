
public interface StackInterface<T> extends Iterable<T> {
	public void push(T xData);
	public T pop();
	public T peek();
	public void print();
	public int size();
	//class to interface you implement

}
