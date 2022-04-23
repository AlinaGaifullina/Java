import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HW_Thread extends JFrame implements KeyListener{

    //не придумала, как это сделать без окна, поэтому вот оно:
    public HW_Thread(){
        setSize(1,1);
        setVisible(true);
        addKeyListener(this);
    }

    public static void main(String[] args) {
        HW_Thread p = new HW_Thread();
        Thread1 thread = new Thread1();
        thread.start();
    }

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while(flag){
                System.out.println("TEST MESSAGE");
            }
        }
    }

    static boolean flag = true;

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            flag = false;
            System.out.println("Поток остановлен");
        } else flag = true;
    }


    //не используем:

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
