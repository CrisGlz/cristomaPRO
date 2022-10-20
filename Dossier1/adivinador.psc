Algoritmo sin_titulo
	
	escribir "Piensa un numero"
	finalizar = false;
	intentos = 0;
	cotaSuperior = 101
	cotaInferior = 0
	
	Mientras finalizar = false Hacer
		rand = cotaInferior + azar(cotaSuperior - cotaInferior)
		intentos = intentos + 1
		escribir "es tu num: ",rand, "?";
		escribir "1) ok!";
		escribir "2) num es menor que secreto";
		escribir "3) num es mayor que secreto";
		leer opc;
		
		si opc = 1 Entonces
			escribir "ok! hemos terminado"
			finalizar = true;
		SiNo
			si opc = 2 Entonces
				cotaSuperior = rand;
				
			SiNo
				//caso opc3
				cotaSuperior = rand;
				
			FinSi
			
		FinSi
		
		si intentos > 10 Entonces
			escribir "Lo siento... fallé. Hasta otra."
			finalizar = true
			
			
		FinSi
		
	Fin Mientras
	
	
	
	
FinAlgoritmo
