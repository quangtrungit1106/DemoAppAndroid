package com.example.demoandroidnetwork.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demoandroidnetwork.R;
import com.example.demoandroidnetwork.model.WeatherForecastModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class WeatherAdapter extends BaseAdapter {
    private Context context;
    private List<WeatherForecastModel> weatherForecastModels;

    public WeatherAdapter(Context context, List<WeatherForecastModel> weatherList) {
        this.context = context;
        this.weatherForecastModels = weatherList;
    }

    @Override
    public int getCount() {
        return 0;
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
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.layout_weather_items, null);
        }
        TextView txtTimeForecast = view.findViewById(R.id.txtTimeForecast);
        TextView txtTemperatureForecast = view.findViewById(R.id.txtTemperatureForecast);
        TextView txtWindForecast = view.findViewById(R.id.txtWindForecast);
        ImageView imgForecast = view.findViewById(R.id.imgForecast);
        WeatherForecastModel weatherForecastModel = weatherForecastModels.get(position);
        txtTimeForecast.setText( "" + weatherForecastModel.getTime());
        txtTemperatureForecast.setText(weatherForecastModel.getTemperature()+"°C");
        txtWindForecast.setText(weatherForecastModel.getWinSpeed()+" km");

        Picasso.get().load("https:"+weatherForecastModel.getIcon()).into(imgForecast);
//imgForecast.src(weatherForecastModel.getTemperature());
        return view;
    }
}
