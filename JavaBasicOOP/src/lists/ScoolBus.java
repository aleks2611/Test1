package lists;

import java.util.ArrayList;

public class ScoolBus {
    public static void main(String[] args) {
        ArrayList<String> numerOfChildredn = new ArrayList<>();
        numerOfChildredn.add("Amore");
        numerOfChildredn.add("Aura");
        numerOfChildredn.add("Filipino");
        numerOfChildredn.add("Joy");
        numerOfChildredn.add("Ali");
        numerOfChildredn.add("Mori");
        for (String i : numerOfChildredn) {
            System.out.println(i);
            if (i.contains("Ali"))
            break;
        }

    }
}
