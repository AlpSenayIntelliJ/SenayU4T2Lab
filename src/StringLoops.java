public class StringLoops
{

    public StringLoops() { }


    public int countCharacters(String character, String searchString) {
        int count = 0;
        for (int idx = 0; idx < searchString.length(); idx++) {
            String nextChar = searchString.substring(idx, idx + 1);
            if (nextChar.equals(character)) {
                count++;
            }
        }
        return count;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    //public String reverseString(String origString) {
        /* to be implemented */
    //}
}

