/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical_mvc_calculator;

/**
 *
 * @author SIVA1201
 */
public class Model {
    private double resultVal;
    
    public void addNumbers(double num1 ,double num2){
        resultVal = num1 + num2;
    }
    public void subNumbers(double num1 ,double num2){
        resultVal = num1 - num2;
    }
    public void multiNumbers(double num1 ,double num2){
        resultVal = num1 * num2;
    }
    public void divNumbers(double num1 ,double num2){
        resultVal = num1 / num2;
    }
    public double getResultVal(){
        return resultVal;
    }
    
}
