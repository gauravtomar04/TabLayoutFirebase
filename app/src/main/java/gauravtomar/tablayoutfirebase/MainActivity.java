package gauravtomar.tablayoutfirebase;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import gauravtomar.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

 //   String s[]={ist, doo, teen};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        TabLayout tb=(TabLayout) findViewById(R.id.tabs);
        TabLayout.Tab First = tb.newTab();
        First.setText("Guru");
        tb.addTab(First);

        TabLayout.Tab Teen = tb.newTab();
        Teen.setText("Gauravji");
        tb.addTab(Teen);

        TabLayout.Tab Sec = tb.newTab();
        Sec.setText("Gaurav");
        tb.addTab(Sec);

        ViewPager vp=(ViewPager) findViewById(R.id.viewpager);
        setSupportActionBar(toolbar);


    }
    void setUpViewPager(){
    ViewPagerAdapter viewPager= new ViewPagerAdapter(getSupportFragmentManager());

    }
}