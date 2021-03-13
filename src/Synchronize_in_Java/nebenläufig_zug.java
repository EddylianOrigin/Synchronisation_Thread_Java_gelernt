package Synchronize_in_Java;

class Eisenbahn{
  public void getbahn() throws InterruptedException {
      for(int i=0;i<3;i++){
          System.out.println(i);
          Thread.sleep(400);
      }
  }
        }

        class Zug extends Thread{
    Eisenbahn Bahn;

    Zug(Eisenbahn Bahn){
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
public class nebenläufig_zug {

    public static void main(String[] args) {
        Eisenbahn Ba = new Eisenbahn();

        Zug zug1 = new Zug(Ba);
        Zug zug2 = new Zug(Ba);

        zug1.start();
        zug2.start();
	// write your code here
    }
}
