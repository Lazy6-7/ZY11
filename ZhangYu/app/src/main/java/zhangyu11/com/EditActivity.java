package zhangyu11.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;



public class EditActivity extends AppCompatActivity {
    EditText mEditText;
    Button mDoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edt);
        mEditText = (EditText)findViewById(R.id.edt_input);
        mDoneButton = (Button) findViewById(R.id.btn_done);
        mDoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zy = mEditText.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("mySign",zy);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
