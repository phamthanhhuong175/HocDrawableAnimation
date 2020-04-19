package phamthanhhuong.com.hocdrawableanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

import static phamthanhhuong.com.hocdrawableanimation.R.drawable.chayhinh;

public class MainActivity extends AppCompatActivity {
    ImageView imgHinh;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        imgHinh=findViewById(R.id.imgHinh);
        imgHinh.setBackgroundResource(chayhinh);
        animationDrawable= (AnimationDrawable) imgHinh.getBackground();
    }

    public void xuLyStart(View view) {
        animationDrawable.start();
    }

    public void xuLyStop(View view) {
        animationDrawable.stop();
    }
}
