public class AA {
    public static void main(String[] args) {
        //break -> while for switch 빠져나옴
        int sum = 0;
        for (int i =1; ;i++){
            System.out.println("i=" +i);
            if (i%2==0){
                sum = sum - i;
            }else {
                sum = sum +i;
            }
            System.out.println("중간sum="+sum);
            if (sum > 100)
                break;
        }
        System.out.println(sum);
    }
}
