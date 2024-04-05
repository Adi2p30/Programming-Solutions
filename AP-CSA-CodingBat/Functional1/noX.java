package Functional1;

import java.util.List;

public class noX {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replace("x", ""));
        return strings;
      }
      
      
}
