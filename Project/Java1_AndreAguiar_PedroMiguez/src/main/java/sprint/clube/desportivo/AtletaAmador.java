package sprint.clube.desportivo;

public class AtletaAmador extends AtletaNaoProfissional{

    private static double percentagemMensal = 0.07;
    private static int valorMinimo = 5;
    private static int totalAtletasAmador = 0;

    public AtletaAmador(String nome, int numIdCivil, int idade, double freqCardRepouso, double premioAcumulado,
                        Genero genero, Atividade atividade, ObjectivoTreino objectivo, int antiguidade) {
        super(nome, numIdCivil, idade, freqCardRepouso, premioAcumulado, genero, atividade, objectivo, antiguidade );
        totalAtletasAmador++;
    }

    public AtletaAmador(){
        super();
        totalAtletasAmador++;
    }

    public static double getPercentagemMensal() {
        return percentagemMensal;
    }

    public static void setPercentagemMensal(double percentagemMensal) {
        AtletaAmador.percentagemMensal = percentagemMensal;
    }

    public static int getValorMinimo() {
        return valorMinimo;
    }

    public static void setValorMinimo(int valorMinimo) {
        AtletaAmador.valorMinimo = valorMinimo;
    }

    public double determinarParcela1() {
        return getPremioAcumulado() * getPercAntiguidade();

    }

    public double determinarParcela2() {
        return getPremioAcumulado() * getPercentagemMensal();
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento() < valorMinimo? valorMinimo : super.calcularPagamento();
    }
    
    @Override
    public double calcularDescontoIRS(){
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AtletaAmador that = (AtletaAmador) o;
        return getAntiguidade() == that.getAntiguidade();
    }
    
    @Override
    public String toString(){
        return String.format("%s", super.toString());
    }
    
    
    public static int getTotalAtletasAmador(){
        return totalAtletasAmador;
    } 

}
