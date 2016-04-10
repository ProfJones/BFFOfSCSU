package com.example.harrison.bffofscsu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Darren on 4/9/2016.
 */
public class OHAdapter extends ArrayAdapter<String> {

    //Declarations
    int[] imgs={};
    String[] names = {};
    String[] departments = {};
    Context ctx;
    LayoutInflater inflater;

        public OHAdapter(Context context, String[] names, String[] departments, int[] imgs) {
        super(context, R.layout.professor_item_layout,names);

        this.ctx = context;
        this.names = names;
        this.departments = departments;
        this.imgs = imgs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.professor_item_layout,null);
        }

        //our viewholder
        final ViewHolder holder = new ViewHolder();
        holder.professorName = (TextView) convertView.findViewById(R.id.professor_name);
        holder.professorIcon = (ImageView) convertView.findViewById(R.id.professor_icon);
        holder.professorDepartment = (TextView) convertView.findViewById(R.id.professor_department);

        //assign data
        holder.professorIcon.setImageResource(imgs[position]);
        holder.professorName.setText(names[position]);
        holder.professorDepartment.setText(departments[position]);

        return convertView;
    }
    private class ViewHolder{
        ImageView professorIcon;
        TextView professorName;
        TextView professorDepartment;
    }
}
