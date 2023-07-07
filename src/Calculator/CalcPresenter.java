package Calculator;

public class CalcPresenter {
   private CalcView view;
   private CalcModel model;

   public CalcPresenter(CalcView view, CalcModel model){
       this.view = view;
       this.model = model;
   }

   public void perfomCalc() {
       double number = view.getDouble();
       char operator = view.getInputOperator();
       double number2 = view.getDouble();
       model.setResult(number);

       switch (operator) {
           case '+':
               model.add(number);
               break;
           case '-':
               model.subs(number);
               break;
           case '*':
               model.mult(number);
               break;
           case '/':
               model.devide(number);
               break;
           default:
               System.out.println("Некорректный оператор ");
               return;
       }
       view.displayResult(model.getResult());
   }
}
