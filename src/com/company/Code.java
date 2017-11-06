package com.company;

public class Code {
    private String myCode;
    private  String originalCode;
    private String X;
    int i = 0;


    public Code(String code)
    {
        originalCode = code;
        X ="";
        myCode = code;

        for(int i = 0; i < myCode.length(); i++)
            X = X + "X";
    }
    public String getCode()
    {
        return myCode;
    }

    public void hide(int p1, int p2)
    {

        myCode = originalCode.substring(0,p1) + X.substring(p1,p2) + originalCode.substring(p2,originalCode.length());


    }

    public void recover(int p1, int p2) {

        myCode = originalCode.substring(0,p1) + originalCode.substring(p1,p2) + originalCode.substring(p2,originalCode.length());

    }
}


