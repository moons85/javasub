package tmp02;

import java.util.Scanner;

public class Q369 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
		//    System.out.printf("i = %d",i);
		    int tmp = i;
		    if(!(tmp%10%3 ==0 && tmp%10!=0)) {
		    	if(tmp<10) {
		    		System.out.print(i);
		    	}else if(tmp/10%3!=0) {
		    	 System.out.print(i);
		    	}else System.out.print("짝!");
		    }else {
			    do {
			    	if(tmp%10%3 ==0&& tmp%10!=0) {
			        System.out.print("짝!");
			    	}
			    }while((tmp/=10)!=0);
		    }
		    System.out.println();
		}
	}

}
