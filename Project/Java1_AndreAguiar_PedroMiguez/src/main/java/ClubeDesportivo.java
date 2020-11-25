import java.util.ArrayList;
import java.util.Collections;

public class ClubeDesportivo {
    private String nomeClube;
    private String dataFundacao;
    private ArrayList<Atleta> atletasInscritos = new ArrayList<Atleta>();

    private static final String NOME_OMISSAO = "Sem nome";
    private static final String DATA_OMISSAO = "Sem data de fundação";


    public ClubeDesportivo(String nomeClube, String dataFundacao) {
        this.setNomeClube(nomeClube);
        this.setDataFundacao(dataFundacao);
    }

    public ClubeDesportivo() {
        this.setNomeClube(NOME_OMISSAO);
        this.setDataFundacao(DATA_OMISSAO);
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void addAtleta (Atleta a) {
        getAtletasInscritos().add(a);
    }


    public ArrayList<Atleta> getAtletasInscritos() {
        return atletasInscritos;
    }

    public ArrayList<Atleta> getSortedByName() {
        ArrayList<Atleta> atletasOrdenados = new ArrayList<Atleta>();
        Collections.copy(atletasOrdenados, atletasInscritos);
        Collections.sort(atletasOrdenados);
        return atletasOrdenados;
    }

    @Override
    public String toString(){
        return String.format("Nome do clube: %s || Data de Fundação: %s%n", getNomeClube(), getDataFundacao());
    }

}
