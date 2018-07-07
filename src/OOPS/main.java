package OOPS;

public class main {

	public static void main(String[] args) {
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("North");
		Wall wall4 = new Wall("South");
		Ceiling c = new Ceiling(12,"white");
		Bed b =  new Bed("modern",4,3,2,1);
		Lamp l = new Lamp("classic",false,75);
		
		BedRoom br = new BedRoom("Sumo's room",wall1,wall2,wall3,wall4,c,b,l);
		br.makingBed();
		br.getLamp().turnOn();
		


	}

}
