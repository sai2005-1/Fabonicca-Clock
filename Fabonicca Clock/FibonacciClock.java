package Ysai;

import java.util.Scanner;
public class FibonacciClock {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
		//CountTime ct = new CountTime();
		int h = 0, m = 0;
		System.out.print("Give a input (ex:RWBGR): ");
		String i = reader.nextLine();
		FibonacciClockDrawing object = new FibonacciClockDrawing();
		
		
		if(i.length()!=5){
    		while (i.length() != 5) {
    			System.out.print("Give a input (ex:RWBGR): ");
    			i = reader.nextLine();
    	}
		}

		// ct.Time(input, hours, minutes);

		int c = 0;
		// first box
		if ((i.substring(0, 1).equals("r"))||(i.substring(0, 1).equals("R"))) {
			h++;
		} else if ((i.substring(0, 1).equals("g"))||(i.substring(0, 1).equals("G"))) {
			m++;
		} else if ((i.substring(0, 1).equals("b"))||(i.substring(0, 1).equals("B"))) {
			h++;
			m++;
		} else {
			c++;
		}

		// second box
		if ((i.substring(1, 2).equals("r"))||(i.substring(1, 2).equals("R"))) {
			h++;
		} else if ((i.substring(1, 2).equals("g"))||(i.substring(1, 2).equals("G"))) {
			m++;
		} else if ((i.substring(1, 2).equals("b"))||(i.substring(1, 2).equals("B"))) {
			h++;
			m++;
		} else {
			c++;
		}

		// third box
		if ((i.substring(2, 3).equals("r"))||(i.substring(2, 3).equals("R"))) {
			h += 2;
		} else if ((i.substring(2, 3).equals("g"))||(i.substring(2, 3).equals("G"))) {
			m += 2;
		} else if ((i.substring(2, 3).equals("b"))||(i.substring(2, 3).equals("B"))) {
			h += 2;
			m += 2;
		} else {
			c++;
		}

		// fourth box
		if ((i.substring(3, 4).equals("r"))||(i.substring(3, 4).equals("R"))) {
			h += 3;
		} else if ((i.substring(3, 4).equals("g"))||(i.substring(3, 4).equals("G"))) {
			m += 3;
		} else if ((i.substring(3, 4).equals("b"))||(i.substring(3, 4).equals("B"))) {
			h += 3;
			m += 3;
		} else {
			c++;
		}

		// fifth box
		if ((i.substring(4, 5).equals("r"))||(i.substring(4, 5).equals("R"))) {
			h += 5;
		} else if ((i.substring(4, 5).equals("g"))||(i.substring(4, 5).equals("G"))) {
			m += 5;
		} else if ((i.substring(4, 5).equals("b"))||(i.substring(4, 5).equals("B"))) {
			h += 5;
			m += 5;
		} else {
			c++;
		}
		
		m=m*5;
		if(m>=60)
		{
		    m -=60;
		    h += 1;
		}
		if(h>=12)
		{
		    h -= 12;
		}
		
		if(h<10)
		{
		    System.out.print("0"+h+" : ");
		}
		else
		{
		    System.out.print(h+" : ");
		}
		
		if(m<10)
		{
		    System.out.print("0"+m);
		}
		else
		{
		    System.out.print(m);
		}
		
	
				object.Drawing(i);
				
		reader.close();
      
    }
}