package clp.java.concorrente.q3;

public class Computador extends Thread {

    private int id;
    private FilaImpressao buffer;
    private int producaoTotal;

    public Computador(int id, FilaImpressao b, int total) {
        this.id = id;
        buffer = b;
        producaoTotal = total;
    }

    public void run() {
        for (int i = 0; i < producaoTotal; i++) {
            buffer.add(id, "Comp " + id + " Arquivo " + i);
        }
        System.out.println("Computador #" + id + " concluido!");
    }
}