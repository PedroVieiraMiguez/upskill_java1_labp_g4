public class AtletaSemiProfissional extends AtletaNaoProfissional {

    private static double parcelaFixa = 100;

    public AtletaSemiProfissional(String nome, int numIdCivil, int idade, double freqCardRepouso, double premioAcumulado,
                        Genero genero, Atividade atividade, ObjectivoTreino objectivo, int antiguidade) {
        super(nome, numIdCivil, idade, freqCardRepouso, premioAcumulado, genero, atividade, objectivo, antiguidade );
    }

    public AtletaSemiProfissional(){
        super();
    }

    public static double getParcelaFixa() {
        return parcelaFixa;
    }

    public static void setParcelaFixa(double parcelaFixa) {
        AtletaSemiProfissional.parcelaFixa = parcelaFixa;
    }

    public double determinarParcela1() {
        return getParcelaFixa() - (getParcelaFixa() * getIRS());
    }

    public double determinarParcela2() {
        return getParcelaFixa() * getPercAntiguidade();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
    
    
    @Override
    public String toString(){
        return String.format("Tipo de Atleta: %s%n%sValor de Rendimento Fixo: %.2f || ", this.getClass(), super.toString(), getParcelaFixa());
    }
}
