package isprime;

public abstract class prime {
	
public static boolean isPrime(int n) 	 { 
		 for (int i=2; i<n; i++) {  //��������,  �������� �� ����� ������� 
		       int temp = n % i;
			   if (temp == 0) {
			      return false;
		 			   }
		}
		 return true;
	}
	public static void main(String[] args) {
		
		for(int i = 2; i<= 100; i++) {
			boolean pr = isPrime(i); //��������� ��������� ������ �������
			if (pr == true) { 
				System.out.print(i + "  "); 
			}
		}
	}

}
