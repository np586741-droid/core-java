class TataPanchRunner {
public static void main(String [] max)
{
	
	TataPanch.refInt=12345;
	TataPanch.refByte=127;
	TataPanch.refShort=5675;
	TataPanch.refFloat=180000.99f;
	TataPanch.refDouble=80.66;
	TataPanch.refLong=877788931;
	TataPanch.refBoolean=true;
	TataPanch.refString="TataPanch";
	TataPanch.refChar='3';
	
System.out.println("Int default value:"+TataPanch.refInt);
System.out.println("Float default value:"+TataPanch.refFloat);
System.out.println("Short default value:"+TataPanch.refShort);
System.out.println("Byte default value:"+TataPanch.refByte);
System.out.println("Double default value:"+TataPanch.refDouble);
System.out.println("Long default value:"+TataPanch.refLong);
System.out.println("Boolean default value:"+TataPanch.refBoolean);
System.out.println("String default value:"+TataPanch.refString);
System.out.println("Char default value:"+TataPanch.refChar);
}
}