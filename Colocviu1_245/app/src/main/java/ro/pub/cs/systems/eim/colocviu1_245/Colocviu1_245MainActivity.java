package ro.pub.cs.systems.eim.colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Colocviu1_245MainActivity extends AppCompatActivity {

    private EditText NextTerm;
    private TextView AllTerms;
    private Button add, compute;

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            if (!NextTerm.getText().toString().isEmpty()) {
                int nextTerm = Integer.valueOf(NextTerm.getText().toString());

                switch (view.getId()) {
                    case R.id.add:
                        String allterms = AllTerms.getText().toString();
                        if (allterms.isEmpty()) {
                            allterms.concat(NextTerm.getText().toString());
                        } else {
                            allterms.concat(" + ");
                            allterms.concat(NextTerm.getText().toString());
                        }
                        break;
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_245_main);

        NextTerm = findViewById(R.id.NextTerm);
        AllTerms = findViewById(R.id.AllTerms);
        add = (Button) findViewById(R.id.add);
        add.setOnClickListener(buttonClickListener);
        compute = (Button) findViewById(R.id.compute);
        compute.setOnClickListener(buttonClickListener);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
