public class NegativeTextAnalyzer implements TextAnalyzer {

    public NegativeTextAnalyzer() {

    }

    @Override
    public Label processText(String text) {
        if (text.contains(":(")) {
            return Label.NEGATIVE_TEXT;
        }
        return Label.OK;
    }
}
