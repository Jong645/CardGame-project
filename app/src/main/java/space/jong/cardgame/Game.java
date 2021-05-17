package space.jong.cardgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Game extends AppCompatActivity {
    @Override

 protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.arena);

    Window w = getWindow();
    w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

}

     @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(Game.this, GameSelectMenu.class);
            startActivity(intent);
            finish();
        } catch (Exception e){

        }
    }

}
