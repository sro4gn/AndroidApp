package com.example.savannaholson.androidapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class BucketListAdapter extends RecyclerView.Adapter<BucketListAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView dateTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            titleTextView = (TextView) itemView.findViewById(R.id.bucket_item_title);
            dateTextView = (TextView) itemView.findViewById(R.id.bucket_item_date);
        }
    }

    private List<BucketItem> bucketList;
    private Context context;

    public BucketListAdapter(Context c, List<BucketItem> items) {
        bucketList = items;
        context = c;
    }

    @Override
    public BucketListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View BucketItemView = inflater.inflate(R.layout.bucket_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(BucketItemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BucketListAdapter.ViewHolder viewHolder, int position) {
        BucketItem bucketItem= bucketList.get(position);
        TextView textView1 = viewHolder.titleTextView;
        textView1.setText(bucketItem.getTitle());
        TextView textView2 = viewHolder.dateTextView;
        textView2.setText(bucketItem.getDate());
    }

    @Override
    public int getItemCount() {
        return bucketList.size();
    }


}
