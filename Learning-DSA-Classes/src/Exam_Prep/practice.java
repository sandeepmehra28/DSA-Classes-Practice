package Exam_Prep;
class counter{
    private int count = 0;

    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
class synhThread extends Thread{
    private counter counter;
    public synhThread(counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            counter.increment();
        }
    }
}
public class practice{
  public static void main(String... args) throws InterruptedException{
        counter c = new counter();
      synhThread st1 = new synhThread(c);
      synhThread st2 = new synhThread(c);
      st1.start();
      st2.start();

      st1.join();
      st2.join();
      System.out.println(c.getCount());
    }
}
