/* Tech department will contain 4 methods of return type String and will not accept any parameter
i) departmentName
ii) getTodaysWork
iii) getWorkDeadline
iv) getTechStackInformation
departmentName will return “ Tech Department “ 
getTodaysWork will return “ Complete coding of module 1” 
getWorkDeadline will return “ Complete by EOD “ 
getTechStackInformation will return “core Java”.
 */

package Departments;

public class TechDepartment extends SuperDepartment{
    
    public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return " Core JAVA";
	}

	public void display() {
		System.out.println(" Welcome to " + departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
	}

}
