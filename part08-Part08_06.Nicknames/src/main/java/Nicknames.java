
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        
        HashMap<String, String> nicknames = new HashMap<>();
        
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");
        
        nicknames.get("matthew");
        nicknames.get("michael");
        nicknames.get("arthur");
    }

}
