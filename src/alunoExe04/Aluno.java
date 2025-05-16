package alunoExe04;

/**
 * A class that represents a student, storing their academic records and calculating 
 * their performance based on exams, exercises, and attendance.
 */
public class Aluno {
    private String nome;
    private String matricula;
    private double frequencia;
    private double p1;
    private double p2;
    private double p3;
    private double mediaExercicios;
    private double g1;
    private double g2;
    private double mediaFinal;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void atualizarNotas(double p1, double p2, double p3, double mediaExercicios) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.mediaExercicios = mediaExercicios;
        calcularG1();
    }

    public void atualizarFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public void calcularG1() {
        this.g1 = (p1 + p2 + p3 + mediaExercicios) / 4.0;
    }

    public double getG1() {
        return g1;
    }

    public boolean aprovadoPorMedia() {
        return g1 >= 7.0 && frequencia >= 75.0;
    }

    public void definirG2(double g2) {
        this.g2 = g2;
        this.mediaFinal = (g1 + g2) / 2.0;
    }

    public String verificarAprovacaoFinal() {
        if (aprovadoPorMedia()) {
            return "Aprovado por média";
        } else if (mediaFinal >= 5.0 && frequencia >= 75.0) {
            return "Aprovado após G2";
        } else {
            return "Reprovado";
        }
    }

    public double getMediaFinal() {
        return mediaFinal;
    }
}
