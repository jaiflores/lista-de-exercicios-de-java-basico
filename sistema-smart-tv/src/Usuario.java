public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> : TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> : TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("O volume aumentou para: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("O volume diminuiu para: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("O canal agora é o: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("O canal agora é o: " + smartTv.canal);

        smartTv.mudar(13);
        System.out.println("O canal antes era: " + smartTv.canal);        
        
    }
}
