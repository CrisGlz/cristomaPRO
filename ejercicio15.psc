Algoritmo ejercicio15
	
	//Calcular usando un array, el valor m�nimo, m�ximo y valor medio de 7
	//n�meros introducidos por el usuario. El programa le ir� pidiendo todos los n�meros y
	//cuando se hayan introducido mostrar� el menor de los n�meros, el mayor y el valor medi
	
	//Listamos el contenido del array
	
	Dimension almacen[7]
	
	Escribir "Vamos a calcular la media de 7 numeros"
	Para i<-0 hasta 6 con paso 1 Hacer
		Escribir "Dame el ", i+1 "� numero"
		leer almacen[i]

	FinPara
	
	suma=0
	Para i=0 Hasta 6 Con Paso 1 Hacer
		suma = suma + almacen[i]
	Fin Para
	media = suma/7
	
	Escribir "La media resultando es: ", media;
	
FinAlgoritmo
