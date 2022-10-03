SubAlgoritmo  escribirConSubrayado( mitexto)
	longi = Longitud(mitexto)
	escribir mitexto;
	Para x <- 1 Hasta longi Hacer
		Escribir Sin Saltar "-"
	FinPara
	Escribir "";
FinSubAlgoritmo



funcion resultado = valorAbsoluto(unNum)
	
	escribir "DIme un numero"
	leer num
	si num < 0 Entonces
		resultado = -1 * num;
	SiNo
		
		resultado= num
		
	FinSi
	
FinFuncion


Algoritmo sin_titulo
	
	
	
	definir mitexto como texto;
	definir longi como entero;
	definir num como entero
	
	
	escribir "El valor absoluto de" num "es; ", valorAbsoluto(num);	
	
	
	
	escribirConSubrayado("Primero ejemplo");

	escribirConSubrayado("Este es el segundo ejemplo");
	
	escribirConSubrayado("Tercer ejemplo");
	
	
FinAlgoritmo
