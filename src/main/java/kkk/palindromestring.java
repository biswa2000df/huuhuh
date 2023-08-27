package kkk;

public class palindromestring {

	public static void main(String[] args) {

		String s = "madajsjsumX";

		String a = "";
		String remove = "";

		char ch[] = s.toCharArray();

		System.out.println(ch.length);

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i]!= ch[j]) {

					remove = remove + ch[j];
					break;
				} 
			}

		}
		System.out.println(a);
		System.out.println(remove);

//		String rev="";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		
//		if(s.equalsIgnoreCase(rev))
//			
//			System.out.println("palindrome");
//		else
//			System.out.println("not palindrome");

	}

}
