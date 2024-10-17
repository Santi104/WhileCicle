public class Logic {
    public int sumarNaturales(int numeroEntrada) {
        int resultado = 0;
        int control = 0;

        // Bucle para sumar los números naturales hasta el valor ingresado
        while (numeroEntrada >= control) {
            resultado = resultado + control;
            control = control + 1;
        }

        return resultado;
    }
}
