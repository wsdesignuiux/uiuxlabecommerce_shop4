package fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wolfsoft3.uiux_lab_ecommerce.R;

/**
 * Created by wolfsoft3 on 12/9/18.
 */

public class Item_Viewpager_Activity_4_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_viewpager_activity_4,container,false);


        return view;
    }
}
