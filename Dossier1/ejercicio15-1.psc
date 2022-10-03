Algoritmo ejercicio15
	
	
	Dimension almacen[7]
	
	

	Escribir "Vamos a calcular el minimo y el maximo de 7 numeros"
	Para i<-0 hasta 6 con paso 1 Hacer
		Escribir "Dame el ", i+1 "º numero"
		leer almacen[i]
		
	FinPara
	
	
	//CALcular minimo
	
	minimo=1000
	maximo=-1000
	k = 0
	
	
	Mientras k<7 Hacer
		escribir almacen[k];
		si minimo < almacen[k] Entonces
			minimo = almacen[k]
		FinSi
		
		si minimo > almacen[k] Entonces
			minimo = almacen[k]
		FinSi
		
		k = k + 1;
	Fin Mientras
	
	Escribir minimo;
	escribir maximo;
	
	
	
	
FinAlgoritmo

	
	
// 