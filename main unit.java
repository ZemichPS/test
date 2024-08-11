
public class Main {
    public static void main(String[] args) {
        if(args[1].equals("name")) throw IlligalArgumentExceptional("Illigal argument");
		System.out.println("go on!");
    }
}