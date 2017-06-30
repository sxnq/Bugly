package xunqaing.bwie.com.bugly_tosdcard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button bt = (Button) findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                yiChang();

                Intent i = new Intent(MainActivity.this,ImageViewerActivity.class);
                startActivity(i);

            }
        });
    }

    private void yiChang() {

int a[] = {1,2,3};

        System.out.println(a[4]);

    }


}
