public class Main {
    public static void main(String[] args) {
        RemovedorEspacosExtras remover = new RemovedorEspacosExtras();
        InversorString inversor = new InversorString();

        ManipuladorString maiuscula = (String maior) ->{
            if (maior == null) {return null;}
            return maior.toUpperCase();
        };

        ManipuladorString miniscula = (String menor) ->{
            if (menor == null) {return null;}
            return menor.toLowerCase();
        };

        String textoOriginal = "     Exercicios sobre manipulção de strings"         ;
        System.out.println("Original: " + textoOriginal);

        System.out.println("---------------------------------------------------------");

        String semEspacosExtras = remover.manipular(textoOriginal);
        System.out.println("String sem espaços: [" + semEspacosExtras + "]");

        System.out.println("---------------------------------------------------------");

        String inversorString = inversor.manipular(textoOriginal);
        System.out.println("String invertida: [" + inversorString + "]");

        System.out.println("---------------------------------------------------------");

        String maiusculaString = maiuscula.manipular(textoOriginal);
        System.out.println("String maiuscula: [" + maiusculaString + "]");

        System.out.println("---------------------------------------------------------");

        String minisculaString = miniscula.manipular(maiusculaString);
        System.out.println("String miniscula: [" + minisculaString + "]");

        System.out.println("---------------------------------------------------------");

    }   
}