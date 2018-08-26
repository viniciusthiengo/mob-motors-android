package thiengo.com.br.mobmotors

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.content_details.*
import thiengo.com.br.mobmotors.domain.Car


class DetailsActivity : AppCompatActivity() {

    lateinit var car: Car

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_details )
        setSupportActionBar( toolbar )

        supportActionBar?.setDisplayHomeAsUpEnabled( true )

        car = intent.getParcelableExtra( Car.KEY )

        /*
         * Dados do carro.
         * */
        tv_short_description.text = car.shortDescription
        tv_year_prod_model.text = car.yearProdModelLabel()
        tv_kilometers.text = car.kilometersLabel()
        tv_car_changes.text = car.carChanges
        tv_price.text = car.priceLabel()

        /*
         * Dados do vendedor.
         * */
        tv_place.text = car.seller.type
        tv_place_full.text = car.seller.cityState
        tv_phone.text = car.seller.phoneLabel()

        /*
         * Mais informações
         * */
        tv_color_value.text = car.moreInfo.color
        tv_bodywork_value.text = car.moreInfo.bodyWork
        tv_plate_value.text = car.moreInfo.finalPlate.toString()
        tv_gas_value.text = car.moreInfo.gas
        tv_full_description.text = car.moreInfo.fullDescription

        /*
         * Imagens.
         * */
            /*
             * principal
             * */
            Picasso.get().load( car.getMainImage() ).into( iv_car )

            Picasso.get().load( car.imagesUrl[1] ).into( iv_car_thumb_01 )
            Picasso.get().load( car.imagesUrl[2] ).into( iv_car_thumb_02 )
            Picasso.get().load( car.imagesUrl[3] ).into( iv_car_thumb_03 )
            Picasso.get().load( car.imagesUrl[4] ).into( iv_car_thumb_04 )
    }

    override fun onResume() {
        super.onResume()
        toolbar.title = car.carLabel()
    }

    override fun onCreateOptionsMenu( menu: Menu): Boolean {
        menuInflater.inflate( R.menu.details, menu )
        return true
    }

    override fun onOptionsItemSelected( item: MenuItem ): Boolean {
        /*
         * Mesmo tendo somente uma opção no menu detaisl.xml, ainda
         * é preciso o condicional neste método, pois a seta de
         * "back button" ao topo esquerda da tela também invocará o
         * onOptionsItemSelected().
         * */
        if( item.itemId == R.id.action_call ){
            callSeller( null )
        }
        return super.onOptionsItemSelected(item)
    }

    /*
     * Método responsável invocar o aplicativo de ligação, já com o
     * número do vendedor pronto para ser chamado.
     * */
    fun callSeller( view: View? ){
        val intent = Intent(
            Intent.ACTION_DIAL,
            Uri.parse("tel:" + car.seller.phone )
        )

        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity( intent )
    }

    /*
     * Método responsável por abrir o DialogFragment que controla a
     * apresentação das imagens em modo "albúm".
     * */
    fun openAlbum( view: View ){
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = ImageDialogFragment()
        val bundle = Bundle()

        /*
         * Obtendo o posicionamento da imagem acionada, pois é ela
         * que inicialmente será carregada no ImageDialogFragment.
         * */
        val imagePosition = when( view.id ){
            R.id.iv_car_thumb_01 -> 1
            R.id.iv_car_thumb_02 -> 2
            R.id.iv_car_thumb_03 -> 3
            R.id.iv_car_thumb_04 -> 4
            else -> 0
        }

        bundle.putParcelable( Car.KEY, car )
        bundle.putInt( Car.KEY_IMAGE, imagePosition )

        fragment.arguments = bundle
        fragment.show( transaction, ImageDialogFragment.KEY )
    }
}
