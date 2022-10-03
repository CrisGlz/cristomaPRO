Algoritmo ejercicio13
	
	//Queremos hacer un algoritmo que calcule el factorial de un número entero
	//positivo. El factorial de n se denota con n!, pero no existe ningún operador que permita
	//efectuar este cálculo directamente. Sabiendo que n! = 1 · 2 · 3 · . . . · (n ? 1) · n y que 0! = 1,
	//haz un algoritmo que pida el valor de n y muestre por pantalla el resultado de calcular n!
	
	
	definir num, i Como Entero;
	j=1
	
	escribir "Dime un numero que quieras Factorizar";
	leer num;
	
	Para i=1 Hasta num Con Paso 1;
		j=j*i;
		
	FinPara;
	
	escribir "El numero factorizado de " num " es " j;
	
	
	
	
FinAlgoritmo
