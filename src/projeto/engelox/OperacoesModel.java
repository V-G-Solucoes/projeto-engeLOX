package projeto.engelox;

/**
 *
 * @author Nigri
 */
public class OperacoesModel {
    private String Operation = "";
    private String Result = "";

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
