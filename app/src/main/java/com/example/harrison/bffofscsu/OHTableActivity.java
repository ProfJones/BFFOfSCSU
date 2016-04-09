package com.example.harrison.bffofscsu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

/**
 * Created by Darren on 4/9/2016.
 */
public class OHTableActivity extends Activity {
    String[] MondayOHs = {"1-2am","2-3am","3-4am","4-5am","5-6am","6-7am","7-8am","8-9am","9-10am"};
    String[] TuesdayOHs = {"1-2amT","2-3amT","3-4amT","4-5amT","5-6amT","6-7amT","7-8amT","8-9amT","9-10amT"};
    String[] WedesdayOHs = {"1-2amW","2-3amW","3-4amW","4-5amW","5-6amW","6-7amW","7-8amW","8-9amW","9-10amW"};
    String[] ThursdayOHs = {"1-2amTH","2-3amTH","3-4amTH","4-5amTH","5-6amTH","6-7amTH","7-8amTH","8-9amTH","9-10amTH"};
    String[] FridayOHs = {"1-2amTH","2-3amTH","3-4amTH","4-5aTH","5-6amTH","6-7amTH","7-8amTH","8-9amTH","9-10amTH"};
    String[] realNames = {"Ramnath Sarnath","Jie H. Meichsner","Donald O. Hamnes",
            "Bryant A. Julstrom","Mehdi Mekni","Jayantha Herath","Omar Al-Azzam Assistant",
            "Andrew A. Anda","Alek Tomovic"};
    LayoutInflater inflater;
    Context ctx = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.office_hour_table);

        //our viewholder
        ViewHolder holder = new ViewHolder();
        holder.MondayOH = (TextView) findViewById(R.id.monday_oh);
        holder.TuesdayOH = (TextView) findViewById(R.id.tuesday_oh);
        holder.WednesdayOH = (TextView) findViewById(R.id.wednesday_oh);
        holder.ThursdayOH = (TextView) findViewById(R.id.thursday_oh);
        holder.FridayOH = (TextView) findViewById(R.id.friday_oh);
        holder.realName = (TextView) findViewById(R.id.table_professor_name);

        //assign data
        int position = getIntent().getIntExtra("key",0);
        holder.MondayOH.setText(MondayOHs[position]);
        holder.TuesdayOH.setText(TuesdayOHs[position]);
        holder.WednesdayOH.setText(WedesdayOHs[position]);
        holder.ThursdayOH.setText(ThursdayOHs[position]);
        holder.FridayOH.setText(FridayOHs[position]);
        holder.realName.setText(realNames[position]);
    }
    private class ViewHolder{
        TextView MondayOH;
        TextView TuesdayOH;
        TextView WednesdayOH;
        TextView ThursdayOH;
        TextView FridayOH;
        TextView realName;

    }

}
