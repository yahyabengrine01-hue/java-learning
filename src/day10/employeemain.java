package day10;

public class employeemain {

	public static void main(String[] args) {
		
		//we can run main class in a separate class ;
		//we can do thats the two classes are the same package ;
		//but if the other classes are on other package it s still wprkts ;
		//but we should write this importe statment/import.packgename.classname;
		
		employee emp1= new employee(); //object 
		emp1.eid=123;
		emp1.ename="mike";
		emp1.job="elictric";
		emp1.sal=100;
		emp1.display();
		
		employee emp2=new employee();
		emp2.eid=90; 
		emp2.ename="john";
		emp2.job="security";
		emp2.sal=45;
		emp2.display();

	}

}
