public class Atleta implements Genero {

    private String nome;
    private int numIdCivil;
    private int idade;
    private double freqCardRepouso;
    private double premioAcumulado;
    private String genero;

    private static final String NOME_OMISSAO = "Sem nome";
    private static final int NUMID_OMISSAO = 0;
    private static final int IDADE_OMISSAO = 0;
    private static final double FCR_OMISSAO = 0;
    private static final double PREMIO_OMISSAO = 0;

    public Atleta(String nome, int numIdCivil, int idade, double freqCardRepouso, double premioAcumulado, String genero ) {
        this.nome = nome;
        this.numIdCivil = numIdCivil;
        this.idade = idade;
        this.freqCardRepouso = freqCardRepouso;
        this.premioAcumulado = premioAcumulado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumIdCivil() {
        return numIdCivil;
    }

    public void setNumIdCivil(int numIdCivil) {
        this.numIdCivil = numIdCivil;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getFreqCardRepouso() {
        return freqCardRepouso;
    }

    public void setFreqCardRepouso(double freqCardRepouso) {
        this.freqCardRepouso = freqCardRepouso;
    }

    public double getPremioAcumulado() {
        return premioAcumulado;
    }

    public void setPremioAcumulado(double premioAcumulado) {
        this.premioAcumulado = premioAcumulado;
    }
}
