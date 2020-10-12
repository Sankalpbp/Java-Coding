import java.util.*;

public class PolyNode {
		
	public int power;
	public int coefficient;
	public PolyNode next;

	public PolyNode () {}

	public PolyNode (int power, int coefficient) {
		this.power = power;
		this.coefficient = coefficient;
		this.next = null;
	}
}
