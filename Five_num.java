import java.util.*;
public class Five_num{
	public static void main(String args[]){
		int[]num = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three digit no.");
		for(int i=0;i<5;i++){
			num[i]=sc.nextInt();
			}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

	}
}
