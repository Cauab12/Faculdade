package carroExe01;

public class Carro {

    // variáveis de instância - atributos
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int km;
    private double quantidadeCombustivel;
    private double consumoMedio;

    /**
     * Construtor para objetos da classe Entities.Carro
     */

    public Carro() {
        this.placa = "iqp3057";
        this.marca = "BMW";
        this.modelo = "hatch";
        this.cor = "LARANJA";
        this.km = 1000;
        this.quantidadeCombustivel = 27;
        this.consumoMedio = 12.5;
    }

    //get
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getKm() {
        return km;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    //set
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public double abastecerLitros(double litros) {
        return quantidadeCombustivel += litros;
    }

    //toString
    public String toString() {
        return "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Cor: " + cor + ", Km: " + km + ", Tanque atual: " + quantidadeCombustivel + " e media: " + consumoMedio;
    }
}

