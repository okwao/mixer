package com.okwao.mixer;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by eit on 5/4/15.
 */
public class WhiskeyAdapter {
    String [] result;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public WhiskeyAdapter(WhiskeyTypeActivity whiskeyTypeActivity, String[] mixerList, int[] mixerIcons) {
        // TODO Auto-generated constructor stub
        result= mixerList;
        context= whiskeyTypeActivity;
        imageId=mixerIcons;
        inflater = (LayoutInflater)context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

//    @Override
//    public int getCount() {
//        // TODO Auto-generated method stub
//        return result.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        // TODO Auto-generated method stub
//        return position;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        // TODO Auto-generated method stub
//        return position;
//    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }

//    @Override
//    public View getView(final int position, View convertView, ViewGroup parent) {
//        // TODO Auto-generated method stub
//        Holder holder=new Holder();
//        View rowView;
//
//        rowView = inflater.inflate(R.layout.whiskey_grid, null);
//        holder.tv=(TextView) rowView.findViewById(R.id.whiskeytextView1);
//        holder.img=(ImageView) rowView.findViewById(R.id.whiskeyimageView1);
//
//        holder.tv.setText(result[position]);
//        holder.img.setImageResource(imageId[position]);

        /*rowView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();



            }
        });*/

//        return rowView;
}
