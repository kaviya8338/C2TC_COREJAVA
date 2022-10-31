package oopsconcept_package;

public class polymorphism {
	void volume(int s)
	{
		System.out.println("volume of cube"+(s*s*s));
		
	}
	void volume(int l,int b,int h)
	{
		System.out.println("volume of cuboid"+(l*b*h));
		
	}
	void volume(float r)
	{
		System.out.println("volume of sphere is" +(4/3*3.14*r*r*r));
		
	}
	public static void main(String[]args) {
		polymorphism ob1=new polymorphism();
		ob1.volume(3);
		ob1.volume(6,4,5);
		
	}

}
