import aa.CalSecond;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CalSecond calSecond = new CalSecond();
        int retValue = calSecond.inputNumber();
        System.out.println(retValue);

        String resultValue = calSecond.calculate(retValue);
        System.out.println(retValue);

       // System.out.println(calSecond.inputNumber());

      //  CalSecond calSecond2 = calSecond;

        //System.out.println(calSecond);
        //System.out.println(calSecond2);
    }
}