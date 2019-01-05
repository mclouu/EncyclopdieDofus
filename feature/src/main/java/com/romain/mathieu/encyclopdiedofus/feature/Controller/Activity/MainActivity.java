package com.romain.mathieu.encyclopdiedofus.feature.Controller.Activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.romain.mathieu.encyclopdiedofus.feature.Controller.Fragment.EquipementFragment;
import com.romain.mathieu.encyclopdiedofus.feature.Controller.Fragment.MountsFragment;
import com.romain.mathieu.encyclopdiedofus.feature.Controller.Fragment.PetsFragment;
import com.romain.mathieu.encyclopdiedofus.feature.Controller.Fragment.WeaponsFragment;
import com.romain.mathieu.encyclopdiedofus.feature.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Fragment fragmentMounts;
    private Fragment fragmentEquipement;
    private Fragment fragmentPets;
    private Fragment weaponsFragment;

    public static final int FRAGMENT_EQUIPEMENT = 0;
    public static final int FRAGMENT_MOUNTS = 2;
    public static final int FRAGMENT_WEAPONS = 3;
    public static final int FRAGMENT_PETS = 4;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "TDB !! mega TDB !!!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        // 6 - Show fragment after user clicked on a menu item
        if (id == R.id.equipement) {
            this.showFragment(FRAGMENT_EQUIPEMENT);

        } else if (id == R.id.mounts) {
            this.showFragment(FRAGMENT_MOUNTS);

        } else if (id == R.id.weapons) {
            this.showFragment(FRAGMENT_WEAPONS);

        } else if (id == R.id.pets) {
            this.showFragment(FRAGMENT_PETS);

        } else {
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    // ---------------------
    // FRAGMENTS
    // ---------------------

    // 5 - Show fragment according an Identifier

    private void showFragment(int fragmentIdentifier) {
        switch (fragmentIdentifier) {
            case FRAGMENT_EQUIPEMENT:
                this.showEquipementFragment();
                break;
            case FRAGMENT_MOUNTS:
                this.showMountsFragment();
                break;
            case FRAGMENT_WEAPONS:
                this.showWeaponsFragment();
                break;
            case FRAGMENT_PETS:
                this.showPetsFragment();
                break;
            default:
                break;
        }
    }

    // 4 - Create each fragment page and show it

    private void showEquipementFragment() {
        if (this.fragmentEquipement == null)
            this.fragmentEquipement = EquipementFragment.newInstance();
        this.startTransactionFragment(this.fragmentEquipement);
    }

    private void showMountsFragment() {
        if (this.fragmentMounts == null)
            this.fragmentMounts = MountsFragment.newInstance();
        this.startTransactionFragment(this.fragmentMounts);
    }

    private void showWeaponsFragment() {
        if (this.weaponsFragment == null)
            this.weaponsFragment = WeaponsFragment.newInstance();
        this.startTransactionFragment(this.weaponsFragment);
    }

    private void showPetsFragment() {
        if (this.fragmentPets == null)
            this.fragmentPets = PetsFragment.newInstance();
        this.startTransactionFragment(this.fragmentPets);
    }

    // 3 - Generic method that will replace and show a fragment inside the MainActivity Frame Layout

    private void startTransactionFragment(Fragment fragment) {
        if (!fragment.isVisible()) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.activity_main_frame_layout, fragment).commit();
        }
    }


}
