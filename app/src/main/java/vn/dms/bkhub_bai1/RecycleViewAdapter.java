package vn.dms.bkhub_bai1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleViewAdapter extends RecyclerView.Adapter {
    String[] listItem;
    Context mContext;
    public RecycleViewAdapter(Context context,String[] listItem) {
        this.listItem = listItem;
        this.mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_todolist, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ItemViewHolder){
            ((ItemViewHolder) holder).tvcontent.setText(listItem[position]);
        }
    }

    @Override
    public int getItemCount() {
        return listItem.length;
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        public TextView tvcontent;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            tvcontent = itemView.findViewById(R.id.content);
        }
    }
}
