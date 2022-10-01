//Práctica 17 Modificar el anterior para que sirva con cualquier cantidad de números 
//mayores que se quiera tener guardados

//introducidos por teclado


Algoritmo Ejercicio17
	Dimension datos[11]; //He reciclado el ejercicio 16 pero no se como poner aqui para que sirva con cualquier numero deseado
	Escribir "Ingrese la cantidad de numeros:";
	Leer n;
	Para i<-1 Hasta n Hacer
		Escribir "Ingrese el " i " numeros";
		Leer datos[i];
	FinPara
	Si datos[1]>datos[2] Entonces
		numero1<-datos[1];
		numero2<-datos[2];
	Sino
		numero1<-datos[2];
		numero2<-datos[1];
	FinSi
	Para i<-3 Hasta n Hacer
		Si datos[i]>numero1 Entonces
			numero2<-numero1;
			numero1<-datos[i];
		Sino
			Si datos[i]>numero2 Entonces
				numero2<-datos[i];
			FinSi
		FinSi
	FinPara
	Escribir "El mayor elemento es: ",numero1;
	Escribir "El segundo mayor elemento es: ",numero2;
	
	
FinAlgoritmo
