
public class StringConcatenator implements IConcatenator {
    public String concatenate(String[] strings) {
        String newFinalString = new String();
        if (strings.length != 0) {
            for (int i = 0; i < strings.length; i++) {
                newFinalString = newFinalString + strings[i];
            }
            //TODO implement via string concatenation
        }
        return newFinalString;
    }
}
