package universidade;

public class Opcoes {
    int codCurso;
    int codBolsa;

    public Opcoes(int codCurso, int codBolsa) {
        this.codCurso = codCurso;
        this.codBolsa = codBolsa;
    }
}

class Resultado {
    double mensalidade;
    String curso;
    String programaBolsa;
    double desconto;

    public Resultado(double mensalidade, String curso, String programaBolsa, double desconto) {
        this.mensalidade = mensalidade;
        this.curso = curso;
        this.programaBolsa = programaBolsa;
        this.desconto = desconto;
    }
}

class Universidade {
    public Resultado calcularMensalidade(Opcoes opcoes) {
        String curso = nomeCurso(opcoes.codCurso);
        double mensalidade = mensalidadeCurso(opcoes.codCurso);
        String programaBolsa = nomeBolsa(opcoes.codBolsa);
        double desconto = descontoBolsa(opcoes.codBolsa);

        double valorFinal = mensalidade * (1 - desconto);

        return new Resultado(valorFinal, curso, programaBolsa, desconto);
    }

    private String nomeCurso(int cod) {
        switch (cod) {
            case 1: return "Sistemas de Informação";
            case 2: return "Análise e Desenvolvimento de Sistemas";
            case 3: return "Ciência da Computação";
            case 4: return "Engenharia da Computação";
            case 5: return "Engenharia de Software";
            default: return "Curso desconhecido";
        }
    }

    private double mensalidadeCurso(int cod) {
        switch (cod) {
            case 1: return 550.00;
            case 2: return 750.00;
            case 3: return 1150.00;
            case 4: return 1300.00;
            case 5: return 950.00;
            default: return 0.00;
        }
    }

    private String nomeBolsa(int cod) {
        switch (cod) {
            case 1: return "Escola Pública";
            case 2: return "Bolsista";
            case 3: return "Ex-aluno";
            case 4: return "Tutor";
            case 5: return "Sem bolsa";
            default: return "Bolsa desconhecida";
        }
    }

    private double descontoBolsa(int cod) {
        switch (cod) {
            case 1: return 0.50;
            case 2: return 0.20;
            case 3: return 0.60;
            case 4: return 1.00;
            case 5: return 0.00;
            default: return 0.00;
        }
    }
}
