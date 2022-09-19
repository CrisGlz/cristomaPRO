//Diseña un algoritmo que, dado un número entero, muestre por pantalla el
//mensaje "El número es par." cuando el número sea par y el mensaje "El número es impar."
//cuando sea impar. (Una pista: un número es par si el resto de dividirlo por 2 es 0, e impar en
//caso contrario.)


Algoritmo parimpar
	
	definir num como entero
	Escribir "Por favor ingrese un número"
	Leer num
	
	si num%2=0 Entonces
		Escribir num," es un número par"
	SiNo
		Escribir num," no es un número par"
	FinSi
	
FinAlgoritmo