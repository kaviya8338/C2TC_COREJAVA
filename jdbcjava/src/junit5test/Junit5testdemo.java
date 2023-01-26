package junit5test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit5testdemo {

	@Test
	//ASSERT METHOD
	void display () {
		int a=1;
		int b=2;
	
		assertNotSame (a,b);
	}

}