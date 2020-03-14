grammar inputCommands;

inputCommands   :   command_list
                ;

command_list    :   command
                |   command command_list
                ;

command         :   left
                |   right
                |   up
                |   down
                |   move
                |   set_brush_size
                |   set_heading
                |   for_statement
                ;

left            :   'left(' NUM ')'
                    {
                        Window.drawPanel.left(Integer.parseInt($NUM.text));
                    }
                ;

right           :   'right(' NUM ')'
                    {
                        Window.drawPanel.right(Integer.parseInt($NUM.text));
                    }
                ;

up              :   'up(' NUM ')'
                    {
                        Window.drawPanel.up(Integer.parseInt($NUM.text));
                    }
                ;

down            :   'down(' NUM ')'
                    {
                        Window.drawPanel.down(Integer.parseInt($NUM.text));
                    }
                ;

move            :   'move(' NUM ')'
                    {
                        Window.drawPanel.move(Integer.parseInt($NUM.text));
                    }
                ;

set_brush_size  :   'setBrushSize(' NUM ')'
                    {
                        Window.drawPanel.setBrushSize(Integer.parseInt($NUM.text));
                    }
                ;

set_heading     :   'setHeading(' NUM ')'
                    {
                        Window.drawPanel.setHeading(Integer.parseInt($NUM.text));
                    }
                ;

for_statement :   FOR NUM DO command_list END
                    {

                    }
                ;

/*REGEX lexer rules*/

BOOLEAN         :   'true'
                |   'false'
                ;

FOR             :   'for'
                ;

DO              :   'do'
                ;

END             :   'end'
                ;

NUM             :   [0-9][0-9]*
                ;

ID              :   [A-Za-z][A-Za-z0-9_]*
                ;

WHITESPACE      :   [ \t\n\r] -> skip
                ;
