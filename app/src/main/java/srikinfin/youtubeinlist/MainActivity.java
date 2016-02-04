package srikinfin.youtubeinlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("http://www.youtube.com/embed/dO1rMeYnOmM?&rel=0&fs=0&showinfo=0&disablekb=1&modestbranding=1&controls=0&autohide=1");
        arrayList.add("http://www.youtube.com/embed/dO1rMeYnOmM?&rel=0&fs=0&showinfo=0&disablekb=1&modestbranding=1&controls=0&autohide=1");

        YoutubeListAdapter youtubeAdapter = new YoutubeListAdapter(arrayList, this);
        listView.setAdapter(youtubeAdapter);
    }


}
