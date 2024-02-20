import java.util.HashMap;
import java.util.Map;

public class Book {
	int Bid;
	String Bname;
	
	Book(int Bid, String Bname)
	{
		this.Bid = Bid;
		this.Bname = Bname;
		
	}

}
class BookMain{
	public static void main() {
		Map<Integer,Book> m = new HashMap<Integer,Book>();
		Book b1 = new Book(101, "x");
		Book b2 = new Book(102, "y");
		m.put(1, b1);
		m.put(2,b2);
		for(Map.Entry m1: m.entrySet()) {
			int y = m1.getKey();
			Book b1 = m1.getValue();
			
		}
		System.out.println(b1.Bid+" "+b1.Bname+y);
		
	}
}
