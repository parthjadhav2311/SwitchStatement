//Inside the switch the case labels must be unique; if we are declaring duplicate case labels the compiler will raise compilation error “duplicate case label”.

package SwitchStatement;

public class Duplicatecaselabel {
	public static void main(String[] args)
	{ 
		int a=30;
	switch (a)
	{ 
	case 10:System.out.println("Sai");
	break;
	case 20:System.out.println("Kanak");
	break;
	default:System.out.println("Ira");
	break;
	}
	}
	}


