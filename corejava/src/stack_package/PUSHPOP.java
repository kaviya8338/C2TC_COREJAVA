package stack_package;
import java.util.*;

public class PUSHPOP {

	public static void main(String[] args) {
		Stack <Integer> s =new Stack<Integer>();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println("Element of stack:"+s);
		s.pop();
		s.pop();
		for(int temp:s)
		{
			System.out.println(temp);
		}
	System.out.println("last element is:"+s.peek());
		
		
		
		

	}

}
