package demo.eric.fragdemo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by caoqiulin on 2019-09-14.
 */
public class SecondFragment extends Fragment {

    private Activity mActivity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (Activity) context;
        System.out.println("SecondFragment onAttach");
    }

    @Override
    public void onPause() {
        super.onPause();

        System.out.println("SecondFragment onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("SecondFragment onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("SecondFragment onDestroyView");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_second, container, false);
        root.findViewById(R.id.tvSecond).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .remove(new SecondFragment()).commit();
            }
        });


        System.out.println("SecondFragment onCreateView");
        return root;
    }
}
