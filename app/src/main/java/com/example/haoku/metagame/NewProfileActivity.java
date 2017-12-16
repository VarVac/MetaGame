package com.example.haoku.metagame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class NewProfileActivity extends AppCompatActivity {

    // Declare TextView labels for hidden labels so that they can be un-hidden
    private TextView archNameLabel;
    private TextView playerNameLabel;
    private TextView archDescLabel;

    // Declare all EditText so that input data can be loaded into the new profile
    private EditText profileNameField;
    private EditText gameNameField;
    private EditText profileDescField;
    private EditText archNameField;
    private EditText playerNameField;
    private EditText archDescField;

    // Declare all switches so that action listeners can be used
    private Switch teamSwitch;
    private Switch defaultArchSwitch;
    private Switch defaultPlayerSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_profile);

        // instantiate all declared UI widgets
        archNameLabel = (TextView) findViewById(R.id.archNameLabel);
        archDescLabel = (TextView) findViewById(R.id.archDescLabel);
        playerNameLabel = (TextView) findViewById(R.id.playerNameLabel);

        profileNameField = (EditText) findViewById(R.id.profileNameField);
        gameNameField = (EditText) findViewById(R.id.gameNameField);
        profileDescField = (EditText) findViewById(R.id.profileDescField);
        archNameField = (EditText) findViewById(R.id.archNameField);
        playerNameField = (EditText) findViewById(R.id.playerNameField);
        archDescField = (EditText) findViewById(R.id.archDescField);

        teamSwitch = (Switch) findViewById(R.id.teamSwitch);
        defaultArchSwitch = (Switch) findViewById(R.id.defaultArchSwitch);
        defaultPlayerSwitch = (Switch) findViewById(R.id.defaultPlayerSwitch);

        // attach listener to defaultArchSwitch to hide and reveal all archetype labels and fields
        defaultArchSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {
                    archNameLabel.setVisibility(View.VISIBLE);
                    archDescLabel.setVisibility(View.VISIBLE);
                    archNameField.setVisibility(View.VISIBLE);
                    archDescField.setVisibility(View.VISIBLE);
                }
                else
                {
                    archNameLabel.setVisibility(View.GONE);
                    archDescLabel.setVisibility(View.GONE);
                    archNameField.setVisibility(View.GONE);
                    archDescField.setVisibility(View.GONE);

                    archNameField.setText("");
                    archDescField.setText("");
                }
            }
        });

        // attach listener to defaultPlayerSwitch to hide and reveal all player labels and fields
        defaultPlayerSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked)
                {
                    playerNameLabel.setVisibility(View.VISIBLE);
                    playerNameField.setVisibility(View.VISIBLE);
                }
                else
                {
                    playerNameLabel.setVisibility(View.GONE);
                    playerNameField.setVisibility(View.GONE);

                    playerNameField.setText("");
                }
            }
        });
    }
}
