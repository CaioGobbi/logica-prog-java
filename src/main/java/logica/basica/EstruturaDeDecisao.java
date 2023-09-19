package logica.basica;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        numeroPar();
        stringIgual();
        stringInicia();
    }

	private static void numeroPar() {
		Integer num = 2;

        if(num % 2 == 0){
            //executo aqui if true
            System.out.println("par");
        }else{
            //executa aqui if false
            System.out.println("ímpar");
        }
	}
	private static void stringIgual() {
		String frase = "Hoje é segunda feira, e são seis da tarde!";

        if(frase.contains("segunda") ){
        	if(frase.contains("seis da tarde")){
        		System.out.println("dia de alegria");
        	}else {
        		System.out.println("dia de trsiteza");
        	}	
        }else if(frase.contains("sexta")){
            System.out.println("dia de alegria");
        }else{
            System.out.println("dia normal");
        }    
	}
	private static void stringInicia() {
		String palavra = "bobeira";
		
		if (palavra.startsWith("a")){
			System.out.println("palavra iniciada em a");
		}else{
			System.out.println("palavra iniciada com outra letra");
		}
	}
}
