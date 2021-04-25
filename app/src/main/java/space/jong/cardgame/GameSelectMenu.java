package space.jong.cardgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameSelectMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameselectmenu);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //команда для кнопки начало

                try {
                    Intent intent = new Intent(GameSelectMenu.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){

                }
            }
        });
        //команда для кнопки конец
        Button button_two = (Button) findViewById(R.id.two);
        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //команда для кнопки начало

                try {
                    Intent intent = new Intent(GameSelectMenu.this, FirstCardMenu.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){

                }
            }
        });

    }
    // Системная кнопка назад переписываем начало
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(GameSelectMenu.this, MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e){

        }
    }
    // Системная кнопка назад переписываем конец
}