package thiengo.com.br.mobmotors

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import thiengo.com.br.mobmotors.data.Database

class MainActivity : AppCompatActivity(),
        NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )
        setSupportActionBar( toolbar )

        val toggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )

        drawer_layout.addDrawerListener( toggle )
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener( this )

        initRecyclerView()
    }

    /*
     * Método com os códigos de inicialização do RecyclerView,
     * */
    private fun initRecyclerView(){
        rv_vehicles.setHasFixedSize( true )

        val layoutManager = LinearLayoutManager( this )
        rv_vehicles.layoutManager = layoutManager

        rv_vehicles.adapter = CarsAdapter( this, Database.getCars() )
    }

    /*
     * O código dentro de onResume() é um hackcode para que o título da
     * toolbar seja atualizado de forma efetiva.
     * */
    override fun onResume() {
        super.onResume()
        toolbar.title = getString( R.string.page_name )
    }

    override fun onBackPressed() {
        if( drawer_layout.isDrawerOpen( GravityCompat.START ) ) {
            drawer_layout.closeDrawer( GravityCompat.START )
        }
        else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu( menu: Menu ): Boolean {
        menuInflater.inflate( R.menu.main, menu )
        return true
    }

    override fun onNavigationItemSelected( item: MenuItem ): Boolean {

        drawer_layout.closeDrawer( GravityCompat.START )

        /*
         * Retornando false para que o item selecionado se mantenha
         * o mesmo, isso pois o projeto de exemplo funcionará apenas
         * para Carros em oferta.
         * */
        return false
    }
}
