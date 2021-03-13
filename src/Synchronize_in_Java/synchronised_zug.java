package Synchronize_in_Java;

class Eisenbahn_{
    //
    public synchronized void getbahn() throws InterruptedException {
        for(int i=0;i<3;i++){
            System.out.println(i);
            Thread.sleep(400);
        }
    }
}

class Zug_ extends Thread{
    Eisenbahn_ Bahn;

    Zug_(Eisenbahn_ Bahn){
        this.Bahn =Bahn;
    }

    @Override
    public void run() {
        try {
            Bahn.getbahn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
public class synchronised_zug {
    public static void main(String[] args) {
        Eisenbahn_ Bah = new Eisenbahn_();

        Zug_ zug1 = new Zug_(Bah);
        Zug_ zug2 = new Zug_(Bah);


        zug1.start();
        zug2.start();
        // write your code here
    }
}
