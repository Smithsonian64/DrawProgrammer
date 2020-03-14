import org.antlr.v4.runtime.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandBox implements ActionListener {

    Window parent;

    JFrame frame;
    JPanel commandsPanel;
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
        frame = new JFrame("Commands");
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLocation(0, 0);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        commandsPanel = new JPanel(new BorderLayout());

        textEntry = new JTextPane();
        textEntry.setSize(200, 200);

        executeButton = new JButton("Execute");
        executeButton.addActionListener(this);
        executeButton.setActionCommand("Execute");
        commandsPanel.add(textEntry, BorderLayout.CENTER);
        commandsPanel.add(executeButton, BorderLayout.NORTH);



        frame.add(commandsPanel);

        frame.setAlwaysOnTop(true);


        frame.setVisible(true);
    }

    public void parseCommands(String commands) throws NullPointerException {

        CharStream stream = CharStreams.fromString(commands);
        inputCommandsLexer lexer = new inputCommandsLexer(stream);
        TokenStream tokens = new CommonTokenStream(lexer);

        inputCommandsParser parser = new inputCommandsParser(tokens);

        String tree = parser.inputCommands().toStringTree();

    }


    }
