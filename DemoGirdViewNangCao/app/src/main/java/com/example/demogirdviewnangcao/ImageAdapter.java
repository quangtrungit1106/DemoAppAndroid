package com.example.demogirdviewnangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Image> hinhAnhList;

    public ImageAdapter(Context context, int layout, List<Image>
            hinhAnhList) {

        this.context = context;
        this.layout = layout;
        this.hinhAnhList = hinhAnhList;
    }

    @Override
    public int getCount() {
        return hinhAnhList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view =inflater.inflate(layout,null);
        ImageView imageView = view.findViewById(R.id.ivImg);
        Image hinhAnh= hinhAnhList.get(i);
        imageView.setImageResource(hinhAnh.getNumber());
        return view;
    }
}
