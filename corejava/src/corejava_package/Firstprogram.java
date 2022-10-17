package corejava_package;
import java.util.Scanner;
public class Firstprogram {
	
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		String name =Sc.nextLine();
		int age =Sc.nextInt();
		int m1 =Sc.nextInt();
		int m2 =Sc.nextInt();
		int m3 =Sc.nextInt();
		int total=m1+m2+m3;
		float avg= total/3;
		System.out.println("Name:"+ name);
		System.out.println("Age:"+ age);
		System.out.println("M1:"+ m1);
		System.out.println("M2:"+ m2);
		System.out.println("M3:"+ m3);
		System.out.println("total"+total);
		System.out.println("Average"+ avg);
		
	}

}
