package Calculator;

public class CalcModel {
    private double result;

    public void add (double number){
        result += number;
    }
    public void subs (double number){
        result -= number;
    }
    public void mult (double number){
        result *= number;
    }
    public void devide (double number){
        CalcView lovalNumber = new CalcView();
        while (number ==0){
            System.out.println("На ноль делить нельзя");
            number = lovalNumber.getDouble();
        }
        result /=number;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
