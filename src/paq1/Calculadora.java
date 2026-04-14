package paq1;

public class Calculadora {
private int n1,n2,n3;
private double num1,num2;
public Calculadora(int n1, int n2) {
	super();
	this.n1 = n1;
	this.n2 = n2;
}
public Calculadora(int n1, int n2, int n3) {
	super();
	this.n1 = n1;
	this.n2 = n2;
	this.n3 = n3;
}
public Calculadora(double num1, double num2) {
	super();
	this.num1 = num1;
	this.num2 = num2;
}
public int getN1() {
	return n1;
}
public void setN1(int n1) {
	this.n1 = n1;
}
public int getN2() {
	return n2;
}
public void setN2(int n2) {
	this.n2 = n2;
}
public int getN3() {
	return n3;
}
public void setN3(int n3) {
	this.n3 = n3;
}
public double getNum1() {
	return num1;
}
public void setNum1(double num1) {
	this.num1 = num1;
}
public double getNum2() {
	return num2;
}
public void setNum2(double num2) {
	this.num2 = num2;
}
public int Sumar(int n1, int n2) {
	return n1+n2;
}
public int Sumar(int n1,int n2, int n3) {
	return n1+n2+n3;
}
public double Sumar(double num1,double num2) {
	return num1 + num2;
}
}

//Holaaaaaaaaaaa
