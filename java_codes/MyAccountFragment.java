/*
 ParkingEazeTeam

 */
package parking.IOT.syetem.scale.model;



import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;



import com.google.android.material.snackbar.Snackbar;

public class MyAccountFragment extends Fragment {







    public MyAccountFragment() {
        // Required empty public constructor

    }

    /**
     * @return A new instance of fragment RecentsFragment.
     */
    public static MyAccountFragment newInstance() {
        return new MyAccountFragment();
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
