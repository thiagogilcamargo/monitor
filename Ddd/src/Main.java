public class Main {
    public static void main(String[] args) {
        Monitor novoMonitor = new Monitor(0,"Dell",
                "Verde","Full HD",60);

        Monitor novoMonitorDeMarcaDesconhecida = new Monitor(22,"4k");

        novoMonitor.setTamanho(0);
        System.out.println("O monitor tem a marca: "+ novoMonitorDeMarcaDesconhecida
                .getMarca());
    }
}