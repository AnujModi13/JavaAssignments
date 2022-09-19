class PP4_4_3 {
    public static void main(String[] args) {
        try {
            int array[] = new int[10];
            array[11] = 30 / 0;
        } catch ( ArrayIndexOutOfBoundsException |ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Program Execution Completed" );
        }
    }
}