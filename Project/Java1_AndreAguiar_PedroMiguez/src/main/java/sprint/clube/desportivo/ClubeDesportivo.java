package sprint.clube.desportivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ClubeDesportivo {
    private String nomeClube;
    private String dataFundacao;
    private ArrayList<Atleta> atletasInscritos;

    private static final String NOME_OMISSAO = "Sem nome";
    private static final String DATA_OMISSAO = "Sem data de fundação";


    public ClubeDesportivo(String nomeClube, String dataFundacao, ArrayList<Atleta> atletasInscritos ) {
        this.setNomeClube(nomeClube);
        this.setDataFundacao(dataFundacao);
        this.atletasInscritos = atletasInscritos;
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
        ArrayList<Atleta> atletasOrdenados = new ArrayList<Atleta>(atletasInscritos);
        Collections.sort(atletasOrdenados);
        return atletasOrdenados;
    }

    public ArrayList<Atleta> getReverseSortedByPremio() {
        ArrayList<Atleta> atletasOrdenados = new ArrayList<Atleta>(atletasInscritos);
        atletasOrdenados.sort(new SortByPremioReversedComparator());
        return atletasOrdenados;
    }

    public ArrayList<Atleta> getSortedByTypeThenActivityThenName() {
        ArrayList<Atleta> atletasOrdenados = new ArrayList<Atleta>(atletasInscritos);
        atletasOrdenados.sort(new SortByTypeThenActivityThenName());
        return atletasOrdenados;
    }
    
    
    public double calcularValorTotalIRS(ArrayList<Atleta> getAtletasInscritos){
        double somaIRS = 0;

        for (Atleta atleta : getAtletasInscritos()) {
            if (atleta instanceof AtletaSemiProfissional) {
                somaIRS += ((AtletaSemiProfissional)atleta).calcularDescontoIRS();
            } else if (atleta instanceof AtletaProfissional) {
                somaIRS += ((AtletaProfissional) atleta).calcularDescontoIRS();
            }
        }
        return somaIRS;
    }

    
    @Override
    public String toString(){
        return String.format("Nome do clube: %s || Data de Fundação: %s%n", getNomeClube(), getDataFundacao());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClubeDesportivo that = (ClubeDesportivo) o;
        return Objects.equals(getNomeClube(), that.getNomeClube()) &&
                Objects.equals(getDataFundacao(), that.getDataFundacao()) &&
                Objects.equals(getAtletasInscritos(), that.getAtletasInscritos());
    }

}
