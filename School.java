class School
{
	// properties
	String schoolName
	String location
	int numberOfStudents
	int numberOfTeachers
	String principalName
	double schoolFee
	String boardType
	boolean hasLibrary
	boolean hasPlayground
	int establishedYear
	static String country = "India";
	static String educationType = "Formal";
	
	// behaviour
    public String conductClass(String className) 
	{
        System.out.println("Conducting class: " + className);
		return className;
    }
    public int admitStudent(int newStudents) {
        System.out.println("Admitting students: " + newStudents);
        return newStudents;
    }
    public String assignTeacher(String teacherName)
	{
        System.out.println("Assigned Teacher: " + teacherName);
        return teacherName;
    }
    public double collectFee(double feeAmount) 
	{
        System.out.println("Collected Fee: " + feeAmount);
        return feeAmount;
    }
    public boolean startLibrary(boolean isOpen)
	{
        System.out.println("Library Open: " + isOpen);
        return isOpen;
    }
    public boolean conductExam(boolean examStatus) 
	{
        System.out.println("Exam Conducted: " + examStatus);
        return examStatus;
    }
    public String announceHoliday(String holidayName) 
	{
        System.out.println("Holiday Declaration: " + holidayName);
        return holidayName;
    }
    public int calculateTotalStudents(int students) 
	{
        System.out.println("Total Students: " + students);
        return students;
    }
    public String organizeEvent(String eventName)
	{
        System.out.println("Event Organized: " + eventName);
        return eventName;
    }
    public boolean maintainDiscipline(boolean disciplineStatus) 
	{
        System.out.println("Discipline Maintained: " + disciplineStatus);
        return disciplineStatus;
    }
}