package edu.cs4730.guidemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Text_Fragment extends Fragment {
    String TAG = "Text_fragment";
    
    TextView tx;
    
	public Text_Fragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "OnCreate");

	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG, "OnActivityCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Log.d("Left", "OnCreateView");
		View view = inflater.inflate(R.layout.text_fragment, container, false);
		tx = (TextView) view.findViewById(R.id.big);
		tx.setText("Large TextView");
		return view;
	}
}
