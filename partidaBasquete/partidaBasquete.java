package partidaBasquete;

public class partidaBasquete {
    public String mandante;
    public int pontosMandante;

    public String visitante;
    public int pontosVisitante;

    public void cesta(boolean mandante, int pontos){
        if(mandante){
            pontosMandante = pontosMandante + pontos;
        }else{
            pontosVisitante = pontosVisitante + pontos;
        }
    }
    public Resultado encerrrar(){
        Resultado res = new Resultado();
        if(pontosMandante>pontosVisitante){
            res.vencedor = mandante;
            res.perdedor = visitante;

            pontosMandante = res.pontosVencedor;
            pontosVisitante = res.pontosPerdedor;
        }else if(pontosMandante<pontosVisitante){
            res.perdedor = mandante;
            res.vencedor = visitante;

            pontosMandante = res.pontosPerdedor;
            pontosVisitante = res.pontosVencedor;
        }else{
            res.vencedor = "empate";
            res.perdedor = "empate";
        }
        return res;
    }
}
