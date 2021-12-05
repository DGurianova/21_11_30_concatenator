public class StringBufferConcatenator implements IConcatenator {
    public String concatenate(String[] strings) {
        StringBuffer newFinalStringBuffer = new StringBuffer();
        if (strings.length != 0) {
            for (int i = 0; i < strings.length; i++) {
                newFinalStringBuffer.append(strings[i]);
            }
            //TODO implement via string concatenation
        }
        return newFinalStringBuffer.toString();
    }
}
