/*
 ParkingEazeTeam

 */
package parking.IOT.syetem.scale.model;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddVehicle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicle);
        getSupportActionBar().setTitle("Add Vehicle");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final EditText et1 = (EditText)findViewById(R.id.et1);
        final EditText et2 = (EditText)findViewById(R.id.et2);
        final EditText et3 = (EditText)findViewById(R.id.et3);
        final EditText et4 = (EditText)findViewById(R.id.et4);

        Button bt = (Button)findViewById(R.id.add_vehicle);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = et1.getText().toString();
                String name2 = et2.getText().toString();
                String name3 = et3.getText().toString();
                String name4 = et4.getText().toString();


                if(name1.isEmpty() || name2.isEmpty() || name3.isEmpty() || name4.isEmpty()){
                    Toast.makeText(AddVehicle.this,"Missing Information ",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(AddVehicle.this,"Vehicle Added ",Toast.LENGTH_LONG).show();
                    et1.setText("");
                    et2.setText("");
                    et3.setText("");
                    et4.setText("");
                }



            }
        });
    }
}
