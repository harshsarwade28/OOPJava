public class PrimitiveDataTypes {

	byte b;
	char ch;
	short s;
	int a;
	float f;
	double d;
	long l;
	
	
	
	public static void main(String[] args) {
		
		byte b=10;
		char ch='a';
		short s=1;
		int a=10;
		float f=1.2f;
		double d=1.23;
		long l=(long) 1.2344;
		
		System.out.println(b);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(a);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		
		System.out.println(a);
		PrimitiveDataTypes p = new PrimitiveDataTypes();
		
		System.out.println(p.b);
		System.out.println(p.ch);
		System.out.println(p.s);
		System.out.println(p.a);
		System.out.println(p.f);
		System.out.println(p.d);
		System.out.println(p.l);
		
	}
}