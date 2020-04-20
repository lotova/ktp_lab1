package ktp_1;

public class Palindrom {

	public static String reverseString(String s) {
		StringBuilder s1 = new StringBuilder();
		for(int i = s.length()-1; i>=0; i--) {
			s1.append(s.charAt(i));
		}
		return s1.toString();
	}
	public static boolean isPalindrome(String s) {
		String reverseS = reverseString(s);
		if (s.equals(reverseS) ) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		boolean pal;
		if (args.length != 0) {
		for (int i = 0; i < args.length; i++) {
			 String s = args[i];
			 pal = isPalindrome(s);
			 System.out.print(s + " pal: " + pal+ ". ");
		} 
		}else {
		System.out.println(" Empty command args");
		}
	}

}
