package Adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import fragment.Item_Viewpager_Activity_4_Fragment;

/**
 * Created by wolfsoft3 on 2/8/18.
 */

public class Item_Viewpager_Activity_4_Adapter extends FragmentStatePagerAdapter {
    public Item_Viewpager_Activity_4_Adapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
               Item_Viewpager_Activity_4_Fragment tab1 = new Item_Viewpager_Activity_4_Fragment();
                return tab1;
            case 1:
                Item_Viewpager_Activity_4_Fragment tab2 = new Item_Viewpager_Activity_4_Fragment();
                return tab2;
            case 2:
                Item_Viewpager_Activity_4_Fragment tab3 = new Item_Viewpager_Activity_4_Fragment();
                return tab3;


            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }


}
