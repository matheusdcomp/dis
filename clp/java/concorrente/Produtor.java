package clp.concorrente;

public class Produtor extends Thread {
	
    private int id;
    private Buffer buffer;
    private int producaoTotal;
 
    public Produtor(int id, Buffer b, int total) {
        this.id = id;
        buffer = b;
        producaoTotal = total;
    }
 
    public void run() {
        for (int i = 0; i < producaoTotal; i++) {
            buffer.set(id, i);
        }
        System.out.println("Produtor #" + id + " concluido!");
    }
}