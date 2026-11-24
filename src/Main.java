public class Main {

    public static Label[] analyzeText(TextAnalyzer[] analyzers, String text) {
        Label[] labels = new Label[analyzers.length];
        for (int i = 0; i < analyzers.length; i++) {
            labels[i] = analyzers[i].processText(text);
        }
        return labels;
    }

    public static void main(String[] args) {
        TextAnalyzer[] analyzers = {
                new SpamAnalyzer(new String[]{"спам", "реклама"}),
                new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(20)
        };

        String text = "Это спам :( текст очень длинный";
        Label[] labels = analyzeText(analyzers, text);

        for (Label label : labels) {
            System.out.println(label);
        }
    }
}