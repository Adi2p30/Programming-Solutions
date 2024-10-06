package String1;

public class makeTags {
    // https://codingbat.com/prob/p147483
    public String makeTags(String tag, String word) {
        return String.format("<%s>%s</%s>", tag, word, tag);
    }

}
