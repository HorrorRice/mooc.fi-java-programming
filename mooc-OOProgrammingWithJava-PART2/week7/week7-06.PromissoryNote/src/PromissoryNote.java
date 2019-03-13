
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rifqi
 */
public class PromissoryNote {

    private HashMap<String, Double> loanList;

    public PromissoryNote() {
        this.loanList = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        this.loanList.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if(this.loanList.containsKey(whose)) {
            return this.loanList.get(whose);
        }
        return 0;
    }
        
//        Double value = debt.get(whose);    
//          if (value == null) {
//            return 0;
//        }
// 
//        return value;
//    }
}
