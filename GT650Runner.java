class GT650Runner {
public static void main(String [] max)
{
	
	GT650.refInt=12345;
	GT650.refByte=127;
	GT650.refShort=5675;
	GT650.refFloat=180000.99f;
	GT650.refDouble=80.66;
	GT650.refLong=877788931;
	GT650.refBoolean=true;
	GT650.refString="GT650";
	GT650.refChar='3';
	
System.out.println("Int default value:"+GT650.refInt);
System.out.println("Float default value:"+GT650.refFloat);
System.out.println("Short default value:"+GT650.refShort);
System.out.println("Byte default value:"+GT650.refByte);
System.out.println("Double default value:"+GT650.refDouble);
System.out.println("Long default value:"+GT650.refLong);
System.out.println("Boolean default value:"+GT650.refBoolean);
System.out.println("String default value:"+GT650.refString);
System.out.println("Char default value:"+GT650.refChar);
}
}

