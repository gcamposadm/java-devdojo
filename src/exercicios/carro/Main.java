package exercicios.carro;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes-Benz", 275);
        Carro carro3 = new Carro("Audi", 270);

        Carro.setVelocidadeLimite(260);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
