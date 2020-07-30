package trafficlightdemo;

public class TrafficLightSimulator implements Runnable {

    private Thread thrd; //поток для имитации светофора
    private TrafficLightColor tlc; //текущий цвет светофора
    boolean stop = false; //для остановки имитации утановить в true
    boolean changed = false; //true, если светофор переключился

    //конструктор светофора плюс  запуск потока перекл цветов светофора + начальный цвет светофора
    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
        thrd = new Thread(this);
        thrd.start();
    }

    //пергруженная версия конструктора со значенем по умолч
    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
        thrd = new Thread(this);
        thrd.start();
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                Thread.sleep(tlc.getDelay());
//                switch (tlc) {
//                    case GREEN:
//                        Thread.sleep(tlc.getDelay()); //зеленый на 10 сек
//                        break;
//                    case YELLOW:
//                        Thread.sleep(2000); //желтый на 2 сек
//                        break;
//                    case RED:
//                        Thread.sleep(12000); //красный на 12 сек
//                        break;
//                }

            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor() {
        
        
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }
        
        changed = true;
        notify(); //уведомить о переключоении светофора
    }

    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait();
            }
            changed = false;

        } catch (InterruptedException exc) {
            System.out.println(exc);

        }
    }

    TrafficLightColor getColor() {
        return tlc;
    }

    void cancel() {
        stop = true;
    }
}
