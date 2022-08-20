package Output.WindowOutputPackage.Panel.found;

import Main.Result;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private Result result;

    public ButtonListener(Result result){
        this.result = result;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       moreWindow window = new moreWindow();
       window.create(result);
    }
}
