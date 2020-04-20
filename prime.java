package isprime;

public abstract class prime {
	
public static boolean isPrime(int n) 	 { 
		 for (int i=2; i<n; i++) {  //проверка,  является ли число простым 
		       int temp = n % i;
			   if (temp == 0) {
			      return false;
		 			   }
		}
		 return true;
	}
	public static void main(String[] args) {
		
		for(int i = 2; i<= 100; i++) {
			boolean pr = isPrime(i); //принимает результат работы функции
			if (pr == true) { 
				System.out.print(i + "  "); 
			}
		}
	}

}
