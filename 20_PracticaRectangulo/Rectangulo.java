/**
 * PRIMERA PARTE. CLASE PUNTO
 * Se pide construir una clase denominada Punto.
 * Un punto se caracteriza por tener dos coordenadas, una que indica su posición
 * sobre el eje X y
 * otra que indica su posición sobre el eje Y, ambos valores enteros. Ninguno de
 * los dos valores
 * puede ser negativo.
 * Los puntos se podrán inicializar de la siguiente forma:
 * • Con dos argumentos, que inicializa las coordenadas X e Y a esos valores.
 * Se ofrecerán métodos Get y Set para cada uno de los dos atributos de la
 * clase.
 * El comportamiento del punto atenderá a la siguiente especificación, por lo
 * que se deben
 * programar métodos que realicen las siguientes tareas:
 * • Devolver una cadena de caracteres con los valores del punto (sobrescribir
 * el método
 * toString ()).
 * • desplazarXY, que suma a las coordenadas, respectivamente, cada uno de los
 * dos valores
 * recibidos.
 * • Sobrescribir equals, devolviendo true si el punto que recibe está en las
 * mismas
 * coordenadas que el punto actual.
 * • copia, que devuelve un nuevo punto con las mismas coordenadas que el
 * actual.
 * • estaDebajo, que devuelve true si el punto actual se encuentra por debajo
 * del punto que
 * recibe, es decir, devuelve true si la coordenada y del punto actual es menor
 * que la del
 * punto que recibe.
 * • estaDerecha, que devuelve true si el punto actual se encuentra a la derecha
 * del punto
 * que recibe, es decir, devuelve true si la coordenada x del punto actual es
 * mayor que la
 * del punto que recibe.
 * 
 * SEGUNDA PARTE. CLASE RECTANGULO
 * Se pide construir una clase denominada Rectangulo.
 * Un rectángulo se caracteriza por tener dos puntos, que representan su extremo
 * inferior
 * izquierdo y su extremo superior derecho. El primero de estos puntos tendrá
 * que estar siempre
 * por debajo y a la izquierda que el segundo.
 * Los rectángulos se podrán inicializar de las siguientes formas:
 * • Sin argumentos, inicializará el extremo inferior izquierdo a (0,0) y el
 * extremo superior
 * derecho a (1,1).
 * • Con dos argumentos de tipo entero, que representan la base y la altura del
 * rectángulo.
 * El extremo inferior izquierdo se debe poner en el punto (0,0) y el extremo
 * superior
 * derecho a los valores correspondientes para que el rectángulo tenga la base y
 * altura
 * indicada.
 * • Con dos argumentos de la clase Punto, que representan el extremo inferior
 * izquierdo y
 * el extremo superior derecho del rectángulo.
 * • Con un argumento de la clase Rectángulo, que copia los atributos del
 * rectángulo pasado
 * como parámetro en el rectángulo actual.
 * Se ofrecerán métodos Get y Set para cada uno de los dos atributos de la
 * clase.
 * El comportamiento del rectángulo atenderá a la siguiente especificación, por
 * lo que se
 * deben programar métodos que realicen las siguientes tareas:
 * • Devolver una cadena de caracteres con los valores del rectángulo
 * (sobrescribir el
 * método toString ()).
 * • Devolver la base del rectángulo.
 * • Devolver la altura del rectángulo.
 * • Devolver el área del rectángulo.
 * • Devolver el perímetro del rectángulo.
 * • Programar un método valores que devuelva un array con cuatro componentes,
 * correspondientes a los valores de la base, altura, área y perímetro del
 * rectángulo,
 * respectivamente.
 * • equals, que devuelve true si el rectángulo que recibe está en las mismas
 * coordenadas
 * que el rectángulo original.
 * • desplazarX, que traslada el rectángulo tantas posiciones en el eje X como
 * indique el
 * valor recibido.
 */

 