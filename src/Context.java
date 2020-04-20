public class Context {
    private String input = "";
    private String output = "";
    private String fromConversion = "";
    private String toConversion = "";
    private double quantity;

    String[] partsOfInput;

    public Context(String input)
    {
        this.input = input;

        partsOfInput = getInput().split(" ");

        fromConversion = getCapitalized(partsOfInput[1]);

        toConversion = getLowercase(partsOfInput[3]);

        quantity = Double.valueOf(partsOfInput[0]);

        output = partsOfInput[0] + " "+ partsOfInput[1] + " equals ";
    }

    public String getInput() { return input; }

    public String getFromConversion() { return fromConversion; }

    public String getToConversion() { return toConversion; }

    public String getResponse() { return output; }

    public double getQuantity() { return quantity; }

    public String getLowercase(String wordToLowercase){

        return wordToLowercase.toLowerCase();

    }


    public String getCapitalized(String wordToCapitalize){
        wordToCapitalize = wordToCapitalize.toLowerCase();
        wordToCapitalize = Character.toUpperCase(wordToCapitalize.charAt(0)) + wordToCapitalize.substring(1);
        wordToCapitalize = toPlural(wordToCapitalize);
        return wordToCapitalize;
    }

    public String toPlural(String wordToCapitalize) {
        int lengthOfWord = wordToCapitalize.length();
        if((wordToCapitalize.charAt(lengthOfWord -1)) != 's'){
            wordToCapitalize = new StringBuffer(wordToCapitalize).insert(lengthOfWord, "s").toString();
        }
        return wordToCapitalize;
    }
}
