package thiengo.com.br.mobmotors

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.makeramen.roundedimageview.RoundedImageView
import com.squareup.picasso.Picasso
import thiengo.com.br.mobmotors.domain.Car

class CarsAdapter(
        private val context: Context,
        private val cars: List<Car> ) :
        RecyclerView.Adapter<CarsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int ) : CarsAdapter.ViewHolder {

        val v = LayoutInflater
            .from( context )
            .inflate( R.layout.car, parent, false )

        return ViewHolder( v )
    }

    override fun onBindViewHolder(
            holder: ViewHolder,
            position: Int ) {

        holder.setData( cars[ position ] )
    }

    override fun getItemCount(): Int {
        return cars.size
    }

    inner class ViewHolder( itemView: View ) :
            RecyclerView.ViewHolder( itemView ),
            View.OnClickListener {

        var rivCarThumb: RoundedImageView
        var tvNameBrand: TextView
        var tvShortDescription: TextView
        var tvYearProdModel: TextView
        var tvKilometers: TextView
        var tvCarChanges: TextView
        var tvPlace: TextView
        var tvPlaceFull: TextView
        var tvPrice: TextView

        init {
            itemView.setOnClickListener( this )

            rivCarThumb = itemView.findViewById( R.id.iv_car_thumb )
            tvNameBrand = itemView.findViewById( R.id.tv_name_brand )
            tvShortDescription = itemView.findViewById( R.id.tv_short_description )
            tvYearProdModel = itemView.findViewById( R.id.tv_year_prod_model )
            tvKilometers = itemView.findViewById( R.id.tv_kilometers )
            tvCarChanges = itemView.findViewById( R.id.tv_car_changes )
            tvPlace = itemView.findViewById( R.id.tv_place )
            tvPlaceFull = itemView.findViewById( R.id.tv_place_full )
            tvPrice = itemView.findViewById( R.id.tv_price )
        }

        fun setData( car: Car ) {

            /*
             * A API Picasso já se encarrega de realizar o cache de
             * imagem e todas as outras tarefas para evitar o vazamento
             * de memória.
             * */
            Picasso
                .get()
                    .load( car.getMainImage() )
                    .into( rivCarThumb )

            rivCarThumb.contentDescription = car.carLabel()

            tvNameBrand.text = car.carLabel()
            tvShortDescription.text = car.shortDescription
            tvYearProdModel.text = car.yearProdModelLabel()
            tvKilometers.text = car.kilometersLabel()
            tvCarChanges.text = car.carChanges
            tvPlace.text = car.seller.type
            tvPlaceFull.text = car.seller.cityState
            tvPrice.text = car.priceLabel()
        }

        /*
         * Para abrir a atividade de detalhes de carro.
         * */
        override fun onClick( view: View ) {
            val intent = Intent( context, DetailsActivity::class.java )

            intent.putExtra( Car.KEY, cars[ adapterPosition ] )
            context.startActivity( intent )
        }
    }
}