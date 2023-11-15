import java.util.Scanner;

public class Capitulo {
    String texto;
    String escolha1;
    String escolha2;
    Personagem Cebolinha;
    Personagem Cascao;
    int incrementoCebolinha;
    int incrementoCascao;
    Scanner plano;

    Capitulo(String texto,
             String escolha1,
             String escolha2,
             Personagem Cebolinha, 
             Personagem Cascao,
             int incrementoCebolinha,
             int incrementoCascao,
             Scanner plano)
            
    {
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.Cebolinha = Cebolinha;
        this.Cascao = Cascao;
        this.incrementoCascao = incrementoCascao;
        this.incrementoCebolinha = incrementoCebolinha;
        this.plano = plano;
    }


    void mostrar() {
        System.out.println(texto);
        System.out.println("- " + escolha1);
        System.out.println("- " + escolha2);
        Cascao.atualizarCoragem(incrementoCascao);
        Cebolinha.atualizarCoragem(incrementoCebolinha);
    }


    int escolher() {
        int resultado = 0;
        boolean escolhaCorreta = false;

        while (!escolhaCorreta) {
            String escolha = plano.nextLine();
            if (escolha.equals(escolha1)) {
                escolhaCorreta = true;
                resultado = 1;
            } else if (escolha.equals(escolha2)) {
                escolhaCorreta = true;
                resultado = 2;
            } else {
                escolhaCorreta = false;
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }


        return resultado;
    }
}