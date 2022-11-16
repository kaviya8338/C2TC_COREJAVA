package array_package;

public class Arraydemo {

	public static void main(String[] args) {
		int array[]= {5,10,15,20,25};
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
			System.out.println("sum of array element:"+sum);
		}

	}

}
