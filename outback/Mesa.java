package outback;

public class Mesa {
    public int mesa;
    public int pessoas;
    public double total;
    
    public void pedir(String descricao,double valor){
        this.total = this.total + valor;
    }
    public NotaFiscal fechar(boolean pagarTaxa){
        NotaFiscal nf = new NotaFiscal();
        if(pagarTaxa){
            nf.taxaServico = 1.05;
        }else{
            nf.taxaServico = 1;
        }

        nf.total = this.total;
        nf.totalFinal = nf.total*nf.taxaServico;
        nf.valorPorPessoa = nf.totalFinal/pessoas;
        return nf;
    }
}
