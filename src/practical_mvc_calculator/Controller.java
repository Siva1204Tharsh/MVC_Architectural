/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical_mvc_calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SIVA1201
 */
public class Controller {
    private final View view;
    private final Model model;
    
    Controller(View view , Model model){
        this.view = view;
        this.model = model;
        this.view.addButtonListener((ActionListener) new addListener());
        
    }
    class addListener implements ActionListener{
        
        
        @Override
        public void actionPerformed(ActionEvent e){
            double num1 ,num2 = 0;
            try{
                num1 = view.getNumber1();
                num2 = view.getNumber2();
                model.addNumbers(num1, num2);
                view.setResult(model.getResultVal());
            } catch(NumberFormatException ex){
                System.out.println("Enter 2 Number");
            
            }
            
        }
    }
    
}
