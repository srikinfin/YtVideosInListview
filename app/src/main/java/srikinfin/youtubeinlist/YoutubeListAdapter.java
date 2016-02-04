package srikinfin.youtubeinlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Srikanth on 3/2/16.
 */
public class YoutubeListAdapter extends BaseAdapter {

    ArrayList<String> arrayList;
    Context context;

    public YoutubeListAdapter(ArrayList<String> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.list_item, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder();
        viewHolder.webView = (WebView) view.findViewById(R.id.webView);

        viewHolder.webView.setWebViewClient(new WebViewClient());
        viewHolder.webView.getSettings().setJavaScriptEnabled(true);
        viewHolder.webView.loadUrl(arrayList.get(i));


        return view;
    }

    public class ViewHolder {
        private WebView webView;
    }
}
