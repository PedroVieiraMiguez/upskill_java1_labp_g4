public class AtletaProfissional extends Atleta{
    
    private double valorFixo;
    
    private static final double VALOR_FIXO_OMISSAO = 0;
    
    private static double percValorVar = 0.20;
    
    
    public AtletaProfissional(String nome, int numIdCivil, int idade, double freqCardRepouso, double premioAcumulado,
            Genero genero, Atividade atividade, ObjectivoTreino objectivo, double valorFixo){
        super(nome, numIdCivil, idade, freqCardRepouso, premioAcumulado, genero, atividade, objectivo);
        setValorFixo(valorFixo);
    }
    
    
    public AtletaProfissional(){
        super();
        setValorFixo(VALOR_FIXO_OMISSAO);
    }
    

    /**
     * @return the valorFixo
     */
    public double getValorFixo() {
        return this.valorFixo;
    }

    /**
     * @param valorFixo the valorFixo to set
     */
    public void setValorFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }

    /**
     * @return the percValorVar
     */
    public static double getPercValorVar() {
        return percValorVar;
    }

    /**
     * @param aPercValorVar the percValorVar to set
     */
    public static void setPercValorVar(double aPercValorVar) {
        percValorVar = aPercValorVar;
    }

    @Override
    public double determinarParcela1() {
        return getValorFixo() - (getValorFixo() * getIRS());
    }

    @Override
    public double determinarParcela2() {
        return getPremioAcumulado() * percValorVar;
    }
    
    
    
}
