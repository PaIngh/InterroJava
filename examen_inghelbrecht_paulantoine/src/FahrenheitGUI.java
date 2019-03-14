
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//permet de creer des boutons, zone de texte pour mettre en application la conversion
public class FahrenheitGUI extends JFrame {

    public FahrenheitGUI()
    {
        super();
        build();
    }

    void build()
    {
        setTitle("Convert Celsius to Fahrenheit"); // nom de la fenetre
        setPreferredSize(new Dimension(300, 100)); //sa taille
        setDefaultCloseOperation(EXIT_ON_CLOSE); // si probleme
        setContentPane(buildContentPane()); // son contenu
    }


    Container buildContentPane()
    {

        JLabel label2 = new JLabel("Convert Celsius to Fahrenheit"); // faire afficher le mot celsius sur le bord droit
        getContentPane().add(label2, BorderLayout.NORTH);

        JLabel label = new JLabel("Celsius"); // faire afficher le mot celsius sur le bord droit
        getContentPane().add(label, BorderLayout.EAST);

        JTextArea textArea = new JTextArea(1, 10);
        getContentPane().add(textArea, BorderLayout.WEST); // faire afficher une zone de text sur le bord gauche
        textArea.setEditable(true);

        JTextField result = new JTextField();
        result.setEditable(false);
        getContentPane().add(result, BorderLayout.SOUTH); //


        JButton button = new JButton("Convert");
        getContentPane().add(button, BorderLayout.SOUTH); //faire afficher le bouton en bas de la page

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) //evenement pour passer de celsius a fahrenheit
            {
                String name;
                int n;

                name = textArea.getText();
                n = Integer.parseInt(name); //cast de text en int
                int res = Fahrenheit.fahrenheit(n);
                String result = String.valueOf(res);
                label.setText(result +"Fahrenheit"); // affichage du resultat
            }
        });

        pack();
        return getContentPane();
    }
}
