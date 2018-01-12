import java.util.ArrayList;
import java.util.Random;
public class randomZeros {

	public static void main(String[] args) {
	Random rand = new Random();
	ArrayList<Integer>numsRandom = new ArrayList<Integer>();
	for(int i=0;i<10;i++){
	numsRandom.add(rand.nextInt(101));
	
	}
System.out.print(numsRandom);
	for(int i=0; i<10; i++){
	numsRandom.set(i, 0);
	}
System.out.println(numsRandom);
}
}