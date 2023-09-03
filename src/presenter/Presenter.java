package presenter;

import view.MyFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter implements ActionListener {
    private MyFrame myFrame;
    public Presenter() {
        myFrame = new MyFrame(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comand = e.getActionCommand();
        if (comand == "generate") {
            System.out.println("fndsl");
            myFrame.drawTriangle(myFrame.getInputData().getInputDepth());

        }
    }

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel( "javax.swing.plaf.nimbus.NimbusLookAndFeel" );
        } catch( Exception e ) {
            e.printStackTrace();
        }
        new Presenter();
    }
}
