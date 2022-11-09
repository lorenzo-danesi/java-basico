public class ControleFluxo {
    public static void main(String[] args) throws Exception {
        //chamada de métodos/funções
        ifMes();
		System.out.print("\n");
		ifFerias();
		System.out.print("\n");
		switchSemana();
		System.out.print("\n");
		switchNumero();
    }
    //verifica o mês por inteiro
    public static void ifMes(){
	    int mes = 9;
		    
		if(mes == 1){
	        System.out.print("Janeiro");
		} else if (mes == 2) {
		    System.out.print("Fevereiro");
    	} else if (mes == 3) {
    	    System.out.print("Março");
    	} else if (mes == 4) {
		    System.out.print("Abril");
    	} else if (mes == 5) {
    	    System.out.print("Maio");
    	} else if (mes == 6) {
    	    System.out.print("Junho");
    	} else if (mes == 7) {
    	    System.out.print("Julho");
		} else if (mes == 8) {
		    System.out.print("Agosto");
        } else if (mes == 9) {
    	    System.out.print("Setembro");
		} else if (mes == 10) {
		    System.out.print("Outubro");
    	} else if (mes == 11) {
    	    System.out.print("Novembro");
		} else if (mes == 12) {
		    System.out.print("Dezembro");
    	} else {
    	    System.out.print("Mês inválido !");
    	}
	}
	//verifica se é um mês de férias	
	public static void ifFerias(){
	    String mes = "Julho";
	    
	    if(mes == "Janeiro" || mes == "Julho" || mes == "Dezembro"){
	        System.out.print("Férias !");
		}
	}
	//verifica o dia da semana por String
	public static void switchSemana(){
	    String dia = "terça-feira";
	    
	    switch(dia){
	        case "segunda-feira":
	            System.out.print("1");
	            break;
	        case "terça-feira":
	            System.out.print("2");
	            break;
	       case "quarta-feira":
	            System.out.print("3");
	            break;
	       case "quinta-feira":
	            System.out.print("4");
	            break;
	       case "sexta-feira":
	            System.out.print("5");
	            break;
	       case "sabado":
	            System.out.print("6");
	            break;
	       case "domingo":
	            System.out.print("7");
	            break;
	       default:
	            System.out.print("Dia inválido !");
	            break;
	    }
	}
	//verificação de um inteiro por caso
	public static void switchNumero(){
	    int numero = 1;
	    
	    switch(numero){
	        case 1:
	        case 2:
	        case 3:
	            System.out.print("Certo");
	            break;
	        case 4:
	            System.out.print("Errado");
	            break;
	        case 5:
	            System.out.print("Talvez");
	            break;
	        default:
	            System.out.print("Valor inválido !");
	            break;
	    }
	}
}
