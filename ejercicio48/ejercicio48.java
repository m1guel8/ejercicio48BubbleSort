package ejercicio48;

import java.util.Scanner;

public class ejercicio48 {
//ejercicio48real
	public static void main(String[] args) {
    int[] numbersDnis = new int[10];
    int bigNumber,lessNumber;
    Scanner scanner = new Scanner(System.in);
    for(int i = 0;i<numbersDnis.length;i++){
    System.out.println("Ingrese el numero N "+(i+1)+" : ");
    numbersDnis[i] = scanner.nextInt();
    }
    
    for(int j=0;j<numbersDnis.length-1;j++) {
    	for(int i =0;i<numbersDnis.length-1;i++) {
    		if(numbersDnis[i]>numbersDnis[i+1]) {
    			bigNumber=numbersDnis[i];
    			numbersDnis[i]=numbersDnis[i+1];
    			numbersDnis[i+1] = bigNumber;
    		}
    	}
    }
    System.out.println("Lista ordenada de menor a mayor: ");
    for(int i = 0;i<numbersDnis.length;i++) {
    	System.out.println(numbersDnis[i]);
    	
    }
    for(int j=0;j<numbersDnis.length-1;j++) {
    	for(int i =0;i<numbersDnis.length-1;i++) {
    		if(numbersDnis[i]<numbersDnis[i+1]) {
    			lessNumber=numbersDnis[i];
    			numbersDnis[i]=numbersDnis[i+1];
    			numbersDnis[i+1] = lessNumber;
    		}
    	}
    }
    System.out.println("Lista ordenada de mayor a menor: ");
    for(int i = 0;i<numbersDnis.length;i++) {
    	System.out.println(numbersDnis[i]);
	}

	}}
