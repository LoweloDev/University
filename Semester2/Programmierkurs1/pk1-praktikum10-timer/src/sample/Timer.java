package sample;

public class Timer extends Thread {

    TimerListener listener;

    Timer(TimerListener timerListener) {
        listener = timerListener;
    }

    @Override
    public void run() {
        boolean isStopped = false;

        while(!isStopped) {
            try {
                sleep(1000);
                listener.signalPerformed();
            } catch (InterruptedException e) {
                isStopped = true;
                e.printStackTrace();
            }
        }
    }
}
