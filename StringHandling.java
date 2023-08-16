class StringHandling
{
	public static void main(String args[])
	{
		String s1="BANGALORE";
		String s2="Bangalore";
		String s3="BENGALURU123";
		boolean x=s3.equals(s2);
		System.out.println("Compare s1 and s2 : "+x);
		System.out.println("Character at given posit ion is ");
		System.out.println(s1.charAt(5));
		System.out.println(s1.concat("IS IT CITY"));
		System.out.println(s1.length());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s1.indexOf('N'));
		System.out.println(s1.substring(0,4));
		System.out.println(s1.substring(4));
		System.out.println(s1.valueOf(s1));
	}
	
}