//Dise�a un algoritmo que, dado un n�mero entero, muestre por pantalla el
//mensaje "El n�mero es par." cuando el n�mero sea par y el mensaje "El n�mero es impar."
//cuando sea impar. (Una pista: un n�mero es par si el resto de dividirlo por 2 es 0, e impar en
//caso contrario.)


Algoritmo parimpar
	
	definir num como entero
	Escribir "Por favor ingrese un n�mero"
	Leer num
	
	si num%2=0 Entonces
		Escribir num," es un n�mero par"
	SiNo
		Escribir num," no es un n�mero par"
	FinSi
	
FinAlgoritmo