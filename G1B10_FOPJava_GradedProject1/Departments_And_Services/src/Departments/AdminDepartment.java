/* Admin department will contain 3 methods of return type String and will not accept any parameter
i) departmentName 
ii) getTodaysWork 
iii) getWorkDeadline
departmentName will return “ Admin Department “
getTodaysWork will return “Complete your documents Submission” 
getWorkDeadline will return “ Complete by EOD “.
 */

package Departments;

public class AdminDepartment extends SuperDepartment{
    
    public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

	public void display() {
		System.out.println(" Welcome to " + departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}


}
