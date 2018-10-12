package com.blogspot.choosejava.smartpdflib;

import android.content.Context;
import android.widget.Toast;

public class ToastTest {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
