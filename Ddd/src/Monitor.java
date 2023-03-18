public class Monitor{
    private String[] CoresValidas = new String[]{"Vermelho", "Branco", "Azul","Preto"};
    private int Tamanho = 10;
    private String Marca = "Desconhecido";
    private String Cor = "Desconhecido";
    private String Tela;
    private int TaxaDeAtualizacao;

    //public Monitor(){}
    public Monitor(int tamanho, String marca, String cor, String tela, int taxaDeAtualizacao)
    {
        ValidarTamanho(tamanho);
        ValidarCor(cor);
        Marca = marca;
        Tela = tela;
        TaxaDeAtualizacao = taxaDeAtualizacao;
    }

    public Monitor(int tamanho, String Tela)
    {
        ValidarTamanho(tamanho);
        this.Tela = Tela;
    }

    public int getTamanho() {
        return Tamanho;
    }

    public void setTamanho(int tamanho) {
        if(ValidarTamanho(tamanho))
            Tamanho = tamanho;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        boolean valido = ValidarCor(cor);
        if(valido)
            Cor = cor;
        else
            Cor = "Azul";
    }

    public String getTela() {
        return Tela;
    }

    public void setTela(String tela) {
        Tela = tela;
    }

    public int getTaxaDeAtualizacao() {
        return TaxaDeAtualizacao;
    }

    public void setTaxaDeAtualizacao(int taxaDeAtualizacao) {
        TaxaDeAtualizacao = taxaDeAtualizacao;
    }

    private boolean ValidarTamanho(int tamanho)
    {
        if(tamanho < 10)
            return false;

        return true;
    }

    private boolean ValidarCor(String cor)
    {
        for (String CorValida:
                CoresValidas) {
            if(cor == CorValida) {
                Cor = cor;
                return true;
            }
        }

        return false;
    }
}