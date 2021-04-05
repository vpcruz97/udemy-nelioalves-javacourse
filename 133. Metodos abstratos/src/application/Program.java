package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Shape> shapeList = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int numberShapes = input.nextInt();
		
		for(int index=1; index <= numberShapes; index++) {
			System.out.println();

			System.out.println("Shape #" + index + " data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char choose = input.next().toLowerCase().charAt(0);
		
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(input.next());
		
			if(choose == 'r') {
				System.out.print("Width: ");
				double width = input.nextDouble();
				
				System.out.print("Height: ");
				double height = input.nextDouble();
				
				shapeList.add(new Rectangle(color, width, height));
				
			}
			else {
				System.out.print("Radius: ");
				double radius = input.nextDouble();
				
				shapeList.add(new Circle(color, radius));
				
			}
		}
		
		System.out.println();
		
		System.out.println("Shape Areas: ");
		for (Shape shape : shapeList) {
			System.out.println(String.format("%.2f", shape.area()));
			
		}
		
		input.close();
	}

}
