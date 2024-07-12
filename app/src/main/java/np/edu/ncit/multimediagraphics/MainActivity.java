package np.edu.ncit.multimediagraphics;

import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
ImageView imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.img1);
        imageView1=(ImageView)findViewById(R.id.img2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
        imageView.setAnimation(animation);
        Animation animation2= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_in);
        imageView1.setAnimation(animation2);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//               imageView.setVisibility(View.GONE);
//            }
//        },5000);
    }


}