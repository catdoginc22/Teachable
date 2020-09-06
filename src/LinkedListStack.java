import java.util.Iterator;

public class LinkedListStack<T> implements StackInterface<T> {
	private class ListNode
	{
		private T data;
		private ListNode link;
		public ListNode(T xData, ListNode xLink)
		{
			data = xData;
			link = xLink;
		}
	}
	private class ListIterator implements Iterator<T>
	{
		private ListNode iCurr;
		public ListIterator(ListNode head)
		{
			iCurr = head;
		}
		public boolean hasNext()
		{
			return iCurr != null;
		}
		public T next()
		{
			T ret = iCurr.data;
			iCurr = iCurr.link;
			return ret;
		}
	}
	public Iterator iterator()
	{
		return new ListIterator(head);
	}
	private ListNode head;
	private int size;
	public LinkedListStack()
	{
		head = null;
		size = 0;
	}
	public void push(T xData)
	{
		ListNode newNode = new ListNode(xData,head);
		head = newNode;
		size++;
	}
	public T pop()
	{
		if(head==null)
			return null;
		T retData = head.data;
		head = head.link;
		size--;
		return retData;
	}
	public void print()
	{
		ListNode temp = head; 
		while(temp!=null)
			System.out.println(temp.data.toString());
	}
	public T peek()
	{
		if(head != null)
			return head.data;
		else
			return null;
	}
	public int size()
	{
		return this.size;
	}
	

}
