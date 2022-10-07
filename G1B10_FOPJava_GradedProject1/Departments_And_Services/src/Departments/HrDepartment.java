/*Hr department will contain 4 methods of return type String and will not accept any parameter
i) departmentName 
ii) getTodaysWork 
iii) getWorkDeadline 
iv) doActivity
departmentName will return “ Hr Department “
getTodaysWork will return “ Fill today’s timesheet and mark your attendance” 
getWorkDeadline will return “ Complete by EOD “
doActivity “team Lunch”.
 */

package Departments;

public class HrDepartment extends SuperDepartment {
   
    public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}

	public void display() {
		System.out.println(" Welcome to " + departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}


}
