Algoritmo practicaadiccional1
	
	//Control de acceso a una discoteca:
	//EL portero pregunta al cliente:
	//
	//- diga la edad
	//
	// EN el caso que sea menor NO le dejará pasar y le dirá
	// "No puedes entrar aún"
	//
	// en el caso de qu ecumpla la edad
	// preguntara, ¿Estas en la lista de reserva?
	//
	// SI esta en la lista de reserva le dice:
	// "Puedes pasar gratis"
	
	// en otro Caso 
	// "DEbes pagar 25? y puedes pasar"

	definir edad Como Entero
	definir lista como Entero
	escribir "¿Que edad tienes?"
	leer edad
	
	Si edad<18 Entonces
		Escribir "No tienes la edad para entrar."
	SiNo
		escribir "¿Estas en la lista de reserva?"
		escribir "En caso afirmativo escribe 1 si no 0"
		leer lista
		Si lista = 1 Entonces // 1 será Mayor de edad
			escribir "Puedes pasar gratis"
		SiNo
			escribir "Debes pagar 25? y puedes pasar."
		Fin Si
	Fin Si
	
	
	
	
	
	
FinAlgoritmo
