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
        	System.out.println("請輸入第"+i+"位同學的名字,ID,成績:");
        	nameList.add(new Student(scn.next() , scn.next() , scn.nextInt()));
        }
        for(int a=0 ; a<nameList.size() ; a++){
    		for(int b=a+1 ; b<nameList.size() ; b++){
    			if(((Student)nameList.get(b)).getScore()>((Student)nameList.get(a)).getScore()){
    				String tmp = nameList.get(a);
    				nameList.set(a , nameList.get(b));
    				nameList.set(b , tmp);
    			}
    		}
    	}
	}

}
