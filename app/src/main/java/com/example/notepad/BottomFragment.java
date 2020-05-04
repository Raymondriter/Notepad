package com.example.notepad;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class BottomFragment extends Fragment implements View.OnClickListener {
    private Communicate cm;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.bottom_fragment, parent, false);
    }

    Button btnSymBackSpace;

    /*
            Button btnN = view.findViewById(R.id.btnN);
        Button btnM = view.findViewById(R.id.btnM);
        Button btnSymComma = view.findViewById(R.id.btnSymComma);
        Button btnSymPeriod = view.findViewById(R.id.btnSymPeriod);
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // The onCreateView method is called when Fragment should create its View object hierarchy,
        // either dynamically or via XML layout inflation.
        Button btn1 = view.findViewById(R.id.btn1);
        Button btn2 = view.findViewById(R.id.btn2);
        Button btn3 = view.findViewById(R.id.btn3);
        Button btn4 = view.findViewById(R.id.btn4);
        Button btn5 = view.findViewById(R.id.btn5);
        Button btn6 = view.findViewById(R.id.btn6);
        Button btn7 = view.findViewById(R.id.btn7);
        Button btn8 = view.findViewById(R.id.btn8);
        Button btn9 = view.findViewById(R.id.btn9);
        Button btn0 = view.findViewById(R.id.btn0);
        Button btnSymMinus = view.findViewById(R.id.btnSymMinus);
        Button btnSymEqual = view.findViewById(R.id.btnSymEqual);

        Button btnQ = view.findViewById(R.id.btnQ);
        Button btnW = view.findViewById(R.id.btnW);
        Button btnE = view.findViewById(R.id.btnE);
        Button btnR = view.findViewById(R.id.btnR);
        Button btnT = view.findViewById(R.id.btnT);
        Button btnY = view.findViewById(R.id.btnY);
        Button btnU = view.findViewById(R.id.btnU);
        Button btnI = view.findViewById(R.id.btnI);
        Button btnO = view.findViewById(R.id.btnO);
        Button btnP = view.findViewById(R.id.btnP);
        Button btnSymLBracket = view.findViewById(R.id.btnSymLBracket);
        Button btnSymRBracket = view.findViewById(R.id.btnSymRBracket);
//  btnA,btnS,btnD,btnF,btnG,btnH,btnJ,btnK,btnL,btnSymSemiCol,btnSymApos,
        Button btnA = view.findViewById(R.id.btnA);
        Button btnS = view.findViewById(R.id.btnS);
        Button btnD = view.findViewById(R.id.btnD);
        Button btnF = view.findViewById(R.id.btnF);
        Button btnG = view.findViewById(R.id.btnG);
        Button btnH = view.findViewById(R.id.btnH);
        Button btnJ = view.findViewById(R.id.btnJ);
        Button btnK = view.findViewById(R.id.btnK);
        Button btnL = view.findViewById(R.id.btnL);
        Button btnSymSemiCol = view.findViewById(R.id.btnSymSemiCol);
        Button btnSymApos = view.findViewById(R.id.btnSymApos);
//   btnZ,btnX,btnC,btnV,btnB,btnN,btnM,btnSymComma,btnSymPeriod,btnSymFwdSlash,
        Button btnZ = view.findViewById(R.id.btnZ);
        Button btnX = view.findViewById(R.id.btnX);
        Button btnC = view.findViewById(R.id.btnC);
        Button btnV = view.findViewById(R.id.btnV);
        Button btnB = view.findViewById(R.id.btnB);
        Button btnN = view.findViewById(R.id.btnN);
        Button btnM = view.findViewById(R.id.btnM);
        Button btnSymComma = view.findViewById(R.id.btnSymComma);
        Button btnSymPeriod = view.findViewById(R.id.btnSymPeriod);
        Button btnSymFwdSlash = view.findViewById(R.id.btnSymFwdSlash);
        Button space = view.findViewById(R.id.btnSpace);

        //
        //
        //onclicklisteners
        //
        //

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnSymMinus.setOnClickListener(this);
        btnSymEqual.setOnClickListener(this);

        btnQ.setOnClickListener(this);
        btnW.setOnClickListener(this);
        btnE.setOnClickListener(this);
        btnR.setOnClickListener(this);
        btnT.setOnClickListener(this);
        btnY.setOnClickListener(this);
        btnU.setOnClickListener(this);
        btnI.setOnClickListener(this);
        btnO.setOnClickListener(this);
        btnP.setOnClickListener(this);
        btnSymLBracket.setOnClickListener(this);
        btnSymRBracket.setOnClickListener(this);
//  btnA,btnS,btnD,btnF,btnG,btnH,btnJ,btnK,btnL,btnSymSemiCol,btnSymApos,
        btnA.setOnClickListener(this);
        btnS.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnF.setOnClickListener(this);
        btnG.setOnClickListener(this);
        btnH.setOnClickListener(this);
        btnJ.setOnClickListener(this);
        btnK.setOnClickListener(this);
        btnL.setOnClickListener(this);
        btnSymSemiCol.setOnClickListener(this);
        btnSymApos.setOnClickListener(this);
//   btnZ,btnX,btnC,btnV,btnB,btnN,btnM,btnSymComma,btnSymPeriod,btnSymFwdSlash,
        btnZ.setOnClickListener(this);
        btnX.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnV.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnN.setOnClickListener(this);
        btnM.setOnClickListener(this);
        btnSymComma.setOnClickListener(this);
        btnSymPeriod.setOnClickListener(this);
        btnSymFwdSlash.setOnClickListener(this);
        space.setOnClickListener(this);


    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        cm = (Communicate) getActivity();
    }

    private String key;

    String getData(String key){
        return key;
    }




    /*contains all button clicks in a switch case ex.
                switch (v.getId()) {
                case R.id.btn1:
                    key = "1";
                    break;
                case R.id.btn2:
                    key = "2";
                    break;
     */
    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn1:
                    key = "1";
                    break;
                case R.id.btn2:
                    key = "2";
                    break;
                case R.id.btn3:
                    key = "3";
                    break;
                case R.id.btn4:
                    key = "4";
                    break;
                case R.id.btn5:
                    key = "5";
                    break;
                case R.id.btn6:
                    key = "6";
                    break;
                case R.id.btn7:
                    key = "7";
                    break;
                case R.id.btn8:
                    key = "8";
                    break;
                case R.id.btn9:
                    key = "9";
                    break;
                case R.id.btn0:
                    key = "0";
                    break;
                case R.id.btnSymMinus:
                    key = "-";
                    break;
                case R.id.btnSymEqual:
                    key = "=";
                    break;
                case R.id.btnQ:
                    key = "q";
                    break;
                case R.id.btnW:
                    key = "w";
                    break;
                case R.id.btnE:
                    key = "e";
                    break;
                case R.id.btnR:
                    key = "r";
                    break;
                case R.id.btnT:
                    key = "t";
                    break;
                case R.id.btnY:
                    key = "y";
                    break;
                case R.id.btnU:
                    key = "u";
                    break;
                case R.id.btnI:
                    key = "i";
                    break;
                case R.id.btnO:
                    key = "o";
                    break;
                case R.id.btnP:
                    key = "p";
                    break;
                case R.id.btnSymLBracket:
                    key = "[";
                    break;
                case R.id.btnSymRBracket:
                    key = "]";
                    break;
                case R.id.btnA:
                    key = "a";
                    break;
                case R.id.btnS:
                    key = "s";
                    break;
                case R.id.btnD:
                    key = "d";
                    break;
                case R.id.btnF:
                    key = "f";
                    break;
                case R.id.btnG:
                    key = "g";
                    break;
                case R.id.btnH:
                    key = "h";
                    break;
                case R.id.btnJ:
                    key = "j";
                    break;
                case R.id.btnK:
                    key = "k";
                    break;
                case R.id.btnL:
                    key = "l";
                    break;
                case R.id.btnSymSemiCol:
                    key = ";";
                    break;
                case R.id.btnSymApos:
                    key = "'";
                    break;
                case R.id.btnZ:
                    key = "z";
                    break;
                case R.id.btnX:
                    key = "x";
                    break;
                case R.id.btnC:
                    key = "c";
                    break;
                case R.id.btnV:
                    key = "v";
                    break;
                case R.id.btnB:
                    key = "b";
                    break;
                case R.id.btnN:
                    key = "n";
                    break;
                case R.id.btnM:
                    key = "m";
                    break;
                case R.id.btnSymComma:
                    key = ",";
                    break;
                case R.id.btnSymPeriod:
                    key = ".";
                    break;
                case R.id.btnSymFwdSlash:
                    key = "/";
                    break;
                case R.id.btnSpace:
                    key = " ";
                    break;
            }
        cm.sendData(key);
        }

}
