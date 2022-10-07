/*  Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment
→ Each department will display all its functionalities.
→ Each department will display whether today is a holiday or not with the help of the Super Department.
 (SuperDepartment will act as a super class for all the departments)
  */

package Services;

import Departments.*;
public class Main {

	public static void main(String[] args) {
		
		// Creating objects of Each Department

		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hRDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();

		// Display functionality of Each Department

		adminDepartment.display();
		System.out.println();
		hRDepartment.display();
		System.out.println();
		techDepartment.display();
	}

}
