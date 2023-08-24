package com.example.new_demo_238;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdsAdapter extends RecyclerView.Adapter<AdsAdapter.ViewHolder> {

    MainActivity mainActivity;
    JSONObject response;

    String mediaview = "";
    String title = "";
    String icon = "";
    String button = "Install";
    String advertiser = "";
    String body = "";
    String install = "";
    public AdsAdapter(MainActivity mainActivity, JSONObject response) {
        this.mainActivity = mainActivity;
        this.response = response;
    }

    @NonNull
    @Override
    public AdsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.ad_unified,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdsAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        try {
            JSONObject jsonResponse = new JSONObject(String.valueOf(response));
            JSONArray peopleArray = jsonResponse.getJSONArray("data");

                JSONObject personObject = peopleArray.getJSONObject(position);

                mediaview = personObject.getString("app_banner");
                 title = personObject.getString("app_name");
                 icon = personObject.getString("app_icon");
                 advertiser = personObject.getString("app_sponsored");
                 body = personObject.getString("app_desc_title");

                Picasso.with(mainActivity)
                        .load(mediaview)
                        .into(holder.mediaView);

                Picasso.with(mainActivity)
                        .load(icon)
                        .into(holder.icon);

                holder.headline.setText(title);
                holder.button.setText(button);
                holder.advertiser.setText(advertiser);
                holder.body.setText(body);


                holder.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(position==0)
                        {
                            try {
                                install = personObject.getString("app_link");

                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(install));

                                if (intent.resolveActivity(mainActivity.getPackageManager()) != null) {
                                    mainActivity.startActivity(intent);
                                }else {
                                    Toast.makeText(mainActivity, "Fail to Install", Toast.LENGTH_SHORT).show();
                                }

                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        if(position==1)
                        {
                            try {
                                install = personObject.getString("app_link");

                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(install));

                                if (intent.resolveActivity(mainActivity.getPackageManager()) != null) {
                                    mainActivity.startActivity(intent);
                                }else {
                                    Toast.makeText(mainActivity, "Fail to Install", Toast.LENGTH_SHORT).show();
                                }

                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        if(position==2)
                        {
                            try {
                                install = personObject.getString("app_link");

                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(install));

                                if (intent.resolveActivity(mainActivity.getPackageManager()) != null) {
                                    mainActivity.startActivity(intent);
                                }else {
                                    Toast.makeText(mainActivity, "Fail to Install", Toast.LENGTH_SHORT).show();
                                }

                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                });

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mediaView;
        TextView headline,advertiser,body;
        ImageView icon;
        Button button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mediaView = itemView.findViewById(R.id.ad_media);
            headline = itemView.findViewById(R.id.ad_headline);
            advertiser = itemView.findViewById(R.id.ad_advertiser);
            body = itemView.findViewById(R.id.ad_body);
            icon = itemView.findViewById(R.id.ad_app_icon);
            button = itemView.findViewById(R.id.ad_call_to_action);

        }
    }
}
