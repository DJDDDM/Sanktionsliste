package Input.WindowInputpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private final Thread thread;

    public ButtonListener(Thread thread){
        this.thread = thread;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        thread.interrupt();
    }
}
