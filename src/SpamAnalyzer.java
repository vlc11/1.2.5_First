public class SpamAnalyzer implements TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        for (String keywords : keywords) {
            if (text.contains(keywords)) {
                return Label.SPAM;
            }
        }
        return Label.OK;
    }
}
