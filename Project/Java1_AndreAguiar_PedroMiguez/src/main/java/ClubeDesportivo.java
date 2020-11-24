import java.util.ArrayList;

public class ClubeDesportivo {
    private String nomeClube;
    private String dataFundacao;
    private ArrayList<Atleta> atletasInscritos;

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
        atletasInscritos.add(a);
    }


}
