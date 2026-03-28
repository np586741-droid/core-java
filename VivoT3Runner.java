class VivoT3Runner {
public static void main(String [] max)
{
	
	VivoT3.refInt=12345;
	VivoT3.refByte=127;
	VivoT3.refShort=5675;
	VivoT3.refFloat=180000.99f;
	VivoT3.refDouble=80.66;
	VivoT3.refLong=877788931;
	VivoT3.refBoolean=true;
	VivoT3.refString="VivoT3";
	VivoT3.refChar='3';
	
System.out.println("Int default value:"+VivoT3.refInt);
System.out.println("Float default value:"+VivoT3.refFloat);
System.out.println("Short default value:"+VivoT3.refShort);
System.out.println("Byte default value:"+VivoT3.refByte);
System.out.println("Double default value:"+VivoT3.refDouble);
System.out.println("Long default value:"+VivoT3.refLong);
System.out.println("Boolean default value:"+VivoT3.refBoolean);
System.out.println("String default value:"+VivoT3.refString);
System.out.println("Char default value:"+VivoT3.refChar);
}
}