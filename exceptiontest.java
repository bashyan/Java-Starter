class exceptiontest
	{
 	public static void main(String[] args)
	{
	try {
        new Input().method();
      	}
	catch(MyIncorrectException e ) {
        System.out.println(e.getMessage());
      	}
   	} 
	}
	class MyIncorrectException extends Exception 
	{
	MyIncorrectException(String s) 
	{
  	super(s);
   	}
	}
	class Input {
   	void method() throws MyIncorrectException {
   	throw new MyIncorrectException("Incorrect Input");
   	}
	}
	