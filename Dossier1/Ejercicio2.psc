//Realizar un un algoritmo que calcule el IVA (21%) de un producto dado un precio de venta sin IVA
Algoritmo Segundoejercicio
	
	escribir "Introduce el Precio del producto: "
	leer precioproducto
	
	//el iva está al 21% -> 21 / 100 -> 0.21
    IVA = 0.21
	
	cantidadIVAdelProducto = precioproducto * IVA
	precioFinalProducto = precioproducto + cantidadIVAdelProducto
	
	escribir "precio con iva " , precioFinalProducto
	
	
	Escribir "el iva de 500 es", 500*IVA
	
	
FinAlgoritmo
