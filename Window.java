import javax.swing.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Window extends JFrame {
    private final int size ;
    public Window(int size )
    {
        this.size = size ;
        setTitle("Pebble");
        setSize(500,500);

        setVisible(true);

        JPanel top = new JPanel() ;

        JButton newGameButton = new JButton() ;
        newGameButton.setText("new game ");
        top.add(newGameButton) ;
        newGameButton.addActionListener(getActionListener(this.size));

        this.getContentPane().add(top);
    }

    private ActionListener getActionListener(final int size ) {
        return new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("starting the game by size :" +size);

            }
        };
    }



}