package hw;
import java.util.ArrayList;
import java.util.Scanner;
public class hw01_105021017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList <Student> nameList = new ArrayList <Student>();
        Scanner scn = new Scanner(System.in);
        int i = 1;
        while(true){
        	System.out.println("請輸入第"+i+"位同學的名字:");
        	String name = scn.next();
        	System.out.println("請輸入第"+i+"位同學的ID:");
        	String id = scn.next();
        	System.out.println("請輸入第"+i+"位同學的成績:");
        	int score = scn.nextInt();
        	nameList.add(name , id , score);
        }
	}

}
