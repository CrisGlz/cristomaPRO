funcion serie=Sumaserie(n)
	i=n
	j=1
	Mientras j<=i
		serie=serie+1/j
		j=j+1
	FinMientras
	
	
FinFuncion


Algoritmo practica2
	
	Repetir
		
		Escribir "0 para salir u 1 para continaur"
		leer salida
		si salida=1 Entonces
			
			
			Escribir "Ingrese un numero"
			leer num
			
			Escribir "suma = " SumaSerie(num)
			escribir "0 para salir"
			leer salida
		
		finsi
	Hasta Que salida = 0
	
FinAlgoritmo
