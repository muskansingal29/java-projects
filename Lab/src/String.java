
public class String {

	//	accepting a String array from user
	static String strConcat(String st[])
	{
//		converting st array int StringBuilder object, for using append method
		StringBuilder builder = new StringBuilder();;
		try {
//			throwing an exception when st is empty
			if(st==null) {
				throw new Exception();
			}

//			join array values one by one using for each loop
			for(String s : st) {
//				append string one by on at the end of builder obj
				builder.append(s+" ");
			}
		}catch(Exception e)
		{
//			this will print a msg when string is null
			System.out.print("Array Cannot Null");
		}
//		returning in the form of String 
	//	return builder.toString();
	}
	public static void main(String[] args) {
//		make three array of Strings
		String st1[]= null;
		String st2[]= {"   "};
		String st3[]= {"muskan","singal"};

//		Invoking method three times strConcat(strarr)
		System.out.println(strConcat(st1));
		System.out.println(strConcat(st2));
		System.out.println(strConcat(st3));

	}
}