import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandBox implements ActionListener {

    Window parent;

    JFrame dialog;
    JPanel dialogPanel;
    JTextPane textEntry;
    JButton executeButton;

    final int WINDOW_WIDTH = 200;
    final int WINDOW_HEIGHT = 200;

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Execute")) {
            String commands = textEntry.getText();
            textEntry.setText("");
            parseCommands(commands);
            return;
        }
    }

    public CommandBox(Window p) {
        parent = p;
        dialog = new JFrame("Commands");
        dialog.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        dialog.setLocation(0, 0);

        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        dialogPanel = new JPanel();

        textEntry = new JTextPane();

        executeButton = new JButton("Execute");
        executeButton.addActionListener(this);
        executeButton.setActionCommand("Execute");

        dialogPanel.add(textEntry, BorderLayout.CENTER);
        dialogPanel.add(executeButton, BorderLayout.NORTH);

        dialog.add(dialogPanel);

        dialog.setAlwaysOnTop(true);


        dialog.setVisible(true);
    }

    public void parseCommands(String commands) {
        if(commands.trim().equals("")) return;
        String currentToken;
        if(!commands.contains("\n")) {
            currentToken = commands;
        } else {
            currentToken = commands.substring(0, '\n');
        }
        String nextSet = commands.substring(commands.indexOf(';') + 1);

        if(currentToken.contains("left")) {
            parent.drawPanel.left(Integer.parseInt(commands.substring(commands.indexOf('(')+1, commands.indexOf(')'))));
            return;
        }
        else if(currentToken.contains("right")) {
            parent.drawPanel.right(Integer.parseInt(commands.substring(commands.indexOf('(')+1, commands.indexOf(')'))));
            return;
        }
        else if(currentToken.contains("up")) {
            parent.drawPanel.up(Integer.parseInt(commands.substring(commands.indexOf('(')+1, commands.indexOf(')'))));
            return;
        }
        else if(currentToken.contains("down")) {
            parent.drawPanel.down(Integer.parseInt(commands.substring(commands.indexOf('(')+1, commands.indexOf(')'))));
            return;
        }

        //parseCommands(nextSet);

    }


}
