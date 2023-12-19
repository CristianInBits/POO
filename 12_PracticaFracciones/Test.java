public class Test {
    public static void main(String[] args) {
        Fraccion f = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(4);
        Fraccion f3 = new Fraccion();
        Fraccion f4;
        f4 = f.suma(f2);
        f4.mostrar();
        f4 = f.resta(f2);
        f4.mostrar();
        f4 = f.multiplica(f2);
        f4.mostrar();
        f4 = f.divide(f2);
        f4.mostrar();
        int n = f4.entero();
        System.out.println(n);
        double d = f4.real();
        System.out.println(d);
        Fraccion f5 = new Fraccion(12, 48);
        f5.simplifica();
        f5.mostrar();
        Fraccion f6 = new Fraccion(12, 0);
        f6.setNumerador(0);
        f6.setDenominador(2);
        f5.divide(f6).mostrar();
        System.out.println(f4.getNumerador());
        System.out.println(f4.getDenominador());
        Fraccion f7 = new Fraccion(2, 4);
        Fraccion f8 = new Fraccion(f7);
        f8 = f7.copia();
        if (f7.irreducible()) {
            System.out.print("La fracción: ");
            f7.mostrar();
            System.out.println("es irreducible");
        } else {
            System.out.print("La fracción: ");
            f7.mostrar();
            System.out.println("es simplificable");
        }
        if (f7.equivalente(f8)) {
            System.out.print("La fracción:");
            f7.mostrar();
            System.out.print(" es equivalente a: ");
            f8.mostrar();
        } else {
            System.out.print("La fracción:");
            f7.mostrar();
            System.out.print(" NO es equivalente a: ");
            f8.mostrar();
        }
        if (f5.equivalente(f8)) {
            System.out.print("La fracción:");
            f5.mostrar();
            System.out.print(" es equivalente a: ");
            f8.mostrar();
        } else {
            System.out.print("La fracción:");
            f5.mostrar();
            System.out.print(" NO es equivalente a: ");
            f8.mostrar();
        }
        Fraccion f9 = new Fraccion(f8);
        f9.mostrar();
    }
}
