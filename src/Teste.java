public class Teste {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Manuel", "544.376.367-23", "11 994583029");
        System.out.println(cliente);
        Banco banco = new Banco("Liquidez", 14);
        System.out.println(banco);
    }
}