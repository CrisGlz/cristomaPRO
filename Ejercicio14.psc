

//Pr�ctica 14: Usando el c�digo anterior como una funci�n desarrollar el siguiente programa:
//El n�mero de combinaciones que podemos formar tomando m elementos de un conjunto 
//con n elementos es: C(m,n) = n! / (n ? m)!m! . Dise�a un algoritmo que pida el valor de n y 
//m y calcule Cm n . (Ten en cuenta que n ha de ser mayor o igual que m.) (Puedes 
//comprobar la validez de tu programa introduciendo los valores n = 15 y m = 10: el 
//resultado es 3003.



Funcion combo = combinacion(n,m) //funcion de combinacion
	combo = FactorialNumero(n)/(FactorialNumero(m)*FactorialNumero(n-m))
FinFuncion



Funcion  Factorial=FactorialNumero(n) //funcion factorial
	
	Factorial=1
	Si n = 0 Entonces
		n=1
	SiNo
		Para i=1 hasta n Con Paso 1 Hacer
			Factorial = Factorial * i
		FinPara
	FinSi

FinFuncion





Algoritmo Practica14
	
	Definir n ,  num1 , num2 , Factorial , i Como Entero
	
	Escribir "Ingrese el primer numero que quiere"
	Leer num1
	Escribir "Ingrese el primer segundo que quiere"
	Leer num2
	Si n<m Entonces
		Escribir"El primer numero tiene que ser mayor al segundo"
	SiNo
		
	
FinSi
	Escribir "El factorial del numero " n " es: " combinacion(num1 , num2)
	
	
	
	
	
FinAlgoritmo
