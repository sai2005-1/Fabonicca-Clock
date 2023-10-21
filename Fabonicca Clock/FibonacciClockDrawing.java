package Ysai;

import java.awt.Color;

import TurtleGraphics.StandardPen;

public class FibonacciClockDrawing {
	public void Drawing(String i) {
		StandardPen pen = new StandardPen();

		// Clock outline
		pen.home();
		pen.setWidth(4);
		pen.setColor(Color.black);
		pen.up();
		pen.setDirection(180);
		pen.move(300);
		pen.setDirection(90);
		pen.move(150);
		pen.down();
		pen.drawString("Fibonacci Clock: ");
		pen.up();
		pen.setDirection(0);
		pen.move(100);
		pen.setDirection(270);
		pen.move(210);
		pen.down();
		// draw
		pen.setDirection(90);
		pen.move(200);
		pen.setDirection(0);
		pen.move(500);
		pen.setDirection(270);
		pen.move(200);
		pen.setDirection(180);
		pen.move(500);

		// inner clock lines/drawings
		pen.setDirection(90);
		pen.move(150);
		pen.setDirection(0);
		pen.move(150);
		pen.setDirection(90);
		pen.move(50);
		pen.setDirection(0);
		pen.move(25);
		pen.setDirection(270);
		pen.move(25);
		pen.setDirection(180);
		pen.move(25);
		pen.setDirection(270);
		pen.move(25);
		pen.setDirection(0);
		pen.move(25);
		pen.setDirection(90);
		pen.move(25);
		pen.setDirection(270);
		pen.move(25);
		pen.setDirection(180);
		pen.move(175);
		pen.setDirection(0);
		pen.move(175);
		pen.setDirection(270);
		pen.move(150);
		pen.setDirection(180);
		pen.move(175);

		pen.setWidth(2);
		pen.up();
		pen.setDirection(90);
		pen.move(2);
		pen.setDirection(0);
		pen.move(2);

		// Drawing color

		// box (3,4) --> 3x3
		if ((i.substring(3, 4).equals("r") || (i.substring(3, 4).equals("R")))) {
			pen.setColor(Color.red);
		} else if ((i.substring(3, 4).equals("b") || (i.substring(3, 4).equals("B")))) {
			pen.setColor(Color.blue);
		} else if ((i.substring(3, 4).equals("g") || (i.substring(3, 4).equals("G")))) {
			pen.setColor(Color.green);
		} else {
			pen.setColor(Color.white);
		}

		pen.down();
		int count = 0;
		while (count <= 145) {
			pen.setDirection(0);
			pen.move(171);
			pen.setDirection(90);
			pen.move(1);
			pen.setDirection(180);
			pen.move(171);
			count++;
		}
		pen.up();
		pen.setDirection(90);
		pen.move(4);

		// box (2,3) --> 2x2
		if ((i.substring(2, 3).equals("r") || (i.substring(2, 3).equals("R")))) {
			pen.setColor(Color.red);
		} else if ((i.substring(2, 3).equals("b") || (i.substring(2, 3).equals("B")))) {
			pen.setColor(Color.blue);
		} else if ((i.substring(2, 3).equals("g") || (i.substring(2, 3).equals("G")))) {
			pen.setColor(Color.green);
		} else {
			pen.setColor(Color.white);
		}

		pen.down();
		int count1 = 0;
		while (count1 <= 45) {
			pen.setDirection(0);
			pen.move(146);
			pen.setDirection(90);
			pen.move(1);
			pen.setDirection(180);
			pen.move(146);
			count1++;
		}
		pen.up();
		pen.setDirection(0);
		pen.move(150);

		// box (1,2) --> 1x1
		if ((i.substring(1, 2).equals("r") || (i.substring(1, 2).equals("R")))) {
			pen.setColor(Color.red);
		} else if ((i.substring(1, 2).equals("b") || (i.substring(1, 2).equals("B")))) {
			pen.setColor(Color.blue);
		} else if ((i.substring(1, 2).equals("g") || (i.substring(1, 2).equals("G")))) {
			pen.setColor(Color.green);
		} else {
			pen.setColor(Color.white);
		}

		pen.down();
		int count2 = 0;
		while (count2 <= 4) {
			pen.setDirection(0);
			pen.move(21);
			pen.setDirection(270);
			pen.move(1);
			pen.setDirection(180);
			pen.move(21);
			pen.setDirection(0);
			pen.move(21);
			pen.setDirection(270);
			pen.move(1);
			pen.setDirection(180);
			pen.move(21);
			pen.setDirection(0);
			pen.move(21);
			pen.setDirection(270);
			pen.move(1);
			pen.setDirection(180);
			pen.move(21);
			pen.setDirection(0);
			pen.move(21);
			pen.setDirection(270);
			pen.move(1);
			pen.setDirection(180);
			pen.move(21);
			count2++;
		}
		pen.setDirection(0);
		pen.move(21);
		pen.setDirection(270);
		pen.move(1);
		pen.setDirection(180);
		pen.move(21);

		pen.up();
		pen.setDirection(270);
		pen.move(4);

		// box (0,1) --> 1x1
		if ((i.substring(0, 1).equals("r") || (i.substring(0, 1).equals("R")))) {
			pen.setColor(Color.red);
		} else if ((i.substring(0, 1).equals("b") || (i.substring(0, 1).equals("B")))) {
			pen.setColor(Color.blue);
		} else if ((i.substring(0, 1).equals("g") || (i.substring(0, 1).equals("G")))) {
			pen.setColor(Color.green);
		} else {
			pen.setColor(Color.white);
		}

		pen.down();
		int count3 = 0;
		while (count3 <= 5) {
			pen.setDirection(0);
			pen.move(21);
			pen.setDirection(270);
			pen.move(1);
			pen.setDirection(180);
			pen.move(21);
			pen.setDirection(0);
			pen.move(21);
			pen.setDirection(270);
			pen.move(1);
			pen.setDirection(180);
			pen.move(21);
			pen.setDirection(0);
			pen.move(21);
			pen.setDirection(270);
			pen.move(1);
			pen.setDirection(180);
			pen.move(21);

			count3++;
		}
		pen.setDirection(0);
		pen.move(21);
		pen.setDirection(270);
		pen.move(1);
		pen.setDirection(180);
		pen.move(21);
		pen.setDirection(0);
		pen.move(21);
		pen.setDirection(270);
		pen.move(1);
		pen.setDirection(180);
		pen.move(21);
		pen.setDirection(0);
		pen.move(21);
		pen.setDirection(270);
		pen.move(1);
		pen.setDirection(180);
		pen.move(21);

		pen.up();
		pen.setDirection(0);
		pen.move(25);
		pen.setDirection(90);
		pen.move(46);

		// box (4,5) --> 5x5
		if ((i.substring(4, 5).equals("r") || (i.substring(4, 5).equals("R")))) {
			pen.setColor(Color.red);
		} else if ((i.substring(4, 5).equals("b") || (i.substring(4, 5).equals("B")))) {
			pen.setColor(Color.blue);
		} else if ((i.substring(4, 5).equals("g") || (i.substring(4, 5).equals("G")))) {
			pen.setColor(Color.green);
		} else {
			pen.setColor(Color.white);
		}

		pen.down();
		int count4 = 0;
		while (count4 <= 195) {
			pen.setDirection(0);
			pen.move(321);
			pen.setDirection(270);
			pen.move(1);
			pen.setDirection(180);
			pen.move(321);
			count4++;
		}

	}

}