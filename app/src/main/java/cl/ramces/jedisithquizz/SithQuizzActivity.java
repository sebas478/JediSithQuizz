package cl.ramces.jedisithquizz;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SithQuizzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sith_quizz);

        TextView forgive = (TextView) findViewById(R.id.ForgiveTv);

        final RadioGroup forgive1 = (RadioGroup) findViewById(R.id.ForgiveRg);

        TextView enemies = (TextView) findViewById(R.id.EnemiesTv);

        final RadioGroup enemies1 = (RadioGroup) findViewById(R.id.EnemiesRg);

        TextView have = (TextView) findViewById(R.id.HaveTv);

        final RadioGroup have1 = (RadioGroup) findViewById(R.id.HaveRg);

        Button send = (Button) findViewById(R.id.SendSithBtn);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = forgive1.getCheckedRadioButtonId();
                int id1 = enemies1.getCheckedRadioButtonId();
                int id2 = have1.getCheckedRadioButtonId();

                if (id != -1 && id1 !=-1 && id2 !=-1){
                    RadioButton forgive2 = (RadioButton) findViewById(id);
                    RadioButton enemies2 = (RadioButton) findViewById(id1);
                    RadioButton have2 = (RadioButton) findViewById(id2);

                    String TextForgive = forgive2.getText().toString();
                    String TextEnemies = enemies2.getText().toString();
                    String TextHave = have2.getText().toString();

                    if (TextForgive.contains("confianza")&& TextEnemies.contains("Muchos")&& TextHave.contains("talento")){
                        AlertDialog.Builder alertDialogSith = new AlertDialog.Builder(SithQuizzActivity.this);
                        alertDialogSith.setTitle("Tu Resultado");
                        alertDialogSith.setMessage("Perteneces al lado oscuro de la fuerza, y probablemente no estamos sorprendiéndote con esta revelación. Nada podría haber más aburrido que ser un Caballero Jedi, con todo ese autocontrol y esos aires de no haber roto nunca un plato");
                        alertDialogSith.setPositiveButton("YEAH!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        alertDialogSith.show();

                    }else if (TextForgive.contains("Podria")&& TextEnemies.contains("Creo")&& TextHave.contains("claro")){
                        AlertDialog.Builder alertDialogSith1 = new AlertDialog.Builder(SithQuizzActivity.this);
                        alertDialogSith1.setTitle("Tu Resultado");
                        alertDialogSith1.setMessage("Tienes las ideas un poco disueltas , no pareces mala persona a simple vista , puede que no tengas madera para ser un Lord Sith , deja de sertan estirado!!");
                        alertDialogSith1.setPositiveButton("YEAH!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        alertDialogSith1.show();
                    }else{
                        AlertDialog.Builder alertDialogSith2 = new AlertDialog.Builder(SithQuizzActivity.this);
                        alertDialogSith2.setTitle("Tu Resultado");
                        alertDialogSith2.setMessage("Eres un fuerte Lord Sith , no aceptas las insolencias y castigas severamente a quien lo haga , tus enemigos deberian de tener cuidado contigo");
                        alertDialogSith2.setPositiveButton("YEAH!", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        alertDialogSith2.show();
                    }

                }else{
                    Toast.makeText(SithQuizzActivity.this, "Seleccione todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
