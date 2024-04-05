
public class OperatorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int result = add(5, 3);
	        System.out.println("Result: " + result); // Outputs: 8

	        String concatenated = concatenate("Hello", " ", "World");
	        System.out.println(concatenated);
	}
	public static int add(int a, int b) {
        return a + b;
    }

    // Method to concatenate strings
    public static String concatenate(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }
}
