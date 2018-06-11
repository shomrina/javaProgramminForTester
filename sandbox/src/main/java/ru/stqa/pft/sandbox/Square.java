package ru.stqa.pft.sandbox;
/*
 Класс Квадрат
 */

public class Square {
  double l;

  public Square(double l){
    this.l = l;
  }

  //вычисляет площадь квадрата
  public double area() {
    return this.l * this.l;
  }
}
