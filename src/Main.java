public class Main {
    public static void main(String[] args) {
        ConcatenationTester tester = new ConcatenationTester();
        IConcatenator stringConcatenator = new StringConcatenator();
        IConcatenator stringBuilderConcatenator = new StringBuilderConcatenator();
        IConcatenator stringBufferConcatenator = new StringBufferConcatenator();
        IConcatenator charConcatenator = new CharConcatenator();


        System.out.println(tester.test(stringConcatenator, "Hello world guys", 100000));
        System.out.println(tester.test(stringBuilderConcatenator, "Hello world guys", 100000));
        System.out.println(tester.test(stringBufferConcatenator, "Hello world guys", 100000));
        System.out.println(tester.test(charConcatenator, "Hello world guys", 100000));

    }
}
