package com.test;

public class StringReplace {

	public static void main(String ar[]){
		
		String emailTemplate = "<html><body>\"name\":${name},\"bom\":bomcontent </body></html>";
		System.out.println(emailTemplate);
		System.out.println(emailTemplate.indexOf("bomcontent"));
		emailTemplate =emailTemplate.replaceAll("bomcontent", "<table><tr><td>asdfdsa<\td><\tr><\table>");
		System.out.println(emailTemplate);
		
	}
}
