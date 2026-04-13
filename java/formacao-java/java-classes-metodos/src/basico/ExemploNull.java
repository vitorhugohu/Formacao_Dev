package basico;

import java.util.Objects;

public class ExemploNull {
    
    static void main() {
        String a = "";
        IO.println(a.concat("!!!"));
        a = null;
        if(a != null) {
            IO.println(a.concat("!!!"));
        }
        
        IO.println(Objects.requireNonNullElse(a, "vazio").concat("!!!"));
        
    }
}
