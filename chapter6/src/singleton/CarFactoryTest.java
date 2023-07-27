package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance();
		
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	
		
		Car yourSonata1 = factory.createCar();
		Car yourSonata2 = factory.createCar();
		System.out.println(yourSonata1.getCarNum());
		System.out.println(yourSonata2.getCarNum());

		
	}

}
