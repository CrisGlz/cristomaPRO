Algoritmo ejercicio15
	
	//Calcular usando un array, el valor m�nimo, m�ximo y valor medio de 7
	//n�meros introducidos por el usuario. El programa le ir� pidiendo todos los n�meros y
	//cuando se hayan introducido mostrar� el menor de los n�meros, el mayor y el valor medi
	
	//Listamos el contenido del array
	
	
	Definir almacen Como Entero
	Dimension almacen[7]
	
	
	Escribir "Vamos a calcular la media de 7 numeros"
	
	Para i<-0 hasta 6 con paso 1 Hacer
		Escribir "Dame el numero de la poscicion " i+1
		Leer almacen[i]

	FinPara
	
	suma=0
	Para i=0 Hasta 6 Con Paso 1 Hacer
		suma = suma + almacen[i]
	Fin Para
	media = suma/7
	
	
	
	minimo=almacen[0]
	Para i=0 hasta 6 con paso 1 Hacer
		si minimo > almacen[i] Entonces
			minimo= almacen[i]
		FinSi
	FinPara
	
	
	
	maximo=almacen[0]
	Para i=0 hasta 6 con paso 1 Hacer
		si maximo < almacen[i] Entonces
			maximo= almacen[i]
		FinSi
	FinPara

	
	
	
	Escribir "La media resultando es: ", media;
	escribir "El minimo resultado es: ", minimo;
	escribir "El maximo resultado es: ", maximo;
	
FinAlgoritmo
