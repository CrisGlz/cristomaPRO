//Dise�a un algoritmo que, dado un n�mero entero, determine si �ste es el doble
//de un n�mero impar. (Ejemplo: 14 es el doble de 7, que es impar.)


Algoritmo numero_entero
	
	definir num1, num2, num3 como entero
	Escribir "Por favor ingrese un n�mero"
	Leer num
	
	mitadnum1 = trunc(num1 / 2)
	
	si mitadnum1 % 2 = 1 Entonces
		Escribir "Viene de un n�mero impar"
		
	SiNo
		Escribir "Viene de un n�mero par"
		
	FinSi
	
	
FinAlgoritmo
