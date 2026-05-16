package com.String;

public class StringBufferMethod {

	public static void main(String[] args) {
		 
		String str = "Hello world";  // String intern pool
		
		String str1 = new String ("Hello world");  // heapmemory
		
		StringBuffer sb = new StringBuffer("Hello world");
		
//		// length of String ;
//		
//		System.out.println(str1.length());  // TO access length of the String
//		System.out.println(str.length());
//		
//		System.out.println(sb.length());
//		
//		// concat ();
//		System.out.println(str+"123");
//		System.out.println(str.concat("1234"));
//		
//		System.out.println(sb.append(123));
//		
//		// CharAt;
//		System.out.println(str.charAt(0));
//		System.out.println(sb.charAt(0));
		
	
		 // System.out.println(str);
		
		// IndexofMethod
		
//		System.out.println(str.indexOf('e'));
//		System.out.println(str.indexOf("ello"));
//		
//		System.out.println(sb);
//		System.out.println(sb.indexOf("ello"));
		
		// last indexof method 
		
//		System.out.println(str.lastIndexOf('o'));
//		
//		System.out.println(sb.lastIndexOf("o"));
		
		// is empty ()
		
//		System.out.println(str.isEmpty());
//		
//		StringBuffer sb1 = new StringBuffer();
//		
//		System.out.println(sb1.isEmpty());
		
		
		// 1) Reverese
		
	//	System.out.println(sb.reverse());
		
		
		// 2) insert(int offset,String)
		
	//	System.out.println(sb);
		
	//	System.out.println(sb.insert(11, " Java"));
		
	//	System.out.println(sb.insert(5, " Java"));
		
	//	3) DeleteCharAt()
		
	//	System.out.println(sb.deleteCharAt(4));

        // DeleteCharAt()  from RANGEOF INDEX
		
	//	System.out.println(sb.delete(0,4));
		
		// Replace (int start ,int end, SubString )
		
		System.out.println(sb.replace(0, 5, "Hi"));
		
		// Capacity 
		
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
		System.out.println(sb.length());
		sb.append("This is simple text that I am adding to the String Buffer");
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
