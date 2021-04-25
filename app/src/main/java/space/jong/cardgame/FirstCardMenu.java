package space.jong.cardgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FirstCardMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_menu_first);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        int[] myArray; // объявление массива
        myArray = new int[28]; // создание, то есть, выделение памяти для массива на 10 элементов типа int








        Button button_back = (Button) findViewById(R.id.button_back_card_menu);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //команда для кнопки начало

                try {
                    Intent intent = new Intent(FirstCardMenu.this, GameSelectMenu.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){

                }
            }
        });
        //команда для кнопки конец


    }
    // Системная кнопка назад переписываем начало
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(FirstCardMenu.this, GameSelectMenu.class);
            startActivity(intent);
            finish();
        } catch (Exception e){

        }
    }
    // Системная кнопка назад переписываем конец
}