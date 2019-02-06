/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rifqi
 */
public class Counter {

    private int counter;
    private boolean check;

    public Counter(int counter, boolean check) {
        this.check = check;
        this.counter = counter;
    }

    public Counter(int counter) {
        this(counter, false);
    }

    public Counter(boolean check) {
        this(0, true);

    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.counter;
    }

    public void increase() {
        counter++;
    }

    public void decrease() {
        if (check == true) {
            if (counter > 0) {
                counter--;
            }
        } else if (check == false) {
            counter--;
        }

    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            counter += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            return;
        }
        counter -= decreaseAmount;
        

        if (check && counter < 0) {
            counter = 0;
        }

    }
}

//        if (decreaseAmount > 0) {
//            if (check == true) {
//                if (counter >= decreaseAmount) {
//                    counter -= decreaseAmount;
//                } else {
//                    counter = 0;
//                }
//            } else {
//                counter -= decreaseAmount;
//            }
//        }
//    }
//}
