package app3.android.test.changecolor;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button redBt;
    Button orangeBt;
    Button yellowBt;
    Button greenBt;
    Button blueBt;
    Button navyBt;
    Button violetBt;
    TextView centerText;

    // 테스트 테트스
    // 버튼 클릭시 색상 변경되는 함수
    public void clickBt(Button bt, int red, int green, int blue) {

        final int r = red;
        final int g = green;
        final int b = blue;

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    centerText.setBackgroundColor(Color.rgb(r, g, b));

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.redBt = (Button)findViewById(R.id.redBt);
        this.orangeBt = (Button)findViewById(R.id.orangeBt);
        this.yellowBt = (Button)findViewById(R.id.yellowBt);
        this.greenBt = (Button)findViewById(R.id.greenBt);
        this.blueBt = (Button)findViewById(R.id.blueBt);
        this.navyBt = (Button)findViewById(R.id.navyBt);
        this.violetBt = (Button)findViewById(R.id.violetBt);

        centerText = (TextView)findViewById(R.id.centerText);

        clickBt(this.redBt,255,0,0);
        clickBt(this.orangeBt,255,94,0);;
        clickBt(this.yellowBt,255,228,0);
        clickBt(this.greenBt,29,219,22);
        clickBt(this.blueBt,0,84,255);
        clickBt(this.navyBt,1,0,255);
        clickBt(this.violetBt,95,0,255);


    }
}
