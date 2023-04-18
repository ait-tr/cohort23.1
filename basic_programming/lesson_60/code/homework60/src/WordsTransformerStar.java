public class WordsTransformerStar extends WordsTransformer{
    @Override
    public boolean check(String input) {
        return input.length() == 5;
    }

    @Override
    public String transform(String string) {
        return "*****";
    }
}
