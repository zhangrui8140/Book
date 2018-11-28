package Thread;

public class MyThread extends Thread {

    private Integer i;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        try{
            for(int i=0;i<1000;i++){
                System.out.println(String.format("Id:%s,Name:%s->%s",getId(),getName(),i));
            }
        }
        catch (Exception e){

        }
    }

    class MyThreadA extends MyThread{

        public MyThreadA(String name) {
            super(name);
        }
    }
}
