package model;

public class Camerino{

	//Atributes
	private static int camerinoA[][] = {{1,0,1,0,1,0,1},{0,1,0,1,0,1,0},{1,0,1,0,1,0,1},{0,1,0,1,0,1,0},{1,0,1,0,1,0,1},{0,1,0,1,0,1,0}};
	private static int camerinoB[][] = {{1,0,1,0,1,0,1},{0,1,0,1,0,1,0},{1,0,1,0,1,0,1},{0,1,0,1,0,1,0},{1,0,1,0,1,0,1},{0,1,0,1,0,1,0},{1,0,1,0,1,0,1}};

	public int[][] asignarCamerino(int opcion){
		if (opcion == 1) {
			return camerinoA;
		}
		else if (opcion == 2) {
			return camerinoB;
		}
		else{
			System.out.println("esa no es una opcion");
		}
		return null; 
	}
}