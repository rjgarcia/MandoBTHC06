package ex.extremadura.rafa.mandobt_hc06;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.DevViewHolder> {

    public static class DevViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView devName;
        TextView devMac;
        ImageView devPhotoId;

        DevViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.known);
            devName = (TextView)itemView.findViewById(R.id.dev_name);
            devMac = (TextView)itemView.findViewById(R.id.dev_mac);
            devPhotoId = (ImageView)itemView.findViewById(R.id.dev_photo);
        }
    }

    List<Dev> devs;

    RVAdapter(List<Dev> devs){
        this.devs = devs;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public DevViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        //View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.content_main, viewGroup, false);
        DevViewHolder pvh = new DevViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(DevViewHolder devViewHolder, int i) {
        devViewHolder.devName.setText(devs.get(i).nameBl);
        devViewHolder.devMac.setText(devs.get(i).macBl);
        devViewHolder.devPhotoId.setImageResource(devs.get(i).devPhotoId);
    }

    @Override
    public int getItemCount() {
        return devs.size();
    }
}