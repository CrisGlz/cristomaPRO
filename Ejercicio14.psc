
funcion restocomb = combinacion(m,n)
	restocomb= factorial(n) / (factorial(m) * factorial(n-m))
FinFuncion




funcion j=factorial(n)
	
	leer num;
	j=1
	Para i=1 Hasta num Con Paso 1;
		j=j*i;
		
	FinPara;
	
FinFuncion


	


Algoritmo practica14
	
	escribir "CAlculemos la combinacion de dos numeros";
	definir num1, num2 Como Entero
	
	Repetir
		escribir "Introduzcamos el primer num"
		leer num1
		escribir "Introduzcamos el segundo num"
		leer num2
	Hasta Que num1>num2
	
	escribir "El resultado es " restocomb
	
	
	
	
	
	
FinAlgoritmo
