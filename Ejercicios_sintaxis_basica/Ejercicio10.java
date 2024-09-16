/* Implementar un programa en Java que genere doscientas fechas al azar. Cada fecha consta de tres números enteros llamados día, mes y año. El día debe estar comprendido entre el 1 y el 31. El mes, entre el 1 y el 12. El año, entre el 1900 y el 2100. Una vez generados los tres valores, el programa debe mostrarlos y determinar si representan una fecha válida o no. Para este ejercicio se consideran bisiestos todos los años que son múltiplos de cuatro.

Ej. (con dos fechas): 
	10-10-1977 es una fecha válida. 
	30-2-2004 no es una fecha válida.

NOTA:- Como hemos visto, el método System.out.println() imprime por consola el contenido de una cadena, siendo también capaz de imprimir valores numéricos y de combinar ambos con el operador de concatenación +. Pues bien, el método System.out.print() trabaja del mismo modo, pero sin saltar de línea al terminar.

NOTA:- Para generar un día comprendido entre el 1 y el 31 podemos usar la siguiente sentencia:

	dia = (int) (Math.random()*31 + 1);
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int dia, mes, año;
        boolean incorrecta;

        for (int i = 0; i < 200; i++) {
            incorrecta = false;
            dia = (int) (Math.random() * 31 + 1);
            mes = (int) (Math.random() * 12 + 1);
            año = (int) (Math.random() * 201 + 1900);

            System.out.print(dia + "-" + mes + "-" + año);

            if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))
                incorrecta = (dia == 31);
            if (mes == 2) {
                if (año % 4 == 0)
                    incorrecta = (dia > 29);
                else
                    incorrecta = (dia > 28);
            }

            if (incorrecta)
                System.out.println(" fecha NO válida");
            else
                System.out.println(" fecha válida");
        }
    }
}
