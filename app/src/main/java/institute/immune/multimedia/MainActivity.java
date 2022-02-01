package institute.immune.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.paradise);
    }

    public void onClickPlay(View view) {
        Toast toast = Toast.makeText(this, "Reproduciendo", Toast.LENGTH_LONG);
        mediaPlayer.start();
        toast.show();
    }

    public void onClickPause(View view) {
        Toast toast = Toast.makeText(this, "Pausado", Toast.LENGTH_LONG);
        toast.show();
        mediaPlayer.pause();
    }

    public void onClickStop(View view) {
        Toast toast = Toast.makeText(this, "Detenido", Toast.LENGTH_LONG);
        toast.show();
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.paradise);
    }
}