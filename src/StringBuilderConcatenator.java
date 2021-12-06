public class StringBuilderConcatenator implements IConcatenator {
    @Override
    public String concatenate(String[] strings) {
        StringBuilder newFinalStringBuilder = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            newFinalStringBuilder.append(strings[i]);
        }

        return newFinalStringBuilder.toString();
    }
}


