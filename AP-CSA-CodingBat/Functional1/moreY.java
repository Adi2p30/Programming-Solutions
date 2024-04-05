package Functional1;

import java.util.List;

public class moreY {

  public List<String> moreY(List<String> strings) {
    strings.replaceAll(n -> "y" + n + "y");
    return strings;
  }
}
