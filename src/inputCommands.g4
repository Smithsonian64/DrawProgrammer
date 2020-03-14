grammar inputCommands;

tokens { name }

commands   :   c ommands_list
            ;

commands_list   :   command
                |   command commands_list
                ;

command         :   name '(' params ')'
                ;

params          :   param
                |   param params
                ;

param           :   /*nothing*/
                |   NUM
                ;

fragment NUM    :   [0-9][0-9]* ;

WHITESPACE      :   [ \t\n] -> skip;
