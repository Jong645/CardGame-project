package space.jong.cardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_start = (Button) findViewById(R.id.button_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //команда для кнопки

                try {
                    Intent intent = new Intent(MainActivity.this, GameSelectMenu.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){

                }
            }
        });
    }
    //системная кнопка назад начало(выход)

    @Override
    public void onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else {
            Toast.makeText(getBaseContext(), "Нажмите ещё раз, чтобы выйти", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }

    //системная кнопка назад конец(выход)
}
