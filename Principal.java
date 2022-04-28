import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Proprietario dono = new Proprietario();
        dono.nome = "João da Silva";
        dono.cpf = "111111111";
        dono.endereco = "rua 20, numero 660";
        dono.bairro = "Centro";
        dono.cidade = "Ituiutaba";
       
        Carro meuCarro = new Carro();        
        meuCarro.fabricante = "Lamborghni";
        meuCarro.modelo = "Aventador";
        meuCarro.cor = "vermelho";
        meuCarro.anoFabricacao = 2009;
        meuCarro.valorDeMercado = 10000f;
        meuCarro.flex = true;
        meuCarro.tipoCombustivel = "Alcool/Gasolina";
        //meuCarro.dono = dono;

        meuCarro.recebeProprietario(dono);

        meuCarro.ligar();
        meuCarro.aleraModeloECor("fusca", "azul");
        float valor = meuCarro.retormaValorMercado();
        System.out.println("Valor do carro: " + valor);

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Honda";
        seuCarro.modelo = "Civic";
        seuCarro.anoFabricacao = 2009;
        seuCarro.cor = "Preto";
        seuCarro.dono = dono;



        System.out.println("Meu carro");
        System.out.println("-------------------------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoFabricacao);
                                                     //dono.nome
        System.out.println("Proprietario: " + meuCarro.dono.nome);

        System.out.println();
        System.out.println("Seu carro");
        System.out.println("-------------------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoFabricacao);
        System.out.println("Proprietario: " + meuCarro.dono.nome);

        dono.nome = "Manuel Junqueira";

        System.out.println("Meu carro");
        System.out.println("-------------------------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoFabricacao);
                                                     //dono.nome
        System.out.println("Proprietario: " + meuCarro.dono.nome);

        System.out.println();
        System.out.println("Seu carro");
        System.out.println("-------------------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoFabricacao);
        System.out.println("Proprietario: " + meuCarro.dono.nome);
    }
    
}
