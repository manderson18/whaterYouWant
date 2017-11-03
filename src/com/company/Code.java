package com.company;


public class Code {


    private String myCode;
    private String origCode;
    private char X = 'X';
    private String hiddenCode;
    private int i;

    // use char array instead
    public Code(String code)
    {
        myCode = code;


    }
    public String getCode()
    {
        return myCode;
    }

    // precondition: p1 >= 0, p1 < p2
// p2 <= myCode.length()


    public void hide(int p1, int p2)
    {
        for (i = 0; i >= myCode.length(); i++){

           hiddenCode = myCode.substring(p1,p2);

            System.out.println(hiddenCode + X);


        }







    }

    // precondition: p1 >= 0, p1 < p2
// p2 <= myCode.length()

    public void recover(int p1, int p2)
    {









    }




}

