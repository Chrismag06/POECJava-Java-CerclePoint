package CerclePoint;

public class Point {
	
	int X;
	int Y;
	
	public Point(int X, int Y){
		this.X = X;
		this.Y = Y;
	}
	
	public void Affiche(){
		System.out.println("Les coordonées du point sont:");
		System.out.println("X:" + X);
		System.out.println("Y:" + Y);
	}

}
