public class FormatadordeCepExemplo {
 
    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("34236632");
        System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
        }
        
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
