package AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT {
    public static void main(String[] args) {
        Window window = new Window();

    }




    class Window extends Frame{
        public Window(){
            setBackground(Color.white);
            setBounds(0,0,800,600);
            setVisible(true);

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    System.exit(0);
                }
            });



        }

    }

}
