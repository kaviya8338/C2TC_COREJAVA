package com.tns.generic;
interface circle{
	int cal(int a);
	
}
public interface Lambdapg {
	public static void main (String[]args){
		int a =6;
		circle c=(int cal)->{return(3*a);};
		int i = c.cal(a);
		System.out.println(i);
		
	}

}
