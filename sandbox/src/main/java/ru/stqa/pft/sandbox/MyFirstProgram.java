package ru.stqa.pft.sandbox;

/*
Instead long command you can use short key-word. It is actual for often-used command.
You are writing, for example, 'sout' and Idea shows you different possible command
Then we need to choose one of them and press Enter, and key-word would be automatically change on real command.
So, if you wrote 'sout' and  pressed 'Enter' immediately - it will be changed on 'System.out.println();'
 */

public class MyFirstProgram {

  public static void main(String[] args) {
    System.out.println("Hello, world!");  //could be use key-word 'sout'

    Point p1 = new Point(3.0, 4.5);
    Point p2 = new Point(-2.2, 7.5);
    System.out.println("The distance between two points = " + distance(p1, p2));

  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt((p2.x - p1.x)*(p2.x - p1.x) + (p2.y - p1.y)*(p2.y - p1.y));
//    return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
  }

}