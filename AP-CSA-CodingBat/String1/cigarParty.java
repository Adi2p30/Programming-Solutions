package String1;

public class cigarParty {
  // https://codingbat.com/prob/p159531
  public boolean cigarParty(int cigars, boolean isWeekend) {
    boolean party = false;
    if (isWeekend == false) {
      if (cigars >= 40 && cigars <= 60) {
        party = true;
      }
    } else {
      if (cigars >= 40) {
        party = true;
      }
    }
    return party;
  }
}
