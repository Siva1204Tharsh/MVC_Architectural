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
public class Practical_MVC_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view,model);
        view.setVisible(true);
        
    }
    
}
