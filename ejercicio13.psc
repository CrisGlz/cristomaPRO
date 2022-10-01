Algoritmo ejercicio13
	
	//Queremos hacer un algoritmo que calcule el factorial de un número entero 
	//positivo. El factorial de n se denota con n!, pero no existe ningún operador que permita 
	//efectuar este cálculo directamente. Sabiendo que n! = 1 · 2 · 3 · . . . · (n ? 1) · n y que 0! = 1,
	//haz un algoritmo que pida el valor de n y muestre por pantalla el resultado de calcular n!.
	
	definir num1,num2,num3,num4,num5 Como Entero
	definir distancia12, distancia13, distancia14, distancia15 como entero
	escribir "Inserta el primer numero"
	leer num1
	escribir "Inserta el segundo numero"
	leer num2
	escribir "Inserta el tercer numero"
	leer num3
	escribir "Inserta el cuarto numero"
	leer num4
	escribir "Inserta el quinto numero"
	
	distancia12 = abs(num2 - num1)
	distancia13 = abs (num3 - num1)
	distancia14 = abs  (num4 - num1)
	distancia15 =abs(num5-num1)
	
	
	
	distanciamenor = distancia12;
	numeroseleccionado=num2;
	
	Si distanciamenor > distancia12 Entonces
		numeroseleccionado=num2;
		distanciamenor=distancia12
	FInSi
	
	Si distanciamenor > distancia13 Entonces
		numeroseleccionado=num3;
		distanciamenor=distancia13

	Fin Si
	
	Si distanciamenor > distancia14 Entonces
		numeroseleccionado=num4;
		distanciamenor=distancia14
		
	Fin Si
	
	Si distanciamenor > distancia15 Entonces
		numeroseleccionado=num5;
		distanciamenor=distancia15
		
	Fin Si
	
	escribir "Resultado " distanciamenor " numero mas cercano " numeroseleccionado
	
	
	
FinAlgoritmo
