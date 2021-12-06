public class StringBufferConcatenator implements IConcatenator {
    @Override
    public String concatenate(String[] strings) {
        StringBuffer newFinalStringBuffer = new StringBuffer();

        for (int i = 0; i < strings.length; i++) {
            newFinalStringBuffer.append(strings[i]);
        }

        return newFinalStringBuffer.toString();
    }
}

