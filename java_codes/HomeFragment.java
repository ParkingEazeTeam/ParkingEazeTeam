/*
 ParkingEazeTeam

 */

package parking.IOT.syetem.scale.model;


import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;








public class HomeFragment extends Fragment {





        public HomeFragment() {
            // Required empty public constructor
        }

        /**
         * @return A new instance of fragment ContactsFragment.
         */
        public static HomeFragment newInstance() {
            return new HomeFragment();
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View root = inflater.inflate(R.layout.fragment_home, container, false);

            Button b1 = root.findViewById(R.id.vehicle);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), AddVehicle.class);
                    startActivity(intent);


                }

            });


            final Button b2 =root.findViewById(R.id.card);
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), AddCard.class);
                    startActivity(intent);


                }
            });



            return root;
        }
    }
