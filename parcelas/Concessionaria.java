package parcelas;

public class Concessionaria {
    public Resultado calcularTotal(Veiculos veiculos){
        double juros = acharJuros(veiculos.parcelas);
        double total = veiculos.preco * (1 + juros);
        return new Resultado(total, juros);
    }
    private double acharJuros(int parcelas){
        if (parcelas == 1) {
            return 0.0;
        }else if(parcelas >=2 && parcelas <= 6){
            return 0.03;
        }else{
            return 0.05;
        }
    }
}
