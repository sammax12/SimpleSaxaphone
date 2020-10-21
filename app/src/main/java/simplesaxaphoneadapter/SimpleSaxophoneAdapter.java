package simplesaxaphoneadapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class SimpleSaxophoneAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> stateFragmentList = new ArrayList<>();
    private ArrayList<String> stateFragmentTitle = new ArrayList<>();

    public SimpleSaxophoneAdapter(FragmentManager fm, Lifecycle lco)
    {
        super(fm, lco);
    }

    public void addFragment(Fragment fragment, String fragmentTitle)
    {
        stateFragmentList.add(fragment);
        stateFragmentTitle.add(fragmentTitle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) { // return the fragment that corresponded to the specific portion
        return stateFragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return stateFragmentTitle.size();
    }
}
