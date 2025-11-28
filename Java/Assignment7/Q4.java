class Q4 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            int b[] = new int[2];
            b[5] = 50;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error.");
        } catch (Exception e) {
            System.out.println("Some other error.");
        }
    }
}
