package com.example.nicolay.beton;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends Activity {

    Button etText;
    Button etText2;
    Button etText3;
    Button etText4;
    Button etText5;
    Button etText6;
    Button etText7;
    Button etText8;
    Button etText9;
    Button etText10;
    Button etText11;
    Button etText12;
    Button etText13;
    Button etText14;
    Button etText15;
    Button etText16;
    Button etText17;
    Button etText18;
    Button etText19;
    Button etText20;
    Button etText21;
    Button etText22;

    Button etText23;
    Button etText24;
    Button etText25;
    Button etText26;
    Button etText27;
    Button etText28;
    Button etText29;
    Button etText30;
    Button etText31;
    Button etText32;
    Button etText33;
    Button etText34;
    Button etText35;
    Button etText36;
    Button etText37;
    Button etText38;
    Button etText39;
    Button etText40;
    Button etText41;
    Button etText42;
    Button etText43;
    Button etText44;

    Button etText45;
    Button etText46;
    Button etText47;
    Button etText48;
    Button etText49;
    Button etText50;
    Button etText51;


    Button btnSave, btnLoad;


    SharedPreferences sPref;
    SharedPreferences sPref2;
    SharedPreferences sPref3;

    final String SAVED_TEXT = "saved_text";
    final String SAVED_TEXT2 = "saved_text2";
    final String SAVED_TEXT3 = "saved_text3";
    final String SAVED_TEXT4 = "saved_text4";
    final String SAVED_TEXT5 = "saved_text5";
    final String SAVED_TEXT6 = "saved_text6";
    final String SAVED_TEXT7 = "saved_text7";
    final String SAVED_TEXT8 = "saved_text8";
    final String SAVED_TEXT9 = "saved_text9";
    final String SAVED_TEXT10 = "saved_text10";
    final String SAVED_TEXT11 = "saved_text11";
    final String SAVED_TEXT12 = "saved_text12";
    final String SAVED_TEXT13 = "saved_text13";
    final String SAVED_TEXT14 = "saved_text14";
    final String SAVED_TEXT15 = "saved_text15";
    final String SAVED_TEXT16 = "saved_text16";
    final String SAVED_TEXT17 = "saved_text17";
    final String SAVED_TEXT18 = "saved_text18";
    final String SAVED_TEXT19 = "saved_text19";
    final String SAVED_TEXT20 = "saved_text20";
    final String SAVED_TEXT21 = "saved_text21";
    final String SAVED_TEXT22 = "saved_text22";

    final String SAVED_TEXT23 = "saved_text23";
    final String SAVED_TEXT24 = "saved_text24";
    final String SAVED_TEXT25 = "saved_text25";
    final String SAVED_TEXT26 = "saved_text26";
    final String SAVED_TEXT27 = "saved_text27";
    final String SAVED_TEXT28 = "saved_text28";
    final String SAVED_TEXT29 = "saved_text29";
    final String SAVED_TEXT30 = "saved_text30";
    final String SAVED_TEXT31 = "saved_text31";
    final String SAVED_TEXT32 = "saved_text32";
    final String SAVED_TEXT33 = "saved_text33";
    final String SAVED_TEXT34 = "saved_text34";
    final String SAVED_TEXT35 = "saved_text35";
    final String SAVED_TEXT36 = "saved_text36";
    final String SAVED_TEXT37 = "saved_text37";
    final String SAVED_TEXT38 = "saved_text38";
    final String SAVED_TEXT39 = "saved_text39";
    final String SAVED_TEXT40 = "saved_text40";
    final String SAVED_TEXT41 = "saved_text41";
    final String SAVED_TEXT42 = "saved_text42";
    final String SAVED_TEXT43 = "saved_text43";
    final String SAVED_TEXT44 = "saved_text44";

    final String SAVED_TEXT45 = "saved_text45";
    final String SAVED_TEXT46 = "saved_text46";
    final String SAVED_TEXT47 = "saved_text47";
    final String SAVED_TEXT48 = "saved_text48";
    final String SAVED_TEXT49 = "saved_text49";
    final String SAVED_TEXT50 = "saved_text50";
    final String SAVED_TEXT51 = "saved_text51";



    final Context context2 = this;
    boolean flag = true;
    Context context;
    ScrollView myScroll;

    private TextView wir_1;
    private TextView wir_2;
    private TextView wir_3;
    private TextView wir_4;
    private TextView wir_5;
    private TextView wir_6;

    //region секция private Button btn1 - btn51;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;

    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn16;
    private Button btn17;
    private Button btn18;
    private Button btn19;
    private Button btn20;
    private Button btn21;
    private Button btn22;

    private Button btn23;
    private Button btn24;
    private Button btn25;
    private Button btn26;
    private Button btn27;
    private Button btn28;
    private Button btn29;
    private Button btn30;
    private Button btn31;
    private Button btn32;
    private Button btn33;

    private Button btn34;
    private Button btn35;
    private Button btn36;
    private Button btn37;
    private Button btn38;
    private Button btn39;

    private Button btn40;
    private Button btn41;
    private Button btn42;
    private Button btn43;
    private Button btn44;
    private Button btn45;

    private Button btn46;
    private Button btn47;
    private Button btn48;
    private Button btn49;
    private Button btn50;
    private Button btn51;
    //endregion

    //region секция private Button aetText1 - aetText51;
    private Button aetText1;
    private Button aetText2;
    private Button aetText3;
    private Button aetText4;
    private Button aetText5;
    private Button aetText6;
    private Button aetText7;
    private Button aetText8;
    private Button aetText9;
    private Button aetText10;
    private Button aetText11;

    private Button aetText12;
    private Button aetText13;
    private Button aetText14;
    private Button aetText15;
    private Button aetText16;
    private Button aetText17;
    private Button aetText18;
    private Button aetText19;
    private Button aetText20;
    private Button aetText21;
    private Button aetText22;

    private Button aetText23;
    private Button aetText24;
    private Button aetText25;
    private Button aetText26;
    private Button aetText27;
    private Button aetText28;
    private Button aetText29;
    private Button aetText30;
    private Button aetText31;
    private Button aetText32;
    private Button aetText33;

    private Button aetText34;
    private Button aetText35;
    private Button aetText36;
    private Button aetText37;
    private Button aetText38;
    private Button aetText39;

    private Button aetText40;
    private Button aetText41;
    private Button aetText42;
    private Button aetText43;
    private Button aetText44;
    private Button aetText45;

    private Button aetText46;
    private Button aetText47;
    private Button aetText48;
    private Button aetText49;
    private Button aetText50;
    private Button aetText51;
//endregion


    //region секция Button button101 - button101;
    Button button101;
    Button button102;
    Button button103;
    Button button104;
    Button button105;
    Button button106;
    Button button107;
    Button button108;
    Button button109;
    Button button110;
    Button button111;

    Button button112;
    Button button113;
    Button button114;
    Button button115;
    Button button116;
    Button button117;
    Button button118;
    Button button119;
    Button button120;
    Button button121;
    Button button122;

    Button button123;
    Button button124;
    Button button125;
    Button button126;
    Button button127;
    Button button128;
    Button button129;
    Button button130;
    Button button131;
    Button button132;
    Button button133;

    Button button134;
    Button button135;
    Button button136;
    Button button137;
    Button button138;
    Button button139;

    Button button140;
    Button button141;
    Button button142;
    Button button143;
    Button button144;
    Button button145;

    Button button146;
    Button button147;
    Button button148;
    Button button149;
    Button button150;
    Button button151;
    //endregion

    //region секция private TextView final_text - final_text51;
    private TextView final_text;
    private TextView final_text2;
    private TextView final_text3;
    private TextView final_text4;
    private TextView final_text5;
    private TextView final_text6;
    private TextView final_text7;
    private TextView final_text8;
    private TextView final_text9;
    private TextView final_text10;
    private TextView final_text11;

    private TextView final_text12;
    private TextView final_text13;
    private TextView final_text14;
    private TextView final_text15;
    private TextView final_text16;
    private TextView final_text17;
    private TextView final_text18;
    private TextView final_text19;
    private TextView final_text20;
    private TextView final_text21;
    private TextView final_text22;

    private TextView final_text23;
    private TextView final_text24;
    private TextView final_text25;
    private TextView final_text26;
    private TextView final_text27;
    private TextView final_text28;
    private TextView final_text29;
    private TextView final_text30;
    private TextView final_text31;
    private TextView final_text32;
    private TextView final_text33;

    private TextView final_text34;
    private TextView final_text35;
    private TextView final_text36;
    private TextView final_text37;
    private TextView final_text38;
    private TextView final_text39;

    private TextView final_text40;
    private TextView final_text41;
    private TextView final_text42;
    private TextView final_text43;
    private TextView final_text44;
    private TextView final_text45;

    private TextView final_text46;
    private TextView final_text47;
    private TextView final_text48;
    private TextView final_text49;
    private TextView final_text50;
    private TextView final_text51;
    //endregion

    /**
     * Called when the activity is first created.
     */


    final String MY_SETTINGS = "saved_text921";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        SharedPreferences sp = getSharedPreferences(MY_SETTINGS,
                Context.MODE_PRIVATE);
        // проверяем, первый ли раз открывается программа
        boolean hasVisited = sp.getBoolean("hasVisited", false);

        if (!hasVisited) {

            LayoutInflater li = LayoutInflater.from(context2);
            View promptsView = li.inflate(R.layout.prompt2, null);
            AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
            mDialogBuilder.setView(promptsView);


            final TextView bill1 = (TextView) findViewById(R.id.button10);
            final TextView bill2 = (TextView) findViewById(R.id.button2);
            final TextView bill3 = (TextView) findViewById(R.id.button);
            final TextView bill4 = (TextView) findViewById(R.id.button3);
            final TextView bill5 = (TextView) findViewById(R.id.button5);
            final TextView bill6 = (TextView) findViewById(R.id.button6);
            final TextView bill7 = (TextView) findViewById(R.id.button7);
            final TextView bill8 = (TextView) findViewById(R.id.button38);
            final TextView bill9 = (TextView) findViewById(R.id.button40);
            final TextView bill10 = (TextView) findViewById(R.id.button39);
            final TextView bill11 = (TextView) findViewById(R.id.button8);

            final TextView bill12 = (TextView) findViewById(R.id.button88);
            final TextView bill13 = (TextView) findViewById(R.id.button89);
            final TextView bill14 = (TextView) findViewById(R.id.button90);
            final TextView bill15 = (TextView) findViewById(R.id.button91);
            final TextView bill16 = (TextView) findViewById(R.id.button92);
            final TextView bill17 = (TextView) findViewById(R.id.button93);
            final TextView bill18 = (TextView) findViewById(R.id.button94);
            final TextView bill19 = (TextView) findViewById(R.id.button95);
            final TextView bill20 = (TextView) findViewById(R.id.button96);
            final TextView bill21 = (TextView) findViewById(R.id.button4);
            final TextView bill22 = (TextView) findViewById(R.id.button9);

            final TextView bill23 = (TextView) findViewById(R.id.button97);
            final TextView bill24 = (TextView) findViewById(R.id.button98);
            final TextView bill25 = (TextView) findViewById(R.id.button99);
            final TextView bill26 = (TextView) findViewById(R.id.button100);
            final TextView bill27 = (TextView) findViewById(R.id.button101);
            final TextView bill28 = (TextView) findViewById(R.id.button102);
            final TextView bill29 = (TextView) findViewById(R.id.button103);
            final TextView bill30 = (TextView) findViewById(R.id.button104);
            final TextView bill31 = (TextView) findViewById(R.id.button105);
            final TextView bill32 = (TextView) findViewById(R.id.button11);
            final TextView bill33 = (TextView) findViewById(R.id.button12);

            final TextView bill34 = (TextView) findViewById(R.id.button52);
            final TextView bill35 = (TextView) findViewById(R.id.button53);
            final TextView bill36 = (TextView) findViewById(R.id.button54);
            final TextView bill37 = (TextView) findViewById(R.id.button55);
            final TextView bill38 = (TextView) findViewById(R.id.button59);
            final TextView bill39 = (TextView) findViewById(R.id.button60);

            final TextView bill40 = (TextView) findViewById(R.id.button61);
            final TextView bill41 = (TextView) findViewById(R.id.button62);
            final TextView bill42 = (TextView) findViewById(R.id.button63);
            final TextView bill43 = (TextView) findViewById(R.id.button64);
            final TextView bill44 = (TextView) findViewById(R.id.button65);
            final TextView bill45 = (TextView) findViewById(R.id.button66);

            final TextView bill46 = (TextView) findViewById(R.id.button70);
            final TextView bill47 = (TextView) findViewById(R.id.button71);
            final TextView bill48 = (TextView) findViewById(R.id.button72);
            final TextView bill49 = (TextView) findViewById(R.id.button73);
            final TextView bill50 = (TextView) findViewById(R.id.button74);
            final TextView bill51 = (TextView) findViewById(R.id.button75);



            mDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {


                                    bill1.setText(0 + "");
                                    bill2.setText(4 + "");
                                    bill3.setText(5 + "");
                                    bill4.setText(6 + "");
                                    bill5.setText(7 + "");
                                    bill6.setText(8 + "");
                                    bill7.setText(9 + "");
                                    bill8.setText(10 + "");
                                    bill9.setText(11 + "");
                                    bill10.setText(12 + "");
                                    bill11.setText(13 + "");

                                    bill12.setText(0 + "");
                                    bill13.setText(0.5 + "");
                                    bill14.setText(1 + "");
                                    bill15.setText(1.5 + "");
                                    bill16.setText(2 + "");
                                    bill17.setText(2.5 + "");
                                    bill18.setText(3 + "");
                                    bill19.setText(3.5 + "");
                                    bill20.setText(4 + "");
                                    bill21.setText(5 + "");
                                    bill22.setText(6 + "");
                                //////////
                                    bill23.setText(0 + "");
                                    bill24.setText(4 + "");
                                    bill25.setText(5 + "");
                                    bill26.setText(6 + "");
                                    bill27.setText(7 + "");
                                    bill28.setText(8 + "");
                                    bill29.setText(9 + "");
                                    bill30.setText(10 + "");
                                    bill31.setText(11 + "");
                                    bill32.setText(12 + "");
                                    bill33.setText(13 + "");

                                    bill34.setText(0 + "");
                                    bill35.setText(25 + "");
                                    bill36.setText(40 + "");
                                    bill37.setText(50 + "");
                                    bill38.setText(75 + "");
                                    bill39.setText(100 + "");

                                    bill40.setText(0 + "");
                                    bill41.setText(60 + "");
                                    bill42.setText(70 + "");
                                    bill43.setText(80 + "");
                                    bill44.setText(90 + "");
                                    bill45.setText(100 + "");

                                    bill46.setText(0 + "");
                                    bill47.setText(400 + "");
                                    bill48.setText(500 + "");
                                    bill49.setText(550 + "");
                                    bill50.setText(600 + "");
                                    bill51.setText(700 + "");



                                }
                            });
            AlertDialog alertDialog = mDialogBuilder.create();
            alertDialog.show();


            long mills = 70L;
            Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(mills);

            // выводим нужную активность
            // напр.
            //Intent intent = new Intent(this, Main2Activity.class);
            // startActivity(intent);

            SharedPreferences.Editor e = sp.edit();
            e.putBoolean("hasVisited", true);
            e.commit(); // не забудьте подтвердить изменения
        }


        etText = (Button) findViewById(R.id.button10);
        etText2 = (Button) findViewById(R.id.button2);
        etText3 = (Button) findViewById(R.id.button);
        etText4 = (Button) findViewById(R.id.button3);
        etText5 = (Button) findViewById(R.id.button5);
        etText6 = (Button) findViewById(R.id.button6);
        etText7 = (Button) findViewById(R.id.button7);
        etText8 = (Button) findViewById(R.id.button38);
        etText9 = (Button) findViewById(R.id.button40);
        etText10 = (Button) findViewById(R.id.button39);
        etText11 = (Button) findViewById(R.id.button8);

        etText12 = (Button) findViewById(R.id.button88);
        etText13 = (Button) findViewById(R.id.button89);
        etText14 = (Button) findViewById(R.id.button90);
        etText15 = (Button) findViewById(R.id.button91);
        etText16 = (Button) findViewById(R.id.button92);
        etText17 = (Button) findViewById(R.id.button93);
        etText18 = (Button) findViewById(R.id.button94);
        etText19 = (Button) findViewById(R.id.button95);
        etText20 = (Button) findViewById(R.id.button96);
        etText21 = (Button) findViewById(R.id.button4);
        etText22 = (Button) findViewById(R.id.button9);

        etText23 = (Button) findViewById(R.id.button97);
        etText24 = (Button) findViewById(R.id.button98);
        etText25 = (Button) findViewById(R.id.button99);
        etText26 = (Button) findViewById(R.id.button100);
        etText27 = (Button) findViewById(R.id.button101);
        etText28 = (Button) findViewById(R.id.button102);
        etText29 = (Button) findViewById(R.id.button103);
        etText30 = (Button) findViewById(R.id.button104);
        etText31 = (Button) findViewById(R.id.button105);
        etText32 = (Button) findViewById(R.id.button11);
        etText33 = (Button) findViewById(R.id.button12);

        etText34 = (Button) findViewById(R.id.button52);
        etText35 = (Button) findViewById(R.id.button53);
        etText36 = (Button) findViewById(R.id.button54);
        etText37 = (Button) findViewById(R.id.button55);
        etText38 = (Button) findViewById(R.id.button59);
        etText39 = (Button) findViewById(R.id.button60);

        etText40 = (Button) findViewById(R.id.button61);
        etText41 = (Button) findViewById(R.id.button62);
        etText42 = (Button) findViewById(R.id.button63);
        etText43 = (Button) findViewById(R.id.button64);
        etText44 = (Button) findViewById(R.id.button65);
        etText45 = (Button) findViewById(R.id.button66);

        etText46 = (Button) findViewById(R.id.button70);
        etText47 = (Button) findViewById(R.id.button71);
        etText48 = (Button) findViewById(R.id.button72);
        etText49 = (Button) findViewById(R.id.button73);
        etText50 = (Button) findViewById(R.id.button74);
        etText51 = (Button) findViewById(R.id.button75);



        loadText();
        loadText2();
        loadText3();
        loadText4();
        loadText5();
        loadText6();
        loadText7();
        loadText8();
        loadText9();
        loadText10();
        loadText11();
        loadText12();
        loadText13();
        loadText14();
        loadText15();
        loadText16();
        loadText17();
        loadText18();
        loadText19();
        loadText20();
        loadText21();
        loadText22();

        loadText23();
        loadText24();
        loadText25();
        loadText26();
        loadText27();
        loadText28();
        loadText29();
        loadText30();
        loadText31();
        loadText32();
        loadText33();
        loadText34();
        loadText35();
        loadText36();
        loadText37();
        loadText38();
        loadText39();
        loadText40();
        loadText41();
        loadText42();
        loadText43();
        loadText44();

        loadText45();
        loadText46();
        loadText47();
        loadText48();
        loadText49();
        loadText50();
        loadText51();


        //Ряды кнопок (по Алерт Диалогу)

        //region секция 1 (button101 = (Button) findViewById(R.id.button10);)
        button101 = (Button) findViewById(R.id.button10);
        final_text = (TextView) findViewById(R.id.button10);
        button101.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir);
                                                                             Button kpp42 = (Button) findViewById(R.id.button10);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button102 = (Button) findViewById(R.id.button2);
        final_text2 = (TextView) findViewById(R.id.button2);
        button102.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir);
                                                                             Button kpp42 = (Button) findViewById(R.id.button2);

                                                                             kpp41.setText("6.00");
                                                                             kpp42.setText("6.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text2.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button103 = (Button) findViewById(R.id.button);
        final_text3 = (TextView) findViewById(R.id.button);
        button103.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir);
                                                                             Button kpp42 = (Button) findViewById(R.id.button);

                                                                             kpp41.setText("7.00");
                                                                             kpp42.setText("7.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text3.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button104 = (Button) findViewById(R.id.button3);
        final_text4 = (TextView) findViewById(R.id.button3);
        button104.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir);
                                                                             Button kpp42 = (Button) findViewById(R.id.button3);

                                                                             kpp41.setText("8.00");
                                                                             kpp42.setText("8.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text4.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button105 = (Button) findViewById(R.id.button5);
        final_text5 = (TextView) findViewById(R.id.button5);
        button105.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir);
                                                                             Button kpp42 = (Button) findViewById(R.id.button5);

                                                                             kpp41.setText("9.00");
                                                                             kpp42.setText("9.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text5.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button106 = (Button) findViewById(R.id.button6);
        final_text6 = (TextView) findViewById(R.id.button6);
        button106.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir);
                                                                             Button kpp42 = (Button) findViewById(R.id.button6);

                                                                             kpp41.setText("10.00");
                                                                             kpp42.setText("10.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text6.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button107 = (Button) findViewById(R.id.button7);
        final_text7 = (TextView) findViewById(R.id.button7);
        button107.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir);
                                                                             Button kpp42 = (Button) findViewById(R.id.button7);

                                                                             kpp41.setText("11.00");
                                                                             kpp42.setText("11.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text7.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button108 = (Button) findViewById(R.id.button38);
        final_text8 = (TextView) findViewById(R.id.button38);
        button108.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir);
                                                                             Button kpp42 = (Button) findViewById(R.id.button38);

                                                                             kpp41.setText("12.00");
                                                                             kpp42.setText("12.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text8.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button109 = (Button) findViewById(R.id.button40);
        final_text9 = (TextView) findViewById(R.id.button40);
        button109.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir);
                                                                             Button kpp42 = (Button) findViewById(R.id.button40);

                                                                             kpp41.setText("13.00");
                                                                             kpp42.setText("13.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text9.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button110 = (Button) findViewById(R.id.button39);
        final_text10 = (TextView) findViewById(R.id.button39);
        button110.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir);
                                                                             Button kpp42 = (Button) findViewById(R.id.button39);

                                                                             kpp41.setText("14.00");
                                                                             kpp42.setText("14.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text10.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );
        button111 = (Button) findViewById(R.id.button8);
        final_text11 = (TextView) findViewById(R.id.button8);
        button111.setOnLongClickListener(new View.OnLongClickListener() {

                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir);
                                                                             Button kpp42 = (Button) findViewById(R.id.button8);

                                                                             kpp41.setText("15.00");
                                                                             kpp42.setText("15.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text11.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        //region секция 2
        button112 = (Button) findViewById(R.id.button88);
        final_text12 = (TextView) findViewById(R.id.button88);
        button112.setOnLongClickListener(new View.OnLongClickListener() {
            //region button112
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir2);


                                                                             Button kpp42 = (Button) findViewById(R.id.button88);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text12.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button113 = (Button) findViewById(R.id.button89);
        final_text13 = (TextView) findViewById(R.id.button89);
        button113.setOnLongClickListener(new View.OnLongClickListener() {
            //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir2);


                                                                             Button kpp42 = (Button) findViewById(R.id.button89);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text13.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button114 = (Button) findViewById(R.id.button90);
        final_text14 = (TextView) findViewById(R.id.button90);
        button114.setOnLongClickListener(new View.OnLongClickListener() {
            //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir2);


                                                                             Button kpp42 = (Button) findViewById(R.id.button90);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text14.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button115 = (Button) findViewById(R.id.button91);
        final_text15 = (TextView) findViewById(R.id.button91);
        button115.setOnLongClickListener(new View.OnLongClickListener() {
            //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir2);


                                                                             Button kpp42 = (Button) findViewById(R.id.button91);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text15.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button116 = (Button) findViewById(R.id.button92);
        final_text16 = (TextView) findViewById(R.id.button92);
        button116.setOnLongClickListener(new View.OnLongClickListener() {
            //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir2);


                                                                             Button kpp42 = (Button) findViewById(R.id.button92);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text16.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button117 = (Button) findViewById(R.id.button93);
        final_text17 = (TextView) findViewById(R.id.button93);
        button117.setOnLongClickListener(new View.OnLongClickListener() {
            //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir2);


                                                                             Button kpp42 = (Button) findViewById(R.id.button93);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text17.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button118 = (Button) findViewById(R.id.button94);
        final_text18 = (TextView) findViewById(R.id.button94);
        button118.setOnLongClickListener(new View.OnLongClickListener() {
            //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir2);


                                                                             Button kpp42 = (Button) findViewById(R.id.button94);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text18.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button119 = (Button) findViewById(R.id.button95);
        final_text19 = (TextView) findViewById(R.id.button95);
        button119.setOnLongClickListener(new View.OnLongClickListener() {
            //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir2);


                                                                             Button kpp42 = (Button) findViewById(R.id.button95);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text19.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button120 = (Button) findViewById(R.id.button96);
        final_text20 = (TextView) findViewById(R.id.button96);
        button120.setOnLongClickListener(new View.OnLongClickListener() {
            //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir2);


                                                                             Button kpp42 = (Button) findViewById(R.id.button96);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text20.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button121 = (Button) findViewById(R.id.button4);
        final_text21 = (TextView) findViewById(R.id.button4);
        button121.setOnLongClickListener(new View.OnLongClickListener() {
            //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir2);


                                                                             Button kpp42 = (Button) findViewById(R.id.button4);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text21.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button122 = (Button) findViewById(R.id.button9);
        final_text22 = (TextView) findViewById(R.id.button9);
        button122.setOnLongClickListener(new View.OnLongClickListener() {
            //region button113
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir2);


                                                                             Button kpp42 = (Button) findViewById(R.id.button9);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text22.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion




//endregion

        //region секция 3
        button123 = (Button) findViewById(R.id.button97);
        final_text23 = (TextView) findViewById(R.id.button97);
        button123.setOnLongClickListener(new View.OnLongClickListener() {
            //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir3);


                                                                             Button kpp42 = (Button) findViewById(R.id.button97);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text23.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button124 = (Button) findViewById(R.id.button98);
        final_text24 = (TextView) findViewById(R.id.button98);
        button124.setOnLongClickListener(new View.OnLongClickListener() {
            //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir3);


                                                                             Button kpp42 = (Button) findViewById(R.id.button98);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text24.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button125 = (Button) findViewById(R.id.button99);
        final_text25 = (TextView) findViewById(R.id.button99);
        button125.setOnLongClickListener(new View.OnLongClickListener() {
            //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir3);


                                                                             Button kpp42 = (Button) findViewById(R.id.button99);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text25.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button126 = (Button) findViewById(R.id.button100);
        final_text26 = (TextView) findViewById(R.id.button100);
        button126.setOnLongClickListener(new View.OnLongClickListener() {
            //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir3);


                                                                             Button kpp42 = (Button) findViewById(R.id.button100);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text26.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button127 = (Button) findViewById(R.id.button101);
        final_text27 = (TextView) findViewById(R.id.button101);
        button127.setOnLongClickListener(new View.OnLongClickListener() {
            //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir3);


                                                                             Button kpp42 = (Button) findViewById(R.id.button101);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text27.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button128 = (Button) findViewById(R.id.button102);
        final_text28 = (TextView) findViewById(R.id.button102);
        button128.setOnLongClickListener(new View.OnLongClickListener() {
            //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir3);


                                                                             Button kpp42 = (Button) findViewById(R.id.button102);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text28.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button129 = (Button) findViewById(R.id.button103);
        final_text29 = (TextView) findViewById(R.id.button103);
        button129.setOnLongClickListener(new View.OnLongClickListener() {
            //region button129
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir3);


                                                                             Button kpp42 = (Button) findViewById(R.id.button103);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text29.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button130 = (Button) findViewById(R.id.button104);
        final_text30 = (TextView) findViewById(R.id.button104);
        button130.setOnLongClickListener(new View.OnLongClickListener() {
            //region button130
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir3);


                                                                             Button kpp42 = (Button) findViewById(R.id.button104);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text30.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button131 = (Button) findViewById(R.id.button105);
        final_text31 = (TextView) findViewById(R.id.button105);
        button131.setOnLongClickListener(new View.OnLongClickListener() {
            //region button131
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir3);


                                                                             Button kpp42 = (Button) findViewById(R.id.button105);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text31.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button132 = (Button) findViewById(R.id.button11);
        final_text32 = (TextView) findViewById(R.id.button11);
        button132.setOnLongClickListener(new View.OnLongClickListener() {
            //region button132
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir3);


                                                                             Button kpp42 = (Button) findViewById(R.id.button11);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text32.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button133 = (Button) findViewById(R.id.button12);
        final_text33 = (TextView) findViewById(R.id.button12);
        button133.setOnLongClickListener(new View.OnLongClickListener() {
            //region button133
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir3);


                                                                             Button kpp42 = (Button) findViewById(R.id.button12);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text33.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion




//endregion


        //region секция 4
        button123 = (Button) findViewById(R.id.button52);
        final_text34 = (TextView) findViewById(R.id.button52);
        button123.setOnLongClickListener(new View.OnLongClickListener() {
            //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir4);


                                                                             Button kpp42 = (Button) findViewById(R.id.button52);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text34.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button124 = (Button) findViewById(R.id.button53);
        final_text35 = (TextView) findViewById(R.id.button53);
        button124.setOnLongClickListener(new View.OnLongClickListener() {
            //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir4);


                                                                             Button kpp42 = (Button) findViewById(R.id.button53);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text35.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button125 = (Button) findViewById(R.id.button54);
        final_text36 = (TextView) findViewById(R.id.button54);
        button125.setOnLongClickListener(new View.OnLongClickListener() {
            //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir4);


                                                                             Button kpp42 = (Button) findViewById(R.id.button54);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text36.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button126 = (Button) findViewById(R.id.button55);
        final_text37 = (TextView) findViewById(R.id.button55);
        button126.setOnLongClickListener(new View.OnLongClickListener() {
            //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir4);


                                                                             Button kpp42 = (Button) findViewById(R.id.button55);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text37.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button127 = (Button) findViewById(R.id.button59);
        final_text38 = (TextView) findViewById(R.id.button59);
        button127.setOnLongClickListener(new View.OnLongClickListener() {
            //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir4);


                                                                             Button kpp42 = (Button) findViewById(R.id.button59);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text38.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button128 = (Button) findViewById(R.id.button60);
        final_text39 = (TextView) findViewById(R.id.button60);
        button128.setOnLongClickListener(new View.OnLongClickListener() {
            //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir4);


                                                                             Button kpp42 = (Button) findViewById(R.id.button102);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text39.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion

        //region секция 5
        button129 = (Button) findViewById(R.id.button61);
        final_text40 = (TextView) findViewById(R.id.button61);
        button129.setOnLongClickListener(new View.OnLongClickListener() {
            //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir5);


                                                                             Button kpp42 = (Button) findViewById(R.id.button61);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text40.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button130 = (Button) findViewById(R.id.button62);
        final_text41 = (TextView) findViewById(R.id.button62);
        button130.setOnLongClickListener(new View.OnLongClickListener() {
            //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir5);


                                                                             Button kpp42 = (Button) findViewById(R.id.button62);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text41.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button131 = (Button) findViewById(R.id.button63);
        final_text42 = (TextView) findViewById(R.id.button63);
        button131.setOnLongClickListener(new View.OnLongClickListener() {
            //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir5);


                                                                             Button kpp42 = (Button) findViewById(R.id.button63);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text42.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button132 = (Button) findViewById(R.id.button64);
        final_text43 = (TextView) findViewById(R.id.button64);
        button132.setOnLongClickListener(new View.OnLongClickListener() {
            //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir5);


                                                                             Button kpp42 = (Button) findViewById(R.id.button64);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text43.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button133 = (Button) findViewById(R.id.button65);
        final_text44 = (TextView) findViewById(R.id.button65);
        button133.setOnLongClickListener(new View.OnLongClickListener() {
            //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir5);


                                                                             Button kpp42 = (Button) findViewById(R.id.button65);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text44.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button134 = (Button) findViewById(R.id.button66);
        final_text45 = (TextView) findViewById(R.id.button66);
        button134.setOnLongClickListener(new View.OnLongClickListener() {
            //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir5);


                                                                             Button kpp42 = (Button) findViewById(R.id.button66);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text45.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion

        //region секция 6
        button135 = (Button) findViewById(R.id.button70);
        final_text46 = (TextView) findViewById(R.id.button70);
        button135.setOnLongClickListener(new View.OnLongClickListener() {
            //region button123
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir6);


                                                                             Button kpp42 = (Button) findViewById(R.id.button70);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text46.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button136 = (Button) findViewById(R.id.button71);
        final_text47 = (TextView) findViewById(R.id.button71);
        button136.setOnLongClickListener(new View.OnLongClickListener() {
            //region button124
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir6);


                                                                             Button kpp42 = (Button) findViewById(R.id.button71);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text41.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button131 = (Button) findViewById(R.id.button72);
        final_text48 = (TextView) findViewById(R.id.button72);
        button131.setOnLongClickListener(new View.OnLongClickListener() {
            //region button114
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir5);


                                                                             Button kpp42 = (Button) findViewById(R.id.button72);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text48.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button132 = (Button) findViewById(R.id.button73);
        final_text49 = (TextView) findViewById(R.id.button73);
        button132.setOnLongClickListener(new View.OnLongClickListener() {
            //region button126
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir6);


                                                                             Button kpp42 = (Button) findViewById(R.id.button73);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text49.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button133 = (Button) findViewById(R.id.button74);
        final_text50 = (TextView) findViewById(R.id.button74);
        button133.setOnLongClickListener(new View.OnLongClickListener() {
            //region button127
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir6);


                                                                             Button kpp42 = (Button) findViewById(R.id.button74);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text50.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion

        button134 = (Button) findViewById(R.id.button75);
        final_text51 = (TextView) findViewById(R.id.button75);
        button134.setOnLongClickListener(new View.OnLongClickListener() {
            //region button128
                                             @Override
                                             public boolean onLongClick(View arg0) {
                                                 LayoutInflater li = LayoutInflater.from(context2);
                                                 final View promptsView = li.inflate(R.layout.prompt, null);
                                                 AlertDialog.Builder mDialogBuilder = new AlertDialog.Builder(context2);
                                                 mDialogBuilder.setView(promptsView);

                                                 final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);

                                                 mDialogBuilder
                                                         .setCancelable(false)
                                                         .setPositiveButton("OK",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {

                                                                         //final EditText etNum55 = (EditText) findViewById(R.id.editText2);
                                                                         final EditText userInput = (EditText) promptsView.findViewById(R.id.editText2);
                                                                         if (userInput.getText().length() == 0)
                                                                         {
                                                                             TextView kpp41 = (TextView) findViewById(R.id.textViewWir6);


                                                                             Button kpp42 = (Button) findViewById(R.id.button75);

                                                                             kpp41.setText("5.00");
                                                                             kpp42.setText("5.00");

                                                                             Toast toast = Toast.makeText(getApplicationContext(),
                                                                                     "Reset!",
                                                                                     Toast.LENGTH_SHORT);
                                                                             toast.setGravity(Gravity.CENTER, 0, 0);
                                                                             toast.show();
                                                                         }else
                                                                         {
                                                                             final_text51.setText(userInput.getText());
                                                                         }}
                                                                 })
                                                         .setNegativeButton("Отмена",
                                                                 new DialogInterface.OnClickListener() {
                                                                     public void onClick(DialogInterface dialog, int id) {
                                                                         dialog.cancel();
                                                                     }
                                                                 });
                                                 AlertDialog alertDialog = mDialogBuilder.create();
                                                 alertDialog.show();
                                                 return false;
                                             }
                                         }
        );

        //endregion


        //endregion




//endregion


       // &&&&&&&

//region секция - для копирования
        //endregion - для копирования

        //region секция btn1-btn11
        btn1 = (Button) findViewById(R.id.button10);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button);
        btn4 = (Button) findViewById(R.id.button3);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button38);
        btn9 = (Button) findViewById(R.id.button40);
        btn10 = (Button) findViewById(R.id.button39);
        btn11 = (Button) findViewById(R.id.button8);
        //endregion

        //region секция btn12-btn22
        btn12 = (Button) findViewById(R.id.button88);
        btn13 = (Button) findViewById(R.id.button89);
        btn14 = (Button) findViewById(R.id.button90);
        btn15 = (Button) findViewById(R.id.button91);
        btn16 = (Button) findViewById(R.id.button92);
        btn17 = (Button) findViewById(R.id.button93);
        btn18 = (Button) findViewById(R.id.button94);
        btn19 = (Button) findViewById(R.id.button95);
        btn20 = (Button) findViewById(R.id.button96);
        btn21 = (Button) findViewById(R.id.button4);
        btn22 = (Button) findViewById(R.id.button9);
        //endregion

        //region секция btn23-btn33
        btn23 = (Button) findViewById(R.id.button97);
        btn24 = (Button) findViewById(R.id.button98);
        btn25 = (Button) findViewById(R.id.button99);
        btn26 = (Button) findViewById(R.id.button100);
        btn27 = (Button) findViewById(R.id.button101);
        btn28 = (Button) findViewById(R.id.button102);
        btn29 = (Button) findViewById(R.id.button103);
        btn30 = (Button) findViewById(R.id.button104);
        btn31 = (Button) findViewById(R.id.button105);
        btn32 = (Button) findViewById(R.id.button11);
        btn33 = (Button) findViewById(R.id.button12);
        //endregion

        //region секция btn34-btn51
        btn34 = (Button) findViewById(R.id.button52);
        btn35 = (Button) findViewById(R.id.button53);
        btn36 = (Button) findViewById(R.id.button54);
        btn37 = (Button) findViewById(R.id.button55);
        btn38 = (Button) findViewById(R.id.button59);
        btn39 = (Button) findViewById(R.id.button60);

        btn40 = (Button) findViewById(R.id.button61);
        btn41 = (Button) findViewById(R.id.button62);
        btn42 = (Button) findViewById(R.id.button63);
        btn43 = (Button) findViewById(R.id.button64);
        btn44 = (Button) findViewById(R.id.button65);
        btn45 = (Button) findViewById(R.id.button66);

        btn46 = (Button) findViewById(R.id.button70);
        btn47 = (Button) findViewById(R.id.button71);
        btn48 = (Button) findViewById(R.id.button72);
        btn49 = (Button) findViewById(R.id.button73);
        btn50 = (Button) findViewById(R.id.button74);
        btn51 = (Button) findViewById(R.id.button75);
        //endregion


        //region секция wir_1-wir_6
        wir_1 = (TextView) findViewById(R.id.textViewWir);
        wir_2 = (TextView) findViewById(R.id.textViewWir2);
        wir_3 = (TextView) findViewById(R.id.textViewWir3);
        wir_4 = (TextView) findViewById(R.id.textViewWir4);
        wir_5 = (TextView) findViewById(R.id.textViewWir5);
        wir_6 = (TextView) findViewById(R.id.textViewWir6);
        //endregion


        View.OnClickListener btnClk = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {


                    //region секция 1.1 (case R.id.button10:)
                    case R.id.button10:
                        TextView textView001 = (TextView) findViewById(R.id.textViewWir);
                        aetText1 = (Button) findViewById(R.id.button10);
                        float num001 = Float.parseFloat(aetText1.getText().toString());
                        float w = (float) num001;
                        textView001.setText(String.format(Locale.US, "%.2f", w) + "");
                        //Animation anim1 = AnimationUtils.loadAnimation(
                      //          getApplicationContext(), R.anim.sms_anim);
                      //  final Button button1 = (Button) findViewById(R.id.button10);
                     //   button1.startAnimation(anim1);
                        break;

                    case R.id.button2:
                        TextView textView002 = (TextView) findViewById(R.id.textViewWir);
                        aetText2 = (Button) findViewById(R.id.button2);
                        float num002 = Float.parseFloat(aetText2.getText().toString());
                        float w2 = (float) num002;
                        textView002.setText(String.format(Locale.US, "%.2f", w2) + "");
                       // Animation anim2 = AnimationUtils.loadAnimation(
                       //         getApplicationContext(), R.anim.sms_anim);
                      //  final Button button2 = (Button) findViewById(R.id.button2);
                      //  button2.startAnimation(anim2);
                        break;

                    case R.id.button:
                        TextView textView003 = (TextView) findViewById(R.id.textViewWir);
                        aetText3 = (Button) findViewById(R.id.button);
                        float num003 = Float.parseFloat(aetText3.getText().toString());
                        float w3 = (float) num003;
                        textView003.setText(String.format(Locale.US, "%.2f", w3) + "");
                       // Animation anim3 = AnimationUtils.loadAnimation(
                      //          getApplicationContext(), R.anim.sms_anim);
                      //  final Button button3 = (Button) findViewById(R.id.button);
                     //   button3.startAnimation(anim3);
                        break;


                    case R.id.button3:
                        TextView textView004 = (TextView) findViewById(R.id.textViewWir);
                        aetText4 = (Button) findViewById(R.id.button3);
                        float num004 = Float.parseFloat(aetText4.getText().toString());
                        float w4 = (float) num004;
                        textView004.setText(String.format(Locale.US, "%.2f", w4) + "");
                      //  Animation anim4 = AnimationUtils.loadAnimation(
                     //           getApplicationContext(), R.anim.sms_anim);
                     //   final Button button4 = (Button) findViewById(R.id.button3);
                     //   button4.startAnimation(anim4);
                        break;


                    case R.id.button5:
                        TextView textView005 = (TextView) findViewById(R.id.textViewWir);
                        aetText5 = (Button) findViewById(R.id.button5);
                        float num005 = Float.parseFloat(aetText5.getText().toString());
                        float w5 = (float) num005;
                        textView005.setText(String.format(Locale.US, "%.2f", w5) + "");
                       // Animation anim5 = AnimationUtils.loadAnimation(
                      //          getApplicationContext(), R.anim.sms_anim);
                      //  final Button button5 = (Button) findViewById(R.id.button5);
                     //   button5.startAnimation(anim5);
                        break;


                    case R.id.button6:
                        TextView textView006 = (TextView) findViewById(R.id.textViewWir);
                        aetText6 = (Button) findViewById(R.id.button6);
                        float num006 = Float.parseFloat(aetText6.getText().toString());
                        float w6 = (float) num006;
                        textView006.setText(String.format(Locale.US, "%.2f", w6) + "");
                       // Animation anim6 = AnimationUtils.loadAnimation(
                       //         getApplicationContext(), R.anim.sms_anim);
                      //  final Button button6 = (Button) findViewById(R.id.button6);
                      //  button6.startAnimation(anim6);
                        break;


                    case R.id.button7:
                        TextView textView007 = (TextView) findViewById(R.id.textViewWir);
                        aetText7 = (Button) findViewById(R.id.button7);
                        float num007 = Float.parseFloat(aetText7.getText().toString());
                        float w7 = (float) num007;
                        textView007.setText(String.format(Locale.US, "%.2f", w7) + "");
                        //Animation anim7 = AnimationUtils.loadAnimation(
                       //         getApplicationContext(), R.anim.sms_anim);
                      //  final Button button7 = (Button) findViewById(R.id.button7);
                     //   button7.startAnimation(anim7);
                        break;


                    case R.id.button38:
                        TextView textView008 = (TextView) findViewById(R.id.textViewWir);
                        aetText8 = (Button) findViewById(R.id.button38);
                        float num008 = Float.parseFloat(aetText8.getText().toString());
                        float w8 = (float) num008;
                        textView008.setText(String.format(Locale.US, "%.2f", w8) + "");
                     //   Animation anim8 = AnimationUtils.loadAnimation(
                     //           getApplicationContext(), R.anim.sms_anim);
                     //   final Button button8 = (Button) findViewById(R.id.button38);
                     //   button8.startAnimation(anim8);
                        break;


                    case R.id.button40:
                        TextView textView009 = (TextView) findViewById(R.id.textViewWir);
                        aetText9 = (Button) findViewById(R.id.button40);
                        float num009 = Float.parseFloat(aetText9.getText().toString());
                        float w9 = (float) num009;
                        textView009.setText(String.format(Locale.US, "%.2f", w9) + "");
                       // Animation anim9 = AnimationUtils.loadAnimation(
                       //         getApplicationContext(), R.anim.sms_anim);
                       // final Button button9 = (Button) findViewById(R.id.button40);
                      //  button9.startAnimation(anim9);
                        break;


                    case R.id.button39:
                        TextView textView010 = (TextView) findViewById(R.id.textViewWir);
                        aetText10 = (Button) findViewById(R.id.button39);
                        float num010 = Float.parseFloat(aetText10.getText().toString());
                        float w10 = (float) num010;
                        textView010.setText(String.format(Locale.US, "%.2f", w10) + "");
                      //  Animation anim10 = AnimationUtils.loadAnimation(
                     //           getApplicationContext(), R.anim.sms_anim);
                     //   final Button button10 = (Button) findViewById(R.id.button39);
                     //   button10.startAnimation(anim10);
                        break;

                    case R.id.button8:
                        TextView textView011 = (TextView) findViewById(R.id.textViewWir);
                        aetText11 = (Button) findViewById(R.id.button8);
                        float num011 = Float.parseFloat(aetText11.getText().toString());
                        float w11 = (float) num011;
                        textView011.setText(String.format(Locale.US, "%.2f", w11) + "");
                      //  Animation anim11 = AnimationUtils.loadAnimation(
                     //           getApplicationContext(), R.anim.sms_anim);
                     //   final Button button11 = (Button) findViewById(R.id.button8);
                    //    button11.startAnimation(anim11);
                        break;

                    //endregion

                    //region секция 2.1
                    case R.id.button88:
                        TextView textView012 = (TextView) findViewById(R.id.textViewWir2);
                        aetText12 = (Button) findViewById(R.id.button88);
                        float num012 = Float.parseFloat(aetText12.getText().toString());
                        float w12 = (float) num012;
                        textView012.setText(String.format(Locale.US, "%.2f", w12) + "");
                        break;

                    case R.id.button89:
                        TextView textView013 = (TextView) findViewById(R.id.textViewWir2);
                        aetText13 = (Button) findViewById(R.id.button89);
                        float num013 = Float.parseFloat(aetText13.getText().toString());
                        float w13 = (float) num013;
                        textView013.setText(String.format(Locale.US, "%.2f", w13) + "");
                        break;

                    case R.id.button90:
                        TextView textView014 = (TextView) findViewById(R.id.textViewWir2);
                        aetText14 = (Button) findViewById(R.id.button90);
                        float num014 = Float.parseFloat(aetText14.getText().toString());
                        float w14 = (float) num014;
                        textView014.setText(String.format(Locale.US, "%.2f", w14) + "");
                        break;

                    case R.id.button91:
                        TextView textView015 = (TextView) findViewById(R.id.textViewWir2);
                        aetText15 = (Button) findViewById(R.id.button91);
                        float num015 = Float.parseFloat(aetText15.getText().toString());
                        float w15 = (float) num015;
                        textView015.setText(String.format(Locale.US, "%.2f", w15) + "");
                        break;

                    case R.id.button92:
                        TextView textView016 = (TextView) findViewById(R.id.textViewWir2);
                        aetText16 = (Button) findViewById(R.id.button92);
                        float num016 = Float.parseFloat(aetText16.getText().toString());
                        float w16 = (float) num016;
                        textView016.setText(String.format(Locale.US, "%.2f", w16) + "");
                        break;

                    case R.id.button93:
                        TextView textView017 = (TextView) findViewById(R.id.textViewWir2);
                        aetText17 = (Button) findViewById(R.id.button93);
                        float num017 = Float.parseFloat(aetText17.getText().toString());
                        float w17 = (float) num017;
                        textView017.setText(String.format(Locale.US, "%.2f", w17) + "");
                        break;

                    case R.id.button94:
                        TextView textView018 = (TextView) findViewById(R.id.textViewWir2);
                        aetText18 = (Button) findViewById(R.id.button94);
                        float num018 = Float.parseFloat(aetText18.getText().toString());
                        float w18 = (float) num018;
                        textView018.setText(String.format(Locale.US, "%.2f", w18) + "");
                        break;

                    case R.id.button95:
                        TextView textView019 = (TextView) findViewById(R.id.textViewWir2);
                        aetText19 = (Button) findViewById(R.id.button95);
                        float num019 = Float.parseFloat(aetText19.getText().toString());
                        float w19 = (float) num019;
                        textView019.setText(String.format(Locale.US, "%.2f", w19) + "");
                        break;

                    case R.id.button96:
                        TextView textView020 = (TextView) findViewById(R.id.textViewWir2);
                        aetText20 = (Button) findViewById(R.id.button96);
                        float num020 = Float.parseFloat(aetText20.getText().toString());
                        float w20 = (float) num020;
                        textView020.setText(String.format(Locale.US, "%.2f", w20) + "");
                        break;

                    case R.id.button4:
                        TextView textView021 = (TextView) findViewById(R.id.textViewWir2);
                        aetText21 = (Button) findViewById(R.id.button4);
                        float num021 = Float.parseFloat(aetText21.getText().toString());
                        float w21 = (float) num021;
                        textView021.setText(String.format(Locale.US, "%.2f", w21) + "");
                        break;

                    case R.id.button9:
                        TextView textView022 = (TextView) findViewById(R.id.textViewWir2);
                        aetText22 = (Button) findViewById(R.id.button9);
                        float num022 = Float.parseFloat(aetText22.getText().toString());
                        float w22 = (float) num022;
                        textView022.setText(String.format(Locale.US, "%.2f", w22) + "");
                        break;

                    //endregion

                    //region секция 3.1
                    case R.id.button97:
                        TextView textView023 = (TextView) findViewById(R.id.textViewWir3);
                        aetText23 = (Button) findViewById(R.id.button97);
                        float num023 = Float.parseFloat(aetText23.getText().toString());
                        float w23 = (float) num023;
                        textView023.setText(String.format(Locale.US, "%.2f", w23) + "");
                        break;

                    case R.id.button98:
                        TextView textView024 = (TextView) findViewById(R.id.textViewWir3);
                        aetText24 = (Button) findViewById(R.id.button98);
                        float num024 = Float.parseFloat(aetText24.getText().toString());
                        float w24 = (float) num024;
                        textView024.setText(String.format(Locale.US, "%.2f", w24) + "");
                        break;

                    case R.id.button99:
                        TextView textView025 = (TextView) findViewById(R.id.textViewWir3);
                        aetText25 = (Button) findViewById(R.id.button99);
                        float num025 = Float.parseFloat(aetText25.getText().toString());
                        float w25 = (float) num025;
                        textView025.setText(String.format(Locale.US, "%.2f", w25) + "");
                        break;


                    case R.id.button100:
                        TextView textView026 = (TextView) findViewById(R.id.textViewWir3);
                        aetText26 = (Button) findViewById(R.id.button100);
                        float num026 = Float.parseFloat(aetText26.getText().toString());
                        float w26 = (float) num026;
                        textView026.setText(String.format(Locale.US, "%.2f", w26) + "");
                        break;


                    case R.id.button101:
                        TextView textView027 = (TextView) findViewById(R.id.textViewWir3);
                        aetText27 = (Button) findViewById(R.id.button101);
                        float num027 = Float.parseFloat(aetText27.getText().toString());
                        float w27 = (float) num027;
                        textView027.setText(String.format(Locale.US, "%.2f", w27) + "");
                        break;


                    case R.id.button102:
                        TextView textView028 = (TextView) findViewById(R.id.textViewWir3);
                        aetText28 = (Button) findViewById(R.id.button102);
                        float num028 = Float.parseFloat(aetText28.getText().toString());
                        float w28 = (float) num028;
                        textView028.setText(String.format(Locale.US, "%.2f", w28) + "");
                        break;


                    case R.id.button103:
                        TextView textView029 = (TextView) findViewById(R.id.textViewWir3);
                        aetText29 = (Button) findViewById(R.id.button103);
                        float num029 = Float.parseFloat(aetText29.getText().toString());
                        float w29 = (float) num029;
                        textView029.setText(String.format(Locale.US, "%.2f", w29) + "");
                        break;


                    case R.id.button104:
                        TextView textView030 = (TextView) findViewById(R.id.textViewWir3);
                        aetText30 = (Button) findViewById(R.id.button104);
                        float num030 = Float.parseFloat(aetText30.getText().toString());
                        float w30 = (float) num030;
                        textView030.setText(String.format(Locale.US, "%.2f", w30) + "");
                        break;


                    case R.id.button105:
                        TextView textView031 = (TextView) findViewById(R.id.textViewWir3);
                        aetText31 = (Button) findViewById(R.id.button105);
                        float num031 = Float.parseFloat(aetText31.getText().toString());
                        float w31 = (float) num031;
                        textView031.setText(String.format(Locale.US, "%.2f", w31) + "");
                        break;


                    case R.id.button11:
                        TextView textView032 = (TextView) findViewById(R.id.textViewWir3);
                        aetText32 = (Button) findViewById(R.id.button11);
                        float num032 = Float.parseFloat(aetText32.getText().toString());
                        float w32 = (float) num032;
                        textView032.setText(String.format(Locale.US, "%.2f", w32) + "");
                        break;

                    case R.id.button12:
                        TextView textView033 = (TextView) findViewById(R.id.textViewWir3);
                        aetText33 = (Button) findViewById(R.id.button12);
                        float num033 = Float.parseFloat(aetText33.getText().toString());
                        float w33 = (float) num033;
                        textView033.setText(String.format(Locale.US, "%.2f", w33) + "");
                        break;

                    //endregion


                    //region секция 4.1
                    case R.id.button52:
                        TextView textView034 = (TextView) findViewById(R.id.textViewWir4);
                        aetText34 = (Button) findViewById(R.id.button52);
                        float num034 = Float.parseFloat(aetText34.getText().toString());
                        float w34 = (float) num034;
                        textView034.setText(String.format(Locale.US, "%.2f", w34) + "");
                        break;

                    case R.id.button53:
                        TextView textView035 = (TextView) findViewById(R.id.textViewWir4);
                        aetText35 = (Button) findViewById(R.id.button53);
                        float num035 = Float.parseFloat(aetText35.getText().toString());
                        float w35 = (float) num035;
                        textView035.setText(String.format(Locale.US, "%.2f", w35) + "");
                        break;

                    case R.id.button54:
                        TextView textView036 = (TextView) findViewById(R.id.textViewWir4);
                        aetText36 = (Button) findViewById(R.id.button54);
                        float num036 = Float.parseFloat(aetText36.getText().toString());
                        float w36 = (float) num036;
                        textView036.setText(String.format(Locale.US, "%.2f", w36) + "");
                        break;


                    case R.id.button55:
                        TextView textView037 = (TextView) findViewById(R.id.textViewWir4);
                        aetText37 = (Button) findViewById(R.id.button55);
                        float num037 = Float.parseFloat(aetText37.getText().toString());
                        float w37 = (float) num037;
                        textView037.setText(String.format(Locale.US, "%.2f", w37) + "");
                        break;


                    case R.id.button59:
                        TextView textView038 = (TextView) findViewById(R.id.textViewWir4);
                        aetText38 = (Button) findViewById(R.id.button59);
                        float num038 = Float.parseFloat(aetText38.getText().toString());
                        float w38 = (float) num038;
                        textView038.setText(String.format(Locale.US, "%.2f", w38) + "");
                        break;


                    case R.id.button60:
                        TextView textView039 = (TextView) findViewById(R.id.textViewWir4);
                        aetText39 = (Button) findViewById(R.id.button60);
                        float num039 = Float.parseFloat(aetText39.getText().toString());
                        float w39 = (float) num039;
                        textView039.setText(String.format(Locale.US, "%.2f", w39) + "");
                        break;




                    //endregion

                    //region секция 5.1
                    case R.id.button61:
                        TextView textView040 = (TextView) findViewById(R.id.textViewWir5);
                        aetText40 = (Button) findViewById(R.id.button61);
                        float num040 = Float.parseFloat(aetText40.getText().toString());
                        float w40 = (float) num040;
                        textView040.setText(String.format(Locale.US, "%.2f", w40) + "");
                        break;

                    case R.id.button62:
                        TextView textView041 = (TextView) findViewById(R.id.textViewWir5);
                        aetText41 = (Button) findViewById(R.id.button62);
                        float num041 = Float.parseFloat(aetText41.getText().toString());
                        float w41 = (float) num041;
                        textView041.setText(String.format(Locale.US, "%.2f", w41) + "");
                        break;

                    case R.id.button63:
                        TextView textView042 = (TextView) findViewById(R.id.textViewWir5);
                        aetText42 = (Button) findViewById(R.id.button63);
                        float num042 = Float.parseFloat(aetText42.getText().toString());
                        float w42 = (float) num042;
                        textView042.setText(String.format(Locale.US, "%.2f", w42) + "");
                        break;


                    case R.id.button64:
                        TextView textView043 = (TextView) findViewById(R.id.textViewWir5);
                        aetText43 = (Button) findViewById(R.id.button64);
                        float num043 = Float.parseFloat(aetText43.getText().toString());
                        float w43 = (float) num043;
                        textView043.setText(String.format(Locale.US, "%.2f", w43) + "");
                        break;


                    case R.id.button65:
                        TextView textView044 = (TextView) findViewById(R.id.textViewWir5);
                        aetText44 = (Button) findViewById(R.id.button65);
                        float num044 = Float.parseFloat(aetText44.getText().toString());
                        float w44 = (float) num044;
                        textView044.setText(String.format(Locale.US, "%.2f", w44) + "");
                        break;


                    case R.id.button66:
                        TextView textView045 = (TextView) findViewById(R.id.textViewWir5);
                        aetText45 = (Button) findViewById(R.id.button66);
                        float num045 = Float.parseFloat(aetText45.getText().toString());
                        float w45 = (float) num045;
                        textView045.setText(String.format(Locale.US, "%.2f", w45) + "");
                        break;

                    //endregion

                    //region секция 6.1
                    case R.id.button70:
                        TextView textView046 = (TextView) findViewById(R.id.textViewWir6);
                        aetText46 = (Button) findViewById(R.id.button70);
                        float num046 = Float.parseFloat(aetText46.getText().toString());
                        float w46 = (float) num046;
                        textView046.setText(String.format(Locale.US, "%.2f", w46) + "");
                        break;

                    case R.id.button71:
                        TextView textView047 = (TextView) findViewById(R.id.textViewWir6);
                        aetText47 = (Button) findViewById(R.id.button71);
                        float num047 = Float.parseFloat(aetText47.getText().toString());
                        float w47 = (float) num047;
                        textView047.setText(String.format(Locale.US, "%.2f", w47) + "");
                        break;

                    case R.id.button72:
                        TextView textView048 = (TextView) findViewById(R.id.textViewWir6);
                        aetText48 = (Button) findViewById(R.id.button72);
                        float num048 = Float.parseFloat(aetText48.getText().toString());
                        float w48 = (float) num048;
                        textView048.setText(String.format(Locale.US, "%.2f", w48) + "");
                        break;


                    case R.id.button73:
                        TextView textView073 = (TextView) findViewById(R.id.textViewWir6);
                        aetText49 = (Button) findViewById(R.id.button73);
                        float num073 = Float.parseFloat(aetText49.getText().toString());
                        float w73 = (float) num073;
                        textView073.setText(String.format(Locale.US, "%.2f", w73) + "");
                        break;


                    case R.id.button74:
                        TextView textView050 = (TextView) findViewById(R.id.textViewWir6);
                        aetText50 = (Button) findViewById(R.id.button74);
                        float num050 = Float.parseFloat(aetText50.getText().toString());
                        float w50 = (float) num050;
                        textView050.setText(String.format(Locale.US, "%.2f", w50) + "");
                        break;


                    case R.id.button75:
                        TextView textView051 = (TextView) findViewById(R.id.textViewWir6);
                        aetText51 = (Button) findViewById(R.id.button75);
                        float num051 = Float.parseFloat(aetText51.getText().toString());
                        float w51 = (float) num051;
                        textView051.setText(String.format(Locale.US, "%.2f", w51) + "");
                        break;

                    //endregion


                    //&&&&&&

                    default:
                }
            }
        };

        //region секция (btn1.setOnClickListener(btnClk);)
        btn1.setOnClickListener(btnClk);
        btn2.setOnClickListener(btnClk);
        btn3.setOnClickListener(btnClk);
        btn4.setOnClickListener(btnClk);
        btn5.setOnClickListener(btnClk);
        btn6.setOnClickListener(btnClk);
        btn7.setOnClickListener(btnClk);
        btn8.setOnClickListener(btnClk);
        btn9.setOnClickListener(btnClk);
        btn10.setOnClickListener(btnClk);
        btn11.setOnClickListener(btnClk);

        btn12.setOnClickListener(btnClk);
        btn13.setOnClickListener(btnClk);
        btn14.setOnClickListener(btnClk);
        btn15.setOnClickListener(btnClk);
        btn16.setOnClickListener(btnClk);
        btn17.setOnClickListener(btnClk);
        btn18.setOnClickListener(btnClk);
        btn19.setOnClickListener(btnClk);
        btn20.setOnClickListener(btnClk);
        btn21.setOnClickListener(btnClk);
        btn22.setOnClickListener(btnClk);

        btn23.setOnClickListener(btnClk);
        btn24.setOnClickListener(btnClk);
        btn25.setOnClickListener(btnClk);
        btn26.setOnClickListener(btnClk);
        btn27.setOnClickListener(btnClk);
        btn28.setOnClickListener(btnClk);
        btn29.setOnClickListener(btnClk);
        btn30.setOnClickListener(btnClk);
        btn31.setOnClickListener(btnClk);
        btn32.setOnClickListener(btnClk);
        btn33.setOnClickListener(btnClk);

        btn34.setOnClickListener(btnClk);
        btn35.setOnClickListener(btnClk);
        btn36.setOnClickListener(btnClk);
        btn37.setOnClickListener(btnClk);
        btn38.setOnClickListener(btnClk);
        btn39.setOnClickListener(btnClk);

        btn40.setOnClickListener(btnClk);
        btn41.setOnClickListener(btnClk);
        btn42.setOnClickListener(btnClk);
        btn43.setOnClickListener(btnClk);
        btn44.setOnClickListener(btnClk);
        btn45.setOnClickListener(btnClk);

        btn46.setOnClickListener(btnClk);
        btn47.setOnClickListener(btnClk);
        btn48.setOnClickListener(btnClk);
        btn49.setOnClickListener(btnClk);
        btn50.setOnClickListener(btnClk);
        btn51.setOnClickListener(btnClk);

        //endregion

    }
    public void onClickToPay(View view) {

       // long mills = 70L;
      //  Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
     //   vibrator.vibrate(mills);

        Animation anim = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.alpha2);
        final Button button = (Button) findViewById(R.id.button106);

        button.startAnimation(anim);

        TextView aetText1;
        TextView aetText2;
        TextView aetText3;
        TextView aetText4;
        TextView aetText5;
        TextView aetText6;



// Стороны
        aetText1 = (TextView) findViewById(R.id.textViewWir);
        aetText2 = (TextView) findViewById(R.id.textViewWir2);
        aetText3 = (TextView) findViewById(R.id.textViewWir3);

        aetText4 = (TextView) findViewById(R.id.textViewWir4);
        aetText5 = (TextView) findViewById(R.id.textViewWir5);

        //цена
        aetText6 = (TextView) findViewById(R.id.textViewWir6);

            float num001 = Float.parseFloat(aetText1.getText().toString());
            float num002 = Float.parseFloat(aetText2.getText().toString());
            float num003 = Float.parseFloat(aetText3.getText().toString());

            float num004 = Float.parseFloat(aetText4.getText().toString());
            float num005 = Float.parseFloat(aetText5.getText().toString());

            float num006 = Float.parseFloat(aetText6.getText().toString());

            float w = (float) ((float) ((num001 * 2) + (num002 * 2) + (num003 * 2)) * ((num004 * 0.01)*(num005 * 0.01)));
            TextView textView142 = (TextView) findViewById(R.id.textView14);
            textView142.setText(String.format(Locale.US, "%.2f", w) + "");

            float t = (float) w*(num006);
            TextView textView144 = (TextView) findViewById(R.id.textView20);
            textView144.setText(String.format(Locale.US, "%.2f", t) + "");

        }


    //region сохранение данных
    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, etText.getText().toString());
        ed.commit();
        //Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        etText.setText(savedText);
      //  Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    void saveText2() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT2, etText2.getText().toString());
        ed.commit();
    }
    void loadText2() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT2, "");
        etText2.setText(savedText);
    }
    void saveText3() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT3, etText3.getText().toString());
        ed.commit();
    }
    void loadText3() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT3, "");
        etText3.setText(savedText);
    }
    void saveText4() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT4, etText4.getText().toString());
        ed.commit();
    }
    void loadText4() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT4, "");
        etText4.setText(savedText);
    }
    void saveText5() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT5, etText5.getText().toString());
        ed.commit();
    }
    void loadText5() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT5, "");
        etText5.setText(savedText);
    }
    void saveText6() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT6, etText6.getText().toString());
        ed.commit();
    }
    void loadText6() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT6, "");
        etText6.setText(savedText);
    }
    void saveText7() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT7, etText7.getText().toString());
        ed.commit();
    }
    void loadText7() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT7, "");
        etText7.setText(savedText);
    }
    void saveText8() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT8, etText8.getText().toString());
        ed.commit();
    }
    void loadText8() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT8, "");
        etText8.setText(savedText);
    }
    void saveText9() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT9, etText9.getText().toString());
        ed.commit();
    }
    void loadText9() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT9, "");
        etText9.setText(savedText);
    }
    void saveText10() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT10, etText10.getText().toString());
        ed.commit();
    }
    void loadText10() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT10, "");
        etText10.setText(savedText);
    }
    void saveText11() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT11, etText11.getText().toString());
        ed.commit();
    }
    void loadText11() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT11, "");
        etText11.setText(savedText);
    }
    void saveText12() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT12, etText12.getText().toString());
        ed.commit();
    }
    void loadText12() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT12, "");
        etText12.setText(savedText);
    }
    void saveText13() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT13, etText13.getText().toString());
        ed.commit();
    }
    void loadText13() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT13, "");
        etText13.setText(savedText);
    }
    void saveText14() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT14, etText14.getText().toString());
        ed.commit();
    }
    void loadText14() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT14, "");
        etText14.setText(savedText);
    }
    void saveText15() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT15, etText15.getText().toString());
        ed.commit();
    }
    void loadText15() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT15, "");
        etText15.setText(savedText);
    }
    void saveText16() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT16, etText16.getText().toString());
        ed.commit();
    }
    void loadText16() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT16, "");
        etText16.setText(savedText);
    }
    void saveText17() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT17, etText17.getText().toString());
        ed.commit();
    }
    void loadText17() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT17, "");
        etText17.setText(savedText);
    }
    void saveText18() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT18, etText18.getText().toString());
        ed.commit();
    }
    void loadText18() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT18, "");
        etText18.setText(savedText);
    }
    void saveText19() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT19, etText19.getText().toString());
        ed.commit();
    }
    void loadText19() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT19, "");
        etText19.setText(savedText);
    }
    void saveText20() {
        sPref2 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref2.edit();
        ed.putString(SAVED_TEXT20, etText20.getText().toString());
        ed.commit();
    }
    void loadText20() {
        sPref2 = getPreferences(MODE_PRIVATE);
        String savedText = sPref2.getString(SAVED_TEXT20, "");
        etText20.setText(savedText);
    }
    void saveText21() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT21, etText21.getText().toString());
        ed.commit();
    }
    void loadText21() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT21, "");
        etText21.setText(savedText);
    }
    void saveText22() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT22, etText22.getText().toString());
        ed.commit();
    }
    void loadText22() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT22, "");
        etText22.setText(savedText);
    }




    void saveText23() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT23, etText23.getText().toString());
        ed.commit();
       // Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    void loadText23() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT23, "");
        etText23.setText(savedText);
       // Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    void saveText24() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT24, etText24.getText().toString());
        ed.commit();
       // Toast.makeText(this, "Text saved", Toast.LENGTH_SHORT).show();
    }

    void loadText24() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT24, "");
        etText24.setText(savedText);
       // Toast.makeText(this, "Text loaded", Toast.LENGTH_SHORT).show();
    }

    void saveText25() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT25, etText25.getText().toString());
        ed.commit();
    }
    void loadText25() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT25, "");
        etText25.setText(savedText);
    }
    void saveText26() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT26, etText26.getText().toString());
        ed.commit();
    }
    void loadText26() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT26, "");
        etText26.setText(savedText);
    }
    void saveText27() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT27, etText27.getText().toString());
        ed.commit();
    }
    void loadText27() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT27, "");
        etText27.setText(savedText);
    }
    void saveText28() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT28, etText28.getText().toString());
        ed.commit();
    }
    void loadText28() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT28, "");
        etText28.setText(savedText);
    }
    void saveText29() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT29, etText29.getText().toString());
        ed.commit();
    }
    void loadText29() {
        sPref3 = getPreferences(MODE_PRIVATE);
        String savedText = sPref3.getString(SAVED_TEXT29, "");
        etText29.setText(savedText);
    }
    void saveText30() {
        sPref3 = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref3.edit();
        ed.putString(SAVED_TEXT30, etText30.getText().toString());
        ed.commit();
    }
    void loadText30() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT30, "");
        etText30.setText(savedText);
    }
    void saveText31() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT31, etText31.getText().toString());
        ed.commit();
    }
    void loadText31() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT31, "");
        etText31.setText(savedText);
    }
    void saveText32() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT32, etText32.getText().toString());
        ed.commit();
    }
    void loadText32() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT32, "");
        etText32.setText(savedText);
    }
    void saveText33() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT33, etText33.getText().toString());
        ed.commit();
    }
    void loadText33() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT33, "");
        etText33.setText(savedText);
    }
    void saveText34() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT34, etText34.getText().toString());
        ed.commit();
    }
    void loadText34() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT34, "");
        etText34.setText(savedText);
    }
    void saveText35() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT35, etText35.getText().toString());
        ed.commit();
    }
    void loadText35() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT35, "");
        etText35.setText(savedText);
    }
    void saveText36() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT36, etText36.getText().toString());
        ed.commit();
    }
    void loadText36() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT36, "");
        etText36.setText(savedText);
    }
    void saveText37() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT37, etText37.getText().toString());
        ed.commit();
    }
    void loadText37() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT37, "");
        etText37.setText(savedText);
    }
    void saveText38() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT38, etText38.getText().toString());
        ed.commit();
    }
    void loadText38() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT38, "");
        etText38.setText(savedText);
    }
    void saveText39() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT39, etText39.getText().toString());
        ed.commit();
    }
    void loadText39() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT39, "");
        etText39.setText(savedText);
    }
    void saveText40() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT40, etText40.getText().toString());
        ed.commit();
    }
    void loadText40() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT40, "");
        etText40.setText(savedText);
    }
    void saveText41() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT41, etText41.getText().toString());
        ed.commit();
    }
    void loadText41() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT41, "");
        etText41.setText(savedText);
    }
    void saveText42() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT42, etText42.getText().toString());
        ed.commit();
    }
    void loadText42() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT42, "");
        etText42.setText(savedText);
    }
    void saveText43() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT43, etText43.getText().toString());
        ed.commit();
    }
    void loadText43() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT43, "");
        etText20.setText(savedText);
    }
    void saveText44() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT44, etText44.getText().toString());
        ed.commit();
    }
    void loadText44() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT44, "");
        etText44.setText(savedText);
    }
    void saveText45() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT45, etText45.getText().toString());
        ed.commit();
    }
    void loadText45() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT45, "");
        etText45.setText(savedText);
    }
void saveText46() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT46, etText46.getText().toString());
        ed.commit();
    }
    void loadText46() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT46, "");
        etText46.setText(savedText);
    }
void saveText47() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT47, etText47.getText().toString());
        ed.commit();
    }
    void loadText47() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT47, "");
        etText47.setText(savedText);
    }
void saveText48() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT48, etText48.getText().toString());
        ed.commit();
    }
    void loadText48() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT48, "");
        etText48.setText(savedText);
    }
void saveText49() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT49, etText49.getText().toString());
        ed.commit();
    }
    void loadText49() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT49, "");
        etText49.setText(savedText);
    }
void saveText50() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT50, etText50.getText().toString());
        ed.commit();
    }
    void loadText50() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT50, "");
        etText50.setText(savedText);
    }
    void saveText51() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT51, etText51.getText().toString());
        ed.commit();
    }
    void loadText51() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT51, "");
        etText51.setText(savedText);
    }

    //endregion


    @Override
    protected void onDestroy() {
        super.onDestroy();
        saveText();
        saveText2();
        saveText3();
        saveText4();
        saveText5();
        saveText6();
        saveText7();
        saveText8();
        saveText9();
        saveText10();
        saveText11();
        saveText12();
        saveText13();
        saveText14();
        saveText15();
        saveText16();
        saveText17();
        saveText18();
        saveText19();
        saveText20();
        saveText21();
        saveText22();

        saveText23();
        saveText24();
        saveText25();
        saveText26();
        saveText27();
        saveText28();
        saveText29();
        saveText30();
        saveText31();
        saveText32();
        saveText33();
        saveText34();
        saveText35();
        saveText36();
        saveText37();
        saveText38();
        saveText39();
        saveText40();
        saveText41();
        saveText42();
        saveText43();
        saveText44();

        saveText45();
        saveText46();
        saveText47();
        saveText48();
        saveText49();
        saveText50();
        saveText51();

    }


    public void onClick2(View view) {


        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        setContentView(R.layout.activity_main2);
        startActivity(intent);
    }

    }


