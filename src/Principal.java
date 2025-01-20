import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;


public class Principal {
    public static void main(String[] args)
    {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(21);
        lost.setAtiva(false);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Quanto tempo para maratonar " + lost.getNome() + ": " + lost.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme();
        outroFilme.setNome("A Estrada Perdida");
        outroFilme.setAnoDeLancamento(1997);
        outroFilme.setDuracaoEmMinutos(135);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Você precisa de " + calculadora.getTempoTotal() + " minutos para terminar sua lista");

    }
}