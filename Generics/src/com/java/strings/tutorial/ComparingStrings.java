package com.java.strings.tutorial;
//Best examples for string handling in all situations almost ;)

public class ComparingStrings {
	public static void main (String[] args) {
		int value = 20;
		String s1 ="hello";
		String s2 ="Hello";
		String s3 ="hieeeee";
		String s4 = "hie";
		String s5 = "HIE";
		String s6 = "kittu Chary hello";
		String replace = s6.replace('h', 'H');
		String s7 = String.valueOf(value);
				System.out.println("string eg for s1==s2................." + s1 == s2);
				System.out.println("now the string equals................." + s1.equals(s2));
				System.out.println("now the equalIgnoranceCase................." +s1.equalsIgnoreCase(s2));
				System.out.println("now the string equals................." + s1.equals(s3));
				
				System.out.println("now the string is UpperCase................" +s4.toUpperCase());
				System.out.println("now the string is LowerCase................" +s4.toLowerCase());
				System.out.println("now the string is UpperCase................" +s4);
				System.out.println("now the string is UpperCase................" +s4.length());
				System.out.println("now the string is UpperCase................" +s6.charAt(6));
				System.out.println("now the string is UpperCase................" +s6.concat(s3));
				System.out.println("now the string is Indexof................" +s6.indexOf('i'));
				System.out.println("now the string is hashCode................" +s6.hashCode());
				System.out.println("now the string is UpperCase................" +s1.intern() == s2.intern());
				System.out.println("now the string is UpperCase................" +s6.substring(3));
				//doubt
				System.out.println("now the string is UpperCase................" +s6.toCharArray());
				//doubt
				System.out.println("now the string is UpperCase................" +s6.CASE_INSENSITIVE_ORDER);
				//doubt
				System.out.println("now the string is this................" +s6.split(s1));
				System.out.println("now the string is UpperCase................" +s6.valueOf(true));
				System.out.println("now the string is UpperCase................" +s6.isEmpty());
				System.out.println("now the string is UpperCase................" +s6.getClass());
				System.out.println("now the string is UpperCase................" +s6.codePoints());
				System.out.println("now the string is UpperCase................" +s6.contains(s1));
				System.out.println("now the string is compareToIgnoreCase................" +s6.compareToIgnoreCase(s1));
				System.out.println("now the string is value of................" +s7+19);
				System.out.println("now the string is replace................" +replace);
		String s8 = "Welcome to Denver";
		char[] ch = s8.toCharArray(); 
		for(int i = 0;i < ch.length; i++) {
			
			System.out.println("To print the char of array......" +ch[i]);
			
		}
		
	}

}
