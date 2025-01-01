import java.util.Scanner;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		solve(sc);
	}
	
	public static void solve(Scanner sc) {
		int t=sc.nextInt();
		while(t-->0) {
			int k=sc.nextInt();
			int l=sc.nextInt();
			int r=sc.nextInt();
			
			int totalCount=0;
			for(int i=r;i<=l;i++) {
				int count=1;
				for(int j=i+1;j<=l;j++) {
					if(j%i==0) {
						count++;
					}
					if(count>=k) {
						totalCount++;
						break;
					}
				}
			}
			System.out.println(totalCount);
		}
	} 

}
