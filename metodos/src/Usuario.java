public class Usuario{
    public static void main(String[] args) throws Exception {
        
        Televisao televisao = new Televisao();

        System.out.println("Tv ligada : " + televisao.ligada);
        System.out.println("Canal atual : " + televisao.canal);
        System.out.println("Volume atual : " + televisao.volume);

        System.out.println("**** Novo status");

        televisao.ligar();
        System.out.println("Tv ligada : " + televisao.ligada);

        televisao.aumentarCanal();
        System.out.println("Canal atual : " + televisao.canal);
        televisao.mudarCanal(10);
        System.out.println("Canal atual : " + televisao.canal);

        televisao.diminuirVolume();
        televisao.diminuirVolume();
        
        televisao.aumentarVolume();
        System.out.println("Volume atual : " + televisao.volume);
    }
}
