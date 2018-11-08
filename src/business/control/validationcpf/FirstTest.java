public class FirstTest implements CpfVerification {
    private int value;
    private int[] digits;

    public FirstTest(int[] digits) {
        this.digits = digits;
        value = 0;
    }

    @Override
    public CpfVerification validate() {

        for (int i=10, j=0; i>=2; i--, j++) {
            value += i * digits[j];
        }

        if ((value*10)%11 == digits[9]){
            return new SecondTest(digits);
        } else {
            this.error();
        }
        return null;
    }

    @Override
    public void error() {
        System.out.println("cpf invalido");
    }
}
