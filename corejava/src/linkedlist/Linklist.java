package linkedlist;
import java.util.*;
public class Linklist {

	public static void main(String[] args) {
		LinkedList <String> list =new LinkedList<String>();
		list.add("pen");
		list.add("pencil");
		list.add("eraser");
		list.add("sharper");
		System.out.println("enter the list:"+list);
		list.addFirst("parker pen");
		System.out.println(list);
		list.addLast("unicorn pen");
		System.out.println(list);
		list.add(2,"hero pen");
		System.out.println(list);
		
			
		
		
		
		

	}

}
