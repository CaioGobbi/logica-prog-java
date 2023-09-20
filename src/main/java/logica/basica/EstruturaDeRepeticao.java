package logica.basica;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        ListaDePalavras();
        forClassico();
        forPuro();
        inverteString();
    }

    private static void ListaDePalavras() {
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("Zumba");
        palavraList.add("Games");
        palavraList.add("Jose");
        palavraList.add("Lucas");

        for (String palavra : palavraList) {
            System.out.println(palavra);
        }
        palavraList.forEach(palavra -> System.out.println(palavra));
    }
    private static void forClassico (){
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("Zumba");
        palavraList.add("Games");
        palavraList.add("Jose");
        palavraList.add("Lucas");

        for (int i = 0; i < palavraList.size(); i++){
            System.out.println(palavraList.get(i));
        }
    }
    private static void forPuro(){
        for(int posicao = 0; posicao <= 10; posicao = posicao + 1){
            System.out.println(posicao);
        }
    }
    private static void inverteString() {
        String frase = "Oi meu nome é Caio";
        String invertida = "";

        for (int posicao = frase.length() - 1; posicao >= 0; posicao = posicao - 1) {
            invertida = invertida + frase.charAt(posicao);
        }
        System.out.println(invertida);
    }
}
