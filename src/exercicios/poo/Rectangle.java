/*Classe pertencente a classe Exercicio1POO*/

package exercicios.poo;

public class Rectangle {

	/* atributos */
	public double width; /* largura */
	public double height; /* altura */

	/* calculo da area */
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	
	
	
	

}
