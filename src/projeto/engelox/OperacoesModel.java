package projeto.engelox;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nigri
 */
public class OperacoesModel {
    private String Operation = "";
    private String Result = "";
    private ArrayList<String> expression = new ArrayList<String>();
    private int countOperator = 0;
    private double totalExpressionResult = 0.0;
    
    public void setCalculatorList(String temporalResult){
            
            expression.add("aaaaaaaaaaa");
            for(int i = 0; i < expression.size(); i++){
            System.out.println(expression.get(i));
        }
    }
    
    public void getCalculatorList(){
        for(int i = 0; i < expression.size(); i++){
            System.out.println(expression.get(i));
        }
    }   
    /**
     * @return the operacao
     */
    public String getOperation() {
        return Operation;
    }

    /**
     * @param operation the Operation to set
     */
    public void setOperation(String operation) {
        
        Operation += operation;
    }

    public void deleteLastDigitOperation()
    {
        if (Operation.length() > 0) {
            String newStringOperation = Operation.substring(0,Operation.length() - 1);
            Operation = newStringOperation;
        }

    }
    /**
     * @return the result
     */
    public String getResult() {
        return Result;
    }

    /**
     * @param result the Result to set
     */
    public void setResult(String result) {
        Result = result;
    }
    
    public boolean isSpecialOperator(){
        String lastDigit = Operation.substring(Operation.length() - 1);
        
        if(lastDigit.equals("-") || lastDigit.equals("+") || lastDigit.equals("/")|| lastDigit.equals("*") || lastDigit.equals(".")){
            return true;
        }
        
        return false;
    }
}
