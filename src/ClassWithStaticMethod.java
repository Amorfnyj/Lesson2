public class ClassWithStaticMethod {
    public static int heightSum (Furniture pieceOne, Furniture pieceTwo) {
        int sum = pieceOne.getHeight() + pieceTwo.getHeight();
        return sum;
    }
}
