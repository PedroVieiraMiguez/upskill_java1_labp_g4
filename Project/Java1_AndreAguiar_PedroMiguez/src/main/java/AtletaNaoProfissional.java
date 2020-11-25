public abstract class AtletaNaoProfissional extends Atleta {

    private int antiguidade;

    private static final int ANTIGUIDADE_OMISSAO = 0;

    public AtletaNaoProfissional(String nome, int numIdCivil, int idade, double freqCardRepouso, double premioAcumulado, Genero genero, Atividade atividade, int antiguidade) {
        super(nome, numIdCivil, idade, freqCardRepouso, premioAcumulado, genero, atividade);
        setAntiguidade(antiguidade);
    }

    public AtletaNaoProfissional() {
        super();
        setAntiguidade(ANTIGUIDADE_OMISSAO);
    }

    public int getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }
}
