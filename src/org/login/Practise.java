package org.login;

public class Practise {
	public static void main(String[] args) {
		String s="gowrees123";
		int le = s.length();
		System.out.println(le);
		String a = s.toUpperCase();
		System.out.println(a);
		String b = s.toLowerCase();
		System.out.println(b);
		char c = s.charAt(6);
		System.out.println(c);
		boolean d = Character.isUpperCase(c);
		System.out.println(d);
		boolean e = Character.isLowerCase(c);
		System.out.println(e);
		boolean f = Character.isDigit(c);
		System.out.println(f);
		char up = Character.toUpperCase(c);
		System.out.println(s);
		boolean a1 = s.startsWith("Gow");
		System.out.println(a1);
		boolean b1 = s.endsWith("wees");
		System.out.println(b1);
		String c1 = s.replace('o','d');
		System.out.println(c1);
		String d1= s.replaceAll("GowRees","eswar");
		System.out.println(d1);
		
		
		String s1="hostel";
		System.out.println(s1);
		String s3="hostel2 is not clean";
		System.out.println(s3);
		
		
		
		
	}

}
