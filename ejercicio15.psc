
//Práctica 15: Calcular usando un array, el valor mínimo, máximo y valor medio de 7 
//números introducidos por el usuario. El programa le irá pidiendo todos los números y 
//cuando se hayan introducido mostrará el menor de los números, el mayor y el valor medio


Algoritmo ejercicio15
	Definir almacen, num como entero
	Dimension almacen[7]
	
	
	Para i=0 Hasta 6 Con Paso 1 hacer //definimos el blucle para la posicion del almacen
		Escribir "Introduce el numero en la posicion " i+1
		Leer almacen[i]
		
	FinPara
	
	minimo=almacen[0]
	para i=0 hasta 6 con paso 1 Hacer //definimos bucle para el minimo
		Si almacen[i]<minimo Entonces
			minimo= almacen[i]
		FinSi
		
		
	FinPara
	
	maximo=almacen[0]
	para i=0 hasta 6 con paso 1 Hacer // definimos bucle para el maximo
		si almacen[i]>maximo Entonces
			maximo=almacen[i]
		FinSi
	FinPara
	
	
	
	mitad=0
	para i=0 hasta 6 Con Paso 1 Hacer //definimos bucle para la mitad
		mitad=mitad+almacen[i]
		
	FinPara
	mitad=mitad/7
	
	
	
	//Ponemos resultado
	
	Escribir "El minimo es: " minimo
	Escribir "El maximo es: " maximo
	Escribir "La mitad es: " Mitad
	
	
	
FinAlgoritmo
