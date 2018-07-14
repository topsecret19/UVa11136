import java.util.Scanner;
import java.util.TreeSet;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int test= sc.nextInt();
int bDay;
while(true) {
	if(test==0) {
		break;
	}
	int total=0;
	TreeSet<Integer> bills = new TreeSet<Integer>();
	int[] arr = new int[1000001];
	bills.clear();
	while(test-->0) {
		bDay=sc.nextInt();
		for(int i=0; i<bDay; i++) {
			int x= sc.nextInt();
			bills.add(x);
			arr[x]++;
		}
		int biggest = bills.last();
		int lowest = bills.first();
		total+=biggest-lowest;
		arr[biggest]--;
		arr[lowest]--;
		if(arr[biggest]==0) {
			bills.remove(biggest);
		}
		if(arr[lowest]==0) {
		bills.remove(lowest);
		}
	}
	System.out.println(total);
	test=sc.nextInt();
}
}

}
