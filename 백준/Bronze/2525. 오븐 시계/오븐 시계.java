import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        
        sc.close();
        
        int min;
        int hour;
        
        min = h * 60 + m;
        min = min + t;
        
        hour = (min/60)%24;
        min = min%60;
        
        System.out.println(hour + " " + min);
	}
}