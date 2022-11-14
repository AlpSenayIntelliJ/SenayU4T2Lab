public class StringLoops
{

    public StringLoops() { }


    public int countCharacters(String character, String searchString) {
        int count = 0;
        for (int idx = 0; idx < searchString.length(); idx++) {
            String nextChar = searchString.substring(idx, idx + 1);
            if (nextChar.equalsIgnoreCase(character)) {
                count++;
            }
        }
        return count;
    }


    public String reverseString(String origString) {
        String newString = "";
        for (int idx = origString.length()-1; idx >= 0; idx--) {
            String temp = origString.substring(idx, idx + 1);
            newString += temp;
        }
        return newString;
    }

    public String reverseString2(String origString2) {
        String newString2 = "";
        for (int idx = 0; idx < origString2.length(); idx++) {
            newString2 = origString2.substring(idx, idx + 1) + newString2;
        }
        return newString2;
    }
}

