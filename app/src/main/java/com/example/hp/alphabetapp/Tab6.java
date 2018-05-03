package com.example.hp.alphabetapp;


import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Tab6.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Tab6#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tab6 extends Fragment {
    ImageView play;
    private ImageView logo;
    Button btnTab1;

    MediaPlayer mySong;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Tab6() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab1.
     */
    // TODO: Rename and change types and number of parameters
    public static Tab6 newInstance(String param1, String param2) {
        Tab6 fragment = new Tab6();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab6, container, false);
        play = (ImageView) view.findViewById(R.id.play);
        logo=(ImageView)view.findViewById(R.id.play);
        btnTab1 = (Button)view.findViewById(R.id.btnTabOne);


       // Animation splashAnim = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in_splash);

       // logo.setAnimation(splashAnim);



       /* Thread myThread  =new Thread(){
            @Override
            public void run() {
                try{
                    sleep(3000);
                   *//* Intent intent = new Intent(getActivity(),MainActivity.class);
                    startActivity(intent);*//*
                    //finish();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
*/



      /*  btnTab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Tab2();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().add(R.id.frame_layout,fragment).commit();
            }
        });
*/


        mySong = MediaPlayer.create(getActivity(),R.raw.f);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mySong.start();

            }
        });


        return view;

    }
  /*  public void playIT(View v)
    {
        mySong.start();

    }
*/

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
