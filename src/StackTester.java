import java.util.*;
public class StackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackInterface<Integer> intArrStack = new ArrayStack<Integer>();
		for(int i =0;i<ArrayStack.MAX_ARR_SIZE;i++)
		{
			System.out.println(i);
			intArrStack.push(i);
		}
		System.out.println();
		for(int i = 0;i<ArrayStack.MAX_ARR_SIZE;i++)
		{
			System.out.println(intArrStack.pop());
		}

	}

}
