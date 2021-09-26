class Solution1 {

    public static void main(String args[]){

        System.out.println(getSum(1,2));

    }

    public static int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
