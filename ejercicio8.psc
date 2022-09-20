Algoritmo ejercicio8
	//Diseña un algoritmo que, dados dos números enteros, muestre por pantalla uno
	//de estos mensajes: "El segundo es el cuadrado exacto del primero.", "El segundo es menor
    //que el cuadrado del primero." o "El segundo es mayor que el cuadrado del primero.",
	//dependiendo de la verificación de la condición correspondiente al significado de cada mensaje.
	
	definir num1, num2 Como Entero
	escribir "Ingresa el primre numero"
	leer num1
	
	Escribir "ingresa el segundo numero"
	leer num2
	
	Si num2=num1*2 Entonces
		escribir "El segundo numero es el cuadrado exacto del primero"
	FinSi
	
	Si num2<num1*2 Entonces
	
		escribir "El segundo es menor que el cuadrado del primero"
		
	Fin Si
	
	Si num2>num1*2 Entonces
		escribir "EL segundo es mayor que el cuadrado del primero"

	Fin Si
	
	
	
FinAlgoritmo
