package linkedlist;
import java.util.*;

public class VECTOR1 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		int size = v.size();
		System.out.println("size of the vector Element:"+size);
		//adding a vector element
		v.add("chennai");
		v.add("bangalore");
		v.add("pune");
		v.add("vellore");
		System.out.println("Adding of the vector Element:"+v);
		int Vectorsize = v.size();
		System.out.println("VECTOR SIZE:"+v);
		int capacity = v.capacity();
		System.out.println("Capcty default:"+size);
		v.addElement("coimbatore");
		v.add("mysore");
		v.add("null");
		System.out.println("After adding a new Element:"+v);
		int newsize = v.size();
		System.out.println("new SIZE:"+newsize);
		int newcapacity = v.capacity();
		System.out.println("new capacity:"+newcapacity);
		
	
	}

}
