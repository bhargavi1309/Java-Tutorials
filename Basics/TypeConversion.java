public class TypeConversion
{
	public static void main(String []args)
	{
		byte b;
		int i=257;
		double d=323.142;
		System.out.println("Conversiom of int to byte");
		b=(byte)i;
		System.out.println("i="+i+"b="+b);
		System.out.println("Conversion of double to byte");
		b=(byte)d;
		System.out.println("d="+d+"b="+b);
	}
}
