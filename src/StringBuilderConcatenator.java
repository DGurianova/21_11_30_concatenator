public class StringBuilderConcatenator implements IConcatenator {
    public String concatenate(String[] strings) {
        StringBuilder newFinalStringBuilder = new StringBuilder();
        if (strings.length != 0) {
            for (int i = 0; i < strings.length; i++) {
                newFinalStringBuilder.append(strings[i]);
            }
            //TODO implement via string concatenation
        }
        return newFinalStringBuilder.toString();
    }
}


