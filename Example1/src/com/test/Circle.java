package com.test;

public class Circle extends Figure {

	private double radius;

	private static final double PI = 3.1415;

	public Circle(double r, String name) {

		super(name);

		radius = r;

	}

	public String toString() {

		return "I'm a circle of radius " + radius;

	}

	public double calculateArea() {

		return PI * radius * radius;

	}

	public double calculatePerimeter() {

		return 2 * PI * radius;

	}
}
