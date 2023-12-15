package SwitchStatement;

//It is possible to declare final variables as a case label. 
//Because the variables are replaced with constants during compilation.

public class Switch2 {
	public static void main(String[] args) {
		final int a = 10;
		switch(a)
		{
		case a:System.out.println("Parth");
		break;
		default:System.out.println("Sai");
		break;
		}
	}

}
