package CerclePoint;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int X,Y;
		
		System.out.println("Entrez les coordonnées du Pt 1");
		System.out.println("X : ");
		X = myObj.nextInt();
		System.out.println("Y : ");
		Y = myObj.nextInt();
		
		Point pt1 = new Point(X,Y);
		pt1.Affiche();
		
		System.out.println("Entrez les coordonnées du Pt 2");
		System.out.println("X : ");
		X = myObj.nextInt();
		System.out.println("Y : ");
		Y = myObj.nextInt();
		
		Point pt2 = new Point(X,Y);
		pt2.Affiche();
		
		myObj.close();
				
	}

}
