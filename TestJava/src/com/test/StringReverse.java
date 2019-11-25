package com.test;
public class StringReverse
{
	public String reverse(String str)
	{
		if ((str==null)||(str. length() <= 1) )
			return str;
		return reverse(str. substring(1)) + str. charAt(0);
	}
	
	public static void main(String args[]) {
		StringReverse stringReverse = new StringReverse();
		System.out.println("string reverse: " + stringReverse.reverse("Hello World"));
	}
}
