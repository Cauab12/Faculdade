package carroExe01;

public class App {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setPlaca("ITU-2641");
        carro1.setMarca("WOLKSWAGEN");
        carro1.setModelo("G4");
        carro1.setCor("Preto");
        carro1.setKm(201000);
        carro1.setQuantidadeCombustivel(33);

        System.out.println(carro1.toString());
        System.out.println("litros totais: " + carro1.abastecerLitros(3));
    }
}
