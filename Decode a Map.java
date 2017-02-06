package mapdecoder;

import java.util.*;

public class MyMapDecoder implements MapDecoder {
    
    @Override
    public Map<String, String> decode(String s) {
        Map<String, String> result = new HashMap<>();
        if (s == "")
            result = Collections.EMPTY_MAP;
        else if (s == null)
            result = null;
        else {
            try {
                String[] pairs = s.split("&");
                for (String p : pairs) {
                    String[] keyValue = p.split("=", -1);
                    result.put(keyValue[0], keyValue[1]);
                }
            } catch (Exception e) {
                throw new IllegalArgumentException();
            }
        }
        return result;
    }
}
