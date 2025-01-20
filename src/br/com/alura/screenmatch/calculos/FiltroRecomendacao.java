package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos no momento!");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento.");
        } else
        System.out.println("Para assistir depois");
    }
}
