//Diseña un algoritmo que, dado un número entero, determine si éste es el doble
//de un número impar. (Ejemplo: 14 es el doble de 7, que es impar.)


Algoritmo numero_entero
	
	definir num1, num2, num3 como entero
	Escribir "Por favor ingrese un número"
	Leer num
	
	mitadnum1 = trunc(num1 / 2)
	
	si mitadnum1 % 2 = 1 Entonces
		Escribir "Viene de un número impar"
		
	SiNo
		Escribir "Viene de un número par"
		
	FinSi
	
	
FinAlgoritmo
