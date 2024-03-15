package aulas_2_semestre;

public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;
    private int faltas;

    public Aluno(double nota1, double nota2, double nota3, int faltas) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.faltas = faltas;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String verificarSituacao() {
        double media = calcularMedia();
        if (faltas > 4) {
            return "DP por Falta";
        } else if (media >= 8) {
            return "Aprovado com Sucesso";
        } else if (media >= 6 && media < 8) {
            return "Aprovado";
        } else if (media >= 3 && media < 6) {
            return "Recuperação";
        } else {
            return "DP por Nota";
        }
    }
}
