package chap01;

public class Printer {
	
	public Printer() {
		
	}

	private int print_int;
	private boolean print_boolean;
	private double print_double;
	private String print_String;
	
	public int getPrint_int() {
		return print_int;
	}

	public void setPrint_int(int print_int) {
		this.print_int = print_int;
	}

	public boolean isPrint_boolean() {
		return print_boolean;
	}

	public void setPrint_boolean(boolean print_boolean) {
		this.print_boolean = print_boolean;
	}

	public double getPrint_double() {
		return print_double;
	}

	public void setPrint_double(double print_double) {
		this.print_double = print_double;
	}

	public String getPrint_String() {
		return print_String;
	}

	public void setPrint_String(String print_String) {
		this.print_String = print_String;
	}
	
	
	public static void println(int _int) {
//		this.setPrint_int(_int);
		System.out.println(_int);
	}
	
	public static void println (boolean _boolean) {
//		this.setPrint_boolean(_boolean);
		System.out.println(_boolean);
	}
	
	public static void println (double _double) {
//		this.setPrint_double(_double);
		System.out.println(_double);
	}
	
	public static void println (String _String) {
//		this.setPrint_String(_String);
		System.out.println(_String);
	}
	
}
