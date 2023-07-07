package Calculator;

public class Calculator {
    public static void main(String[] args) {
        CalcView view = new CalcView();
        CalcModel model = new CalcModel();
        CalcPresenter presenter = new CalcPresenter(view, model);
        presenter.perfomCalc();
        
    }
}
