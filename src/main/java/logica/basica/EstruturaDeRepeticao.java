package logica.basica;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        ListaDePalavras();
        forClassico();
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
}
