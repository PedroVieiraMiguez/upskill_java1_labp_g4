import java.util.Objects;

public abstract class AtletaNaoProfissional extends Atleta {

    private int antiguidade;

    private static final int ANTIGUIDADE_OMISSAO = 0;

    public AtletaNaoProfissional(String nome, int numIdCivil, int idade, double freqCardRepouso, double premioAcumulado,
                                 Genero genero, Atividade atividade, ObjectivoTreino objectivo, int antiguidade) {
        super(nome, numIdCivil, idade, freqCardRepouso, premioAcumulado, genero, atividade, objectivo);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AtletaNaoProfissional that = (AtletaNaoProfissional) o;
        return getAntiguidade() == that.getAntiguidade();
    }
    
    @Override
    public String toString(){
        return String.format("%sAntiguidade: %d || ", super.toString(), getAntiguidade());
    }

}
