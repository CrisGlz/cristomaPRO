Algoritmo ejercicioadicional4
		
	definir cantidadnumero, primernumero, distmenor, numeroactual, numeromascercano Como Entero

	escribir "Da la cantidad de numeros que quieres"
	leer cantidadnumero;
	
	escribir "Dame el primer numero?"
	leer primernumero;
	
	distmenor=1000
	
	Repetir
		escribir "Digame el numeor: ", i+1;
		leer numeroactual;
		distactual = abs(primernumero-numeroactual)
		si distanciaactual<distmenor Entonces
			distmenor = distactual
			numeromascercano = numeroactual
		FinSi
		
		i=i+1
	Hasta Que i=cantidadnumero-1; 
	
	escribir "La distancia mas pequeña es: ", distmenor " y el numero mas cercano es: ", numeromascercano
	
	
	
	
	
	
FinAlgoritmo
