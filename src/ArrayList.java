import java.util.*;
public class ArrayList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);		
	}

}
