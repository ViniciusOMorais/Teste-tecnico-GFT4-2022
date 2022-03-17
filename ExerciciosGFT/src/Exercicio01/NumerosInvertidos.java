package Exercicio01;
public class NumerosInvertidos {
    public static void main(String[] args) {
        int inteiro1 = 15485448;
        int inteiro2 = 2195498;
        int inteiro3 = 12;
        int inteiro4 = 98716549;
        // Numero long (Ultrapassa) inteiro5 = 9999998999;
        int inteiro6 = 1654891;

        System.out.println(inteiro1 + " invertendo o número = " + inverteNumeroInteiro(inteiro1));
        System.out.println(inteiro2 + " invertendo o número = " + inverteNumeroInteiro(inteiro2));
        System.out.println(inteiro3 + " invertendo o número = " + inverteNumeroInteiro(inteiro3));
        System.out.println(inteiro4 + " invertendo o número = " + inverteNumeroInteiro(inteiro4));
        //System.out.println(inteiro5+" → "+invertendo o número = (inteiro5));
        System.out.println(inteiro6 + " invertendo o número = " + inverteNumeroInteiro(inteiro6));
    }

    private static int inverteNumeroInteiro(int numeroAInverter) {
        String numeroAInverterString = String.valueOf(numeroAInverter);
        String numeroInvertido = "";
        char[] arrayChar = numeroAInverterString.toCharArray();

        for (int i = arrayChar.length - 1; i >= 0; i--) {
            numeroInvertido += arrayChar[i];
        }

        return Integer.valueOf(numeroInvertido);
    }
}