package gauravtomar;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    final ArrayList<Fragment> fragmentlist = new ArrayList<>();
    final ArrayList<String> title = new ArrayList<>();

    public ViewPagerAdapter( FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        return fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return fragmentlist.size();
    }

    void addFragment(Fragment fragment, String title){
        fragmentlist.add(fragment);
        this.title.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
