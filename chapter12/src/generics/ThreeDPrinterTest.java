package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		
		Powder powder = printer.getMaterial();
		
		System.out.println(printer);
		
		ThreeDPrinter<Plastic> pPrinter = new ThreeDPrinter<Plastic>();
		pPrinter.setMaterial(new Plastic());
		
		Plastic plastic = pPrinter.getMaterial();
		
		System.out.println(plastic);
		
//		ThreeDPrinter<Water> wPrinter = new ThreeDPrinter<Water>();
//		wPrinter.setMaterial(new Water());
//		
//		Water water = wPrinter.getMaterial();
//		
//		System.out.println(water);
		
	}

}
