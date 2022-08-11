package comparator;

  enum Marks {
	Physics(85),
	Chemistry(86),
	Maths(95);

	private int value;
	
	private Marks(int value) {
		this.value=value;
		
	}
	
	
	public int getValue() {
		return value;
		
	}

}

final public class Subject{
	public static void main(String...args) {
		int sum=0;
		for (Marks o: Marks.values()) {
			sum+=o.getValue();
			
			
		}
		System.out.println("sum="+sum);
	}
}

