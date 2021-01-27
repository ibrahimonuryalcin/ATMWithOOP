
package com.practice.java.main;

import com.practice.java.domain.ATM;
import com.practice.java.domain.Account;


public class Driver {
    public static void main(String[] args) {
        ATM atm = new ATM();
        
        atm.startAtm(new Account("onuryalcin", "123456", 5000));
    }
}
