package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employee: ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)?: ");
			char ch = input.next().charAt(0);
			
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			
			System.out.print("Hours: ");
			int hours = input.nextInt();
			
			System.out.print("Value per Hour: ");
			double valuePerHour = input.nextDouble();
			
			if(ch == 'y' || ch == 'Y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = input.nextDouble();
				list.add(
					new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge)
				);
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}	
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee employee : list) {
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
		}
		
		input.close();
	}

}
