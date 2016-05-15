package us.xingkong.xingpostcard.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import us.xingkong.xingpostcard.R;


/**
 * Created by Garfield on 5/10/16.
 * 编辑文字的时候的弹出框
 */
public class EditCardActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editcardEt;
    private Button editcardBt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_editcard);

        editcardEt = (EditText) findViewById(R.id.editcard_et);
        editcardBt = (Button) findViewById(R.id.editcard_bt);
        editcardBt.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (!editcardEt.getText().toString().isEmpty()) {
            Intent intent = new Intent(this, ArtActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("words", editcardEt.getText().toString());
            startActivity(intent);
            finish();
        }
        else {
            /**
             * 提示用户输入文字
             * */
        }
    }


}
