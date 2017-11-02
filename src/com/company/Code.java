package com.company;

/**
 * Created by ma128 on 11/2/17.
 */
public class Code {

    private String myCode;
    // additional instance variables

    public Code(String code)
    {
        myCode = code;
//possibly additional statements
    }
    public String getCode()
    {
        return myCode;
    }
    // precondition: p1 >= 0, p1 < p2
// p2 <= myCode.length()
// Replaces the characters in the code starting at
// position p1 until position p2 - 1 inclusive with an X
    public void hide(int p1, int p2)
    {
// to be implemented
    }
    // precondition: p1 >= 0, p1 < p2
// p2 <= myCode.length()
// Restores to their original values the characters in
// the code starting at position p1 until position
// p2-1 inclusive
    public void recover(int p1, int p2)
    {
// to be implemented
    }




}

