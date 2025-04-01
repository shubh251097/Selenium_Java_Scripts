package string_programs;

class String_equals {

	public static void main(String[] args) {
		String S1=new String("sultane shubham");
		String S2=new String ("pavan");
		System.out.println(S1==S2);
		System.out.println(S1.equals(S2));
		
		String str="Sultane Shubham";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(3));
		System.out.println(str.concat(S2));
		System.out.println(str.equalsIgnoreCase(S1));
        System.out.println(str.substring(4));
		System.out.println(str.equals(S1));
		System.out.println(str.startsWith("pav"));
		System.out.println(str.endsWith("ham"));
		
		System.out.println(str.contains("tane"));
		System.out.println(str.trim());
		System.out.println(str.toString());
		System.out.println(str.strip());
		System.out.println(str.replace('S', 'T'));
		System.out.println(str.toLowerCase());
		
		
		 
		
		
		

	}

}
