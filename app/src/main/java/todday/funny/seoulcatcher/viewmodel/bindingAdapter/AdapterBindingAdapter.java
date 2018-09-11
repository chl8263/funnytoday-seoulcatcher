package todday.funny.seoulcatcher.viewmodel.bindingAdapter;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import todday.funny.seoulcatcher.ui.adapter.ProfileAdapter;

public class AdapterBindingAdapter {
    @BindingAdapter({"setProfileAdapter"})
    public static void setProfileAdapter(RecyclerView view, List<Object> itemList) {

        Context context = view.getContext();
        RecyclerView.Adapter adapter = view.getAdapter();
        if (adapter != null && adapter instanceof ProfileAdapter) {
            Log.e("setWriteImageAdapter", "setItemList");
            adapter.notifyDataSetChanged();
            //  ((HomeListAdapter) adapter).setItemList(itemList);
        } else {
            LinearLayoutManager manager = new LinearLayoutManager(context);
            ProfileAdapter homeListAdapter = new ProfileAdapter(context, itemList);
            homeListAdapter.setHasStableIds(true);
            view.setLayoutManager(manager);
            view.setAdapter(homeListAdapter);
        }
    }
}
