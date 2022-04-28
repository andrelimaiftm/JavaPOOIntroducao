public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    float valorDeMercado;
    boolean flex;
    String tipoCombustivel;
    Proprietario dono;

    void recebeProprietario(Proprietario proprietario){
        dono = proprietario;
    }

    float retormaValorMercado(){
        return valorDeMercado;
    }

    void aleraModeloECor(String m, String c){
        if(modelo != null){
            modelo = m;            
        }
        if(cor != null){
            cor = c;
        }
    }

    // metodo java em orientação a objeto
    void ligar() {
        System.out.println("Ligando o carro");
    }

}
