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
        if (getAntiguidade() < 5) {
            return 0;
        } else if (getAntiguidade() <= 10) {
            return getParcelaFixa() * 0.02;
        } else if (getAntiguidade() <= 20) {
            return getParcelaFixa() * 0.08;
        } else {
            return getParcelaFixa() * 0.2;
        }
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
