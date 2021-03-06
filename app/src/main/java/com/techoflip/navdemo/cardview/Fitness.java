package com.techoflip.navdemo.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import static com.techoflip.navdemo.cardview.R.drawable.fifth;

/**
 * Created by Akshat on 28-08-2017.
 */

public class Fitness extends BaseAdapter {
    String[] amen;
    String[] amin;
     FitnessActivity fitnessActivity ;
    LayoutInflater layoutInflater=null;
    public Fitness(FitnessActivity fitnessActivity, String[] amen,String[] amin) {
        this.amen = amen;
        this.amin=amin;



        this.fitnessActivity=fitnessActivity;
        layoutInflater=(LayoutInflater)fitnessActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }




    @Override
    public int getCount() {
        return amen.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View review=layoutInflater.inflate(R.layout.fourth_listview,null);
        TextView textView=(TextView)review.findViewById(R.id.fitness);
        textView.setText(amen[i]);
        TextView textView1=(TextView)review.findViewById(R.id.fitness1);
        textView1.setText(amin[i]);
        if (i==0){
            review.setBackground(review.getResources().getDrawable(R.drawable.fifth));
        }else if(i==1)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.second));
        }else if(i==2)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.first));
        }else if(i==3)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.fourth));
        }else if(i==4)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.sixth));
        }
        else if(i==5)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.seventh1));
        }
        else if(i==6)
        {
            review.setBackground(review.getResources().getDrawable(R.drawable.fifth));
        }
        return review;
    }
}
