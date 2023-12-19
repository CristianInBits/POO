/**
 * 
 */

public class Fraccion {

    private int numerador, denominador;

    public Fraccion() {
        numerador = denominador = 1;
    }

    public Fraccion(int num) {
        numerador = num;
        denominador = 1;
    }

    public Fraccion(int num, int den) {
        if (den != 0) {
            numerador = num;
            denominador = den;
        } else {
            numerador = denominador = 1;
            // System.out.println("El denominador debe ser distinto de 0,
            // Fracción Unidad generada"); (mejor en documentación)
        }
    }

    public Fraccion(Fraccion f) {
        numerador = f.getNumerador();
        denominador = f.getDenominador();
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int num) {
        numerador = num;
    }

    public void setDenominador(int den) {
        if (den != 0) {
            denominador = den;
        } // else {
          // System.out.println("El denominador debe ser distinto de cero");
          // mantiene el valor que tuviera anteriormente.
          // }
    }

    public Fraccion suma(Fraccion f) {
        int num = this.getNumerador() * f.getDenominador() +
                this.getDenominador() * f.getNumerador();
        int den = this.getDenominador() * f.getDenominador();
        Fraccion res = new Fraccion(num, den);
        return res;
    }

    public Fraccion resta(Fraccion f) {
        int num = this.getNumerador() * f.getDenominador() -
                this.getDenominador() * f.getNumerador();
        int den = this.getDenominador() * f.getDenominador();
        Fraccion res = new Fraccion(num, den);
        return res;
    }

    public Fraccion multiplica(Fraccion f) {
        int num = this.getNumerador() * f.getNumerador();
        int den = this.getDenominador() * f.getDenominador();
        Fraccion res = new Fraccion(num, den);
        return res;
    }

    public Fraccion divide(Fraccion f) {
        int num = this.getNumerador() * f.getDenominador();
        int den = this.getDenominador() * f.getNumerador();
        Fraccion res = new Fraccion(num, den);
        return res;
    }

    public void mostrar() {
        System.out.println(getNumerador() + "/" + getDenominador());
    }

    public int entero() {
        int res = getNumerador() / getDenominador();
        return res;
    }

    public double real() {
        double res = (double) getNumerador() / (double) getDenominador();
        return res;
    }

    public boolean equivalente(Fraccion f) {
        return (this.numerador * f.getDenominador() == this.denominador * f.getNumerador());
    }

    public void simplifica() {
        int mcd = mcd(getNumerador(), getDenominador());
        this.setNumerador(numerador / mcd);
        this.setDenominador(denominador / mcd);
    }

    public boolean irreducible() {
        if (mcd(getNumerador(), getDenominador()) == 1)
            return true;
        return false;
    }

    public Fraccion copia() {
        return new Fraccion(numerador, denominador);
    }

    /*
     * método privado, lo pueden usar los métodos públicos que lo necesiten, pero
     * es inaccesible desde fuera de la clase
     */
    private int mcd(int a, int b) {
        int resultado;
        if (b == 0) {
            resultado = a;
        } else {
            resultado = mcd(b, a % b);
        }
        return resultado;
    }
}// Fracción
