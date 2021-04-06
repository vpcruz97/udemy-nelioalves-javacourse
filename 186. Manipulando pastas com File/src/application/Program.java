package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		/* Codigo abaixo permite a leitura de pastas */
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		/* Codigo abaixo permite a leitura de arquivos */
		System.out.println();
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		for (File file : files) {
			System.out.println(file);
		}
		
		/* Codigo abaixo permite a criação de pastas */
		boolean success = new File(strPath + "//subdir").mkdir();
		System.out.println("Directory created succefully: " + success);
		
		sc.close();
	}

}
