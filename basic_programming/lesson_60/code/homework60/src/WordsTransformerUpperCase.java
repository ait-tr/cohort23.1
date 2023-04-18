public class WordsTransformerUpperCase extends WordsTransformer{
    @Override
    public boolean check(String input) {
        return input.length() == 3;
    }

    @Override
    public String transform(String string) {
        return string.toUpperCase();
    }
}
