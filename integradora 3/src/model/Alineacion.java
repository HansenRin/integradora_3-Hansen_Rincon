package model;

public class Alineacion{

	//Atributes
	private String fecha;
	private Tactica tactica;
	private int formacion[][] = new int[10][7];

	public Alineacion(String fecha, int ptactica, int pformacion){
		this.fecha = fecha;
		switch(ptactica){
			case 1:
			this.tactica = Tactica.POSESION; break;
			case 2:
			this.tactica = Tactica.CONTRAATAQUE; break;
			case 3:
			this.tactica = Tactica.PRESION_ALTA; break;
			case 4:
			this.tactica = Tactica.DEFECTO;
		}

		if (pformacion == 1) {
			formacion[8][1] = 1;
			formacion[8][2] = 1;
			formacion[8][4] = 1;
			formacion[8][5] = 1;
			formacion[5][1] = 1;
			formacion[5][2] = 1;
			formacion[5][4] = 1;
			formacion[5][5] = 1;
			formacion[2][1] = 1;
			formacion[2][5] = 1;
		}

		if (pformacion == 2) {
			formacion[8][1] = 1;
			formacion[8][2] = 1;
			formacion[8][4] = 1;
			formacion[8][5] = 1;
			formacion[5][2] = 1;
			formacion[5][3] = 1;
			formacion[5][4] = 1;
			formacion[2][2] = 1;
			formacion[2][3] = 1;
			formacion[2][4] = 1;		
		}

		if (pformacion == 3) {
			formacion[8][1] = 1;
			formacion[8][2] = 1;
			formacion[8][3] = 1;
			formacion[8][4] = 1;
			formacion[8][5] = 1;
			formacion[5][2] = 1;
			formacion[5][3] = 1;
			formacion[5][4] = 1;
			formacion[2][1] = 1;
			formacion[2][5] = 1;
			
		}
	}
}