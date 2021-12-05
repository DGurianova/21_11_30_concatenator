public class Main {
    public static void main(String[] args) {
//        ConcatenationTester tester = new ConcatenationTester();
        IConcatenator stringConcat = new StringConcatenator();
        IConcatenator stringConcat1 = new StringBuilderConcatenator();
        IConcatenator stringConcat2 = new StringBufferConcatenator();
        IConcatenator stringConcat3 = new CharConcatenator();

//
//        System.out.println(tester.test(stringConcat, "Hello world guys", 100000));

        System.out.println(stringConcat.concatenate(new String[]{"Hello you", "Say hello", "Hi"}));
        System.out.println(stringConcat1.concatenate(new String[]{"Hello you", "Say hello", "Hi"}));
        System.out.println(stringConcat2.concatenate(new String[]{"Hello you", "Say hello", "Hi"}));
        System.out.println(stringConcat3.concatenate(new String[]{"Hello you", "Say hello", "Hi"}));


    }
}
