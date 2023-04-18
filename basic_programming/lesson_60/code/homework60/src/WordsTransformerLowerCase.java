public class WordsTransformerLowerCase extends WordsTransformer{

    public boolean check ( String input){
        return input.length() == 4;
    }

    public String transform( String string){
        return string.toLowerCase();
    }
}
