package cl.ramces.jedisithquizz;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class JediQuizzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jedi_quizz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView where = (TextView) findViewById(R.id.WhereTv);

        final RadioGroup where1 = (RadioGroup) findViewById(R.id.WhereRg);

        TextView luky = (TextView) findViewById(R.id.LuckyTv);

        final RadioGroup luky1 = (RadioGroup) findViewById(R.id.LuckyRg);

        TextView sentence = (TextView) findViewById(R.id.SentenceTv);

        final RadioGroup sentence1 = (RadioGroup) findViewById(R.id.SentenceRg);

        Button send = (Button) findViewById(R.id.SendBtn);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = where1.getCheckedRadioButtonId();
                int id1 = luky1.getCheckedRadioButtonId();
                int id2 = sentence1.getCheckedRadioButtonId();
                if (id != -1 && id1 != -1 && id2 != -1) {
                    RadioButton where2 = (RadioButton) findViewById(id);
                    RadioButton luky2 = (RadioButton) findViewById(id1);
                    RadioButton sentence2 = (RadioButton) findViewById(id2);

                    String TextLuky = luky2.getText().toString();
                    String TextWhere = where2.getText().toString();
                    String TextSentence = sentence2.getText().toString();

                    if (TextWhere.contains("campo") && TextLuky.contains("mucha") && TextSentence.contains("buena")) {
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(JediQuizzActivity.this);
                        alertDialog.setTitle("Tu resultado");
                        alertDialog.setMessage("La Luz y el Código Jedi te guían.Eres un gran Maestro , la fuerza es fuerte en ti");
                        alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        alertDialog.show();

                    } else if (TextWhere.contains("rascacielos")&& TextLuky.contains("mas")&& TextSentence.contains("estupida")){
                        AlertDialog.Builder alertDialog1 = new AlertDialog.Builder(JediQuizzActivity.this);
                        alertDialog1.setTitle("Tu resultado");
                        alertDialog1.setMessage("La Fuerza es intensa en ti, Ten cuidado con las ambiciones y prejuicios de lo contrario el lado oscuro despertara en ti");
                        alertDialog1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        alertDialog1.show();

                    }else {
                        AlertDialog.Builder alertDialogJedi = new AlertDialog.Builder(JediQuizzActivity.this);
                        alertDialogJedi.setTitle("Tu Resultado");
                        alertDialogJedi.setMessage("Eres un Caballero Jedi de tomo y lomo , tienes ideas raras pero sabes como controlar La fuerza a plenitud sigue por esa senda Maestro");
                        alertDialogJedi.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        alertDialogJedi.show();
                    }

                } else {

                    Toast.makeText(JediQuizzActivity.this, "Seleccione todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Button button = (Button) findViewById(R.id.SithQuizzBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JediQuizzActivity.this, SithQuizzActivity.class);
                startActivity(intent);
            }
        });

    }
}
