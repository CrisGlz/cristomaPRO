Algoritmo Ejercicio11
	//mplementa un algoritmo que muestre todos los múltiplos de n entre n y m·n,
	//ambos inclusive, donde n y m son números introducidos por el usuario
	
	definir num1, num2 como entero
	

	
	escribir "Dame el primer numero"
	leer num1
	escribir "Dame el segundo numero"
	leer num2
	
	i=num1
	
	Repetir
		Si i%num1=0 Entonces
			escribir i
		i=i+num1
		FinSi
	Hasta Que i=num2*num1
	escribir i
	
	
	

	
	
	
FinAlgoritmo
