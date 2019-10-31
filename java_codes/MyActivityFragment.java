/*
 ParkingEazeTeam

 */
package parking.IOT.syetem.scale.model;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;





public class MyActivityFragment extends Fragment {



    public MyActivityFragment() {
        // Required empty public constructor
    }

    /**
     * @return A new instance of fragment SpeedDialFragment.
     */
    public static MyActivityFragment newInstance() {
        return new MyActivityFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_main, container, false);


        return root;
    }
}

