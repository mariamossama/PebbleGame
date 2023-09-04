import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.awt.event.*;


public class BaseWindow extends JFrame {


    public BaseWindow(){
        setTitle("Pebble");
        setSize(500,500);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel() ;

        JButton small = new JButton() ;
        small.setText("3 x 3");
        small.addActionListener(getActionListener(3));

        JButton medium = new JButton() ;
        medium.setText("4 X 4");
        medium.addActionListener(getActionListener(4));

        JButton large = new JButton() ;
        large.setText("6 X 6");
        large.addActionListener(getActionListener(6));

        panel.add(small);
        panel.add(medium);
        panel.add(large);
        this.getContentPane().add(panel);


        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                showExitConfirmation();


            }
        });


    }

    private void showExitConfirmation(){
        int n = JOptionPane.showConfirmDialog(this , "Do you really want to exit ?" , "Really ?" ,
                JOptionPane.YES_NO_OPTION);
        if(n==JOptionPane.YES_OPTION){
            doUponExit();
        }
    }

    protected void doUponExit(){
        this.dispose();
    }

    private ActionListener getActionListener(final int size ) {
        return new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                Window window = new Window(size) ;
                window.setVisible(true);
            }
        };
    }

}