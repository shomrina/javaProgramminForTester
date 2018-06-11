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

    Square s = new Square(5);
    System.out.println("The area of square with side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(5, 6);
    System.out.println("The area of rectangle with sides " + r.a + " and " + r.b + " = " + r.area());

    Point p1 = new Point(3.0, 4.5);
    Point p2 = new Point(-2.2, 7.5);
    System.out.println("The distance between two points = " + p1.distance(p2));

  }


}