package javaprogramming.mooc.part8.nicknames;

import java.util.HashMap;

public class NicknamesMain {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String,String> map = new HashMap<>();

        map.put("matthew", "matt");
        map.put("michael", "mix");
        map.put("arthur", "artie");

        System.out.println(map.get("matthew"));
    }

}