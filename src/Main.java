public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");

        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;

        System.out.println("O ano de lançamento do filme é: " + ano);

        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;

        String sinopse = """
                O grande ator dos anos 80 volta para uma missão quase impossivel!
                não perca a estreia de Top Gun: Maverick
                em um cinema perto de você!""";

        System.out.println(sinopse);

        double media = (1.5 + 8.9 + 9.9) / 3;

        int classificacao = (int) (media / 2);
    }
}