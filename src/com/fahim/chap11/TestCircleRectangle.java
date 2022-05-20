/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fahim.chap11;

public class TestCircleRectangle {
  public static void main(String[] args) {
    CircleFromSimpleGeometricObject circle = 
      new CircleFromSimpleGeometricObject(1);
    System.out.println("A circle " + circle.toString());
    System.out.println("The color is " + circle.getColor());
    System.out.println("The radius is " + circle.getRadius());
    System.out.println("The area is " + circle.getArea());
    System.out.println("The diameter is " + circle.getDiameter());
    
    RectangleFromSimpleGeometricObject rectangle =
      new RectangleFromSimpleGeometricObject(2, 4);
    System.out.println("\nA rectangle " + rectangle.toString());
    System.out.println("The area is " + rectangle.getArea());
    System.out.println("The perimeter is " + 
      rectangle.getPerimeter());
  }
}
