Algoritmo ejercicio15
	
	//Calcular usando un array, el valor mínimo, máximo y valor medio de 7
	//números introducidos por el usuario. El programa le irá pidiendo todos los números y
	//cuando se hayan introducido mostrará el menor de los números, el mayor y el valor medi
	
	//Listamos el contenido del array
	
	Dimension almacen[7]
	
	Escribir "Vamos a calcular la media de 7 numeros"
	Para i<-0 hasta 6 con paso 1 Hacer
		Escribir "Dame el ", i+1 "º numero"
		leer almacen[i]

	FinPara
	
	suma=0
	Para i=0 Hasta 6 Con Paso 1 Hacer
		suma = suma + almacen[i]
	Fin Para
	media = suma/7
	
	Escribir "La media resultando es: ", media;
	
FinAlgoritmo
