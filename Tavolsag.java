
import java.util.Scanner;

/*
* File: ButtonPanel.java
* Author:Megyeri Márk Máté 
* Copyright: 2022, Megyeri Márk
* Group: Szoft I/N
* Date: 2022-02-22
* Github: https://github.com/megyeri/
* Licenc: GNU GPL
*/
 


class Tavolsag{
public static void main(String[] args){
System.out.println("Megyeri Mark Mate");
System.out.println("2022.02.22");
System.out.println("Szoft I/N");


Scanner sc = new Scanner(System.in);
System.out.print("Magassag : ");
double aoldal=sc.nextDouble();


System.out.print("epulet szoge :");
double szog=sc.nextDouble();
 



double a=Math.sin(aoldal* Math.PI/180);
double d = Math.sin(Math.toRadians(a));
System.out.println("Elottunk levo epulet tavolsaga: "+ d);
}
}
