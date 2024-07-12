package day01;

class Ex01 {

    public static void main(String[] args){
        scanner scan = new scanner(System.in);
        double doubleValue = scan.naxtDouble();
        int intValue = (int) (doubleValue*100)
        System.out.println(intValue);
        System.out.println(intValue/(double)100);

        
    }



    
}