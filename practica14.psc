//Usando el código anterior como una función desarrollar el siguiente programa:
//El número de combinaciones que podemos formar tomando m elementos de un conjunto
//con n elementos es: C(m,n) = n! / (n ? m)!m! . Diseña un algoritmo que pida el valor de n y
//m y calcule Cm n . (Ten en cuenta que n ha de ser mayor o igual que m.) (Puedes
//comprobar la validez de tu programa introduciendo los valores n = 15 y m = 10: el
//	resultado es 3003.)


funcion restocomb = combinacion(n,m)
	restocomb= factorial(n) / (factorial(m) * factorial(n-m))
FinFuncion




funcion j=factorial(n)
	
	
	j=1
	Para i=1 Hasta n Con Paso 1;
		j=j*i;
		
	FinPara;
	
FinFuncion


	


Algoritmo practica14
	
	escribir "CAlculemos la combinacion de dos numeros";
	definir num1, num2, num, m, n Como Entero
	
	Repetir
		escribir "Introduzcamos el primer num"
		leer num1
		escribir "Introduzcamos el segundo num"
		leer num2
	Hasta Que num1>num2
	
	escribir "El resultado es " combinacion(num1,num2)
	
	
	
	
	
	
FinAlgoritmo
