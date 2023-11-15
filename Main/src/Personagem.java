public class Personagem{
    String nome;
    int coragem;

    Personagem(String nome, int coragem)
    {
        this.nome = nome;
        this.coragem = coragem;
    }

    Personagem(String nome)
    {
        this.nome = nome;
        this.coragem = 100;
    }

    void atualizarCoragem(int incremento)
    {
        if(incremento != 0)
        {
        this.coragem += incremento;
        System.out.println("A energia de " + this.nome + " foi a " + this.coragem);
        }
    }
}