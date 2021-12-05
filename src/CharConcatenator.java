public class CharConcatenator implements IConcatenator {
    public String concatenate(String[] strings) {
        String newFinalString = new String();
        for (int i = 0; i < strings.length; i++) {
            newFinalString = newFinalString + strings[i];
        }
        char[] chars = newFinalString.toCharArray();
        String result = new String();
        for (int i = 0; i < chars.length; i++) {
            result = result + chars[i];
        }
        return result.toString();

        //TODO implement via string concatenation
    }

}

