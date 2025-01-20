import br.com.alulra.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args)
    {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 175;
        meuFilme.nome.

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + meuFilme.pegaMedia());

    }
}