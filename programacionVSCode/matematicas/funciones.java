package matematicas;
/**
 * 
 * Funciones
 * 
 * Una biblioteca de funciones matemáticas, en la que interactuen entre ellas con el fin de
 * simplificar el código
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación 16/11/2022
 * 
 */
public class funciones {


    // Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
    // @param x valor que es probado para ser primo
    // @return si es true, es primo, si es false, no es primo
    public static boolean esPrimo(int x) {

    for (int n = 2; n < x; n++) {
        if ((x % n) == 0) {
        return false;
        }
    }
    return true;
    }

    

    //Devuelve el menor primo que es mayor al número que se pasa como parámetro.
    // @param x numero base que realiza los procesos que dicta el enunciado
    // @return el menor primo
    public static int SiguientePrimo(int x) {

        while (!esPrimo(++x)) {
        }
    
        return x;
	}

    public static int voltea(int x) {
    /**
   * Le da la vuelta a un número
   * 
   */
        int num, volteado = 0, resto;

            num = x;

        while( num > 0 ) {
            resto = num % 10;
            volteado = volteado * 10 + resto;
            num /= 10;
        }
    return volteado;
    }
    /**
   * Comprueba si el numero introducido es capicua
   * 
   */
    public static boolean esCapicua(int capicua) {
    
        if (voltea(capicua) == capicua) {
            return true;
        } else {
            return false;
        }
    }

    /*Dada una base y un exponente devuelve la potencia */
    /*Este metodo no admite potencias negativas */
    public static int potencia(int base, int poten) {

        int total = 1;

        for(int i = 1; i<= poten; i++){
            total = total*base;
        }
        return total;
    }

    public static int digitos(int numero) {

        int cuenta = 0 ; // Cuenta la cantidad de números

        while(numero !=0) {
            numero = numero/10;
            cuenta++;
        }
        return cuenta;
    }

    public static int digitoN(int numero, int posicion) {

        String caracter = String.valueOf(numero);
        char valor = caracter.charAt(posicion);
        int digito = Character.getNumericValue(valor);
        
        return digito;
    }

    public static int posicionDeDigito(int numero, int posicion) {

        int valor = Math.abs(numero);
        String caracter = Integer.toString(valor);
        String lugar = String.valueOf(posicion);
        return caracter.indexOf(lugar);
    }

    public static int quitaPorDetras(int numero, int n) {

        for (int i = 0; i < n; i++) {
            numero=numero/10;
        }
        return numero;
    }

    public static int quitaPorDelante(int numero, int n) {

        numero=voltea(numero);
        numero=quitaPorDetras(numero, n);
        numero=voltea(numero);

        return numero;
    }

    public static int pegaPorDetras(int numero, int n) {

        int total = 0;

        if ((n <= 9)&&(n >= 0)){
            numero=numero*10;
            total=numero+n;
        }
        return total;
    }

    public static int pegaPorDelante(int numero, int n) {

        numero=voltea(numero);
        numero=pegaPorDetras(numero, n);
        numero=voltea(numero);
    
        return numero;
    }

    public static int juntaNumeros(int numA, int numB) {
        
        String charA = String.valueOf(numA);
        String charB = String.valueOf(numB);

        String juntado = charA + charB;

        int resultado = Integer.parseInt(juntado);

        return resultado;
    }

    public static int trozoDeNumero(int numero, int detras, int delante) {
        numero = quitaPorDetras(numero, detras);
        numero = quitaPorDelante(numero, delante);

        return numero;
    }
} 


