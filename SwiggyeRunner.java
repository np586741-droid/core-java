class SwiggyeRunner
{
	public static void main(String [] args)
	{
		Swiggye swig=new Swiggye();
		swig.search("Chicken Biriyani");
		swig.search("Chicken Biriyani","Gowdru Kitchen");
		swig.search("Chicken Biriyani",200.1);
	}
}