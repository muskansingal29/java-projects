
public class Arrays {

//	accept  String array 
	static String strConcat(String st[])
	{
		StringBuilder builder = new StringBuilder();;
		try {
			if(st==null) {
				throw new Exception();
			}


			for(String s : st) {

				builder.append(s+" ");
			}
		}catch(Exception e)
		{

			System.out.print("Array Cannot Null");
		}
		return null;

		//return builder.toString();
	}
	public static void main(String[] args) {
//		 three array of Strings
		String st1[]= null;
		String st2[]= {"Jai","Shri","Ram"};
		String st3[]= {"muskan"};

		System.out.println(strConcat(st1));
		System.out.println(strConcat(st2));
		System.out.println(strConcat(st3));

	}

	}

