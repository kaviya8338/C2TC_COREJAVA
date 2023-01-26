package junit5test;

public @interface ParametizedTest {
	@valuesource(Strings={"corn","unicorn"})
	void endsWithi (String str) {
		asserttrue(str.endsWith("i"));
		
		
	}

}
