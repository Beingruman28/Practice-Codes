package interviewquestion;

public class Test1 {
	
	public static void main(String[]args) {
		try {
			int a[]= {1,2,3,4};
			for(int i=1;i<=4;i++) {
				System.out.println("a["+i+"]="+a[i]+"n");
			}
		}
		catch(Exception e) {
			System.out.println("error="+e);
		}
		//catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsExeption");
				
			}
		}
	//}
/*
 * options--
 * a) compile error
 * b) run time error
 * c) ArrayIndexOutOfBoundsException
 * d)error code is printed
 * e) array is printed
 * 
 * 
 * output--
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception

	at interviewquestion.Test1.main(Test1.java:15)

 */
 

