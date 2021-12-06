
public class StringConcatenator implements IConcatenator {
    @Override
    public String concatenate(String[] strings) {
        String newFinalString = "";

        for (int i = 0; i < strings.length; i++) {
            newFinalString = newFinalString + strings[i]; //newFinalString += strings[i]; newFinalString = newFinalString.concat(strings[i]);
        }

        return newFinalString;
    }
}
