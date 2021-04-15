package com.fiveacademy.projetoengeloxmaven;

import java.util.ArrayList;
import org.mariuszgromada.math.mxparser.Expression;

/**
 *
 * @author Nigri
 */
public class OperacoesModel {

    private String operation = "";
    private ArrayList<String> tempOperation = new ArrayList<>();
    private ArrayList<String> allresults = new ArrayList<>();
    private String tempOperationResult = "";
    private String result = "";

    /**
     * @return the operacao
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @param operation the Operation to set
     */
    public void setOperation(String operation) {

        this.operation += operation;
    }

    public void deleteLastDigitOperation() {

        if (this.operation.length() > 0) {
            String newStringOperation = this.operation.substring(0, this.operation.length() - 1);
            this.operation = newStringOperation;
        }

    }

    /**
     * @return the result
     */
    public String getResult() {
        return result;
    }

    public boolean setResult(boolean addAllResults) {
        Expression e = new Expression(this.operation);
        double calc = e.calculate();

        if (String.valueOf(calc) != "NaN") {
            result = String.valueOf(calc);
            if (addAllResults) {
                setAllResults(calc);
            }
            return true;
        }

        result = "Erro ao calcular expressão";
        return false;

    }

    public boolean isLastDigitASpecialOperator() {
        if (this.operation.length() != 0) {
            String lastDigit = this.operation.substring(this.operation.length() - 1);

            if (lastDigit.equals("-") || lastDigit.equals("+") || lastDigit.equals("/") || lastDigit.equals("*") || lastDigit.equals(".")) {
                return true;
            }
        }
        return false;
    }

    public void verifySinAndCos() {

        int operationLength = this.operation.length() - 1;

        for (int i = operationLength; i >= 0; i--) {

            if (this.operation.charAt(i) == '(') {
                System.out.println(i);
                if (i > 0) {
                    if (this.operation.charAt(i - 1) == 'n' || this.operation.charAt(i - 1) == 's') {
                        setOperation("*[deg])");
                    } else {
                        setOperation(")");
                    }
                } else {
                    setOperation(")");
                }

                break;
            }
        }
    }

    public void clearOperation() {
        this.operation = "";
    }

    /**
     * @return the tempOperation
     */
    public void getTempOperation() {
        System.out.println("Tamanho da Lista: " + tempOperation.size());
        tempOperation.forEach(x -> {
            System.out.println(x);
        });
    }

    /**
     * @param tempOperation the tempOperation to set
     */
    public void setTempOperation() {
        this.tempOperation.add(result);
    }

    public void removeTempOperation() {
        if (tempOperation.size() > 0) {
            this.tempOperation.remove(tempOperation.size() - 1);
        }

    }

    public void resetTempOperation() {
        this.tempOperation = new ArrayList<>();
    }

    /**
     * @return the tempOperationResult
     */
    public String getTempOperationResult() {
        return tempOperationResult;
    }

    /**
     * @param tempOperationResult the tempOperationResult to set
     */
    public void setTempOperationResult() {
        double totalSoma = 0;
        for (String operation : tempOperation) {
            double novo = Double.parseDouble(operation);
            totalSoma += novo;
        }

        this.tempOperationResult = String.valueOf(totalSoma);

        setAllResults(totalSoma);
    }

    /**
     * @return the allresults
     */
    public ArrayList<String> getAllresults() {
        return allresults;

    }

    public void setAllResults(double totalSoma) {
        if (totalSoma != 0) {
            allresults.add(String.valueOf(totalSoma));
        }
    }
}
