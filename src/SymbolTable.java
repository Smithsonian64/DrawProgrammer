public class SymbolTable {

    String name;
    int value;
    SymbolTable next;

    public SymbolTable() {
        name = null;
    }

    public boolean search(String n) {
        try {
            if(this.name.equals(n)) return true;
        } catch (NullPointerException e) {

        }
        if(this == null || this.name == null || this.next == null) return false;


        return next.search(n);

    }

    public void createSymbol(String n, int val) {
        SymbolTable newTab = new SymbolTable();
        if(search(n)) return;
        newTab.name = n;
        newTab.value = val;
        if(this.name == null) {
            this.name = n;
            this.value = val;
            return;
        } else if(this.next == null) this.next = newTab;
        else this.next.createSymbol(n, val);
    }

    public int getValue(String n) {
        if(!search(n)) return -1;
        try {
            if(this.name.equals(n)) return this.value;
        } catch (NullPointerException e) {
            System.out.println("value not initialized");
        }
        return this.next.getValue(n);
    }

    public void setValue(String n, int val) {
        if(!search(n)) return;
        try {
            if(this.name.equals(n)) this.value = val;
        } catch (NullPointerException e) {
            System.out.println("value not initialized");
        }
        this.next.setValue(n, val);
    }

    public static void main(String args[]) {

        SymbolTable table = new SymbolTable();
        table.createSymbol("x", 10);
        table.createSymbol("hello", 60);
        table.createSymbol("pop", 66);

        SymbolTable cursor = table;

        while(table != null) {

            try {
                System.out.println("name: " + cursor.name + " value: " + cursor.value);
                cursor = cursor.next;
            } catch (NullPointerException e) {

            }
        }

    }
}

