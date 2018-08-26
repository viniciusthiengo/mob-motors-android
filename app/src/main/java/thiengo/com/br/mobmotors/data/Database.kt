package thiengo.com.br.mobmotors.data

import thiengo.com.br.mobmotors.domain.Car
import thiengo.com.br.mobmotors.domain.MoreInfo
import thiengo.com.br.mobmotors.domain.Seller

class Database {
    companion object {
        fun getCars(): List<Car> =
            listOf(
                Car(
                    "Ka",
                    "Ford",
                    7900.0F,
                    "1.0 MPI GL 8V GASOLINA 2P MANUAL",
                    1997,
                    1998,
                    180900,
                    "Manual",
                    Seller("11999887766", "Loja", "São Bernado do Campo (SP)"),
                    MoreInfo(
                        "Vermelho",
                        "Hatchback",
                        9,
                        "Gasolina",
                        "Veículo em Bom Estado, Detalhes Apenas de Uso! Melhor Custo-benefício da Categoria, Super Econômico. Versão GL 1.0 MPI C/ Travas e Vidros Elétricos + Alarme + 4 Pneus Novos. Contate Nossa Central e Fale com um Personal Car Agora Mesmo: Aprovamos seu Crédito em Minutos; Trabalhamos com as Menores Taxas do Mercado; Financiamos Com e Sem Entrada em até 60x; Parcelamos sua Entrada no Cartão de Crédito; Avaliamos seu Carro em Tempo Real; Garantimos a Melhor Avaliação do seu Usado na Troca;"
                    ),
                    listOf(
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/ford-ka-1.0-mpi-gl-8v-gasolina-2p-manual-wmimagem16503502368.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/ford-ka-1.0-mpi-gl-8v-gasolina-2p-manual-wmimagem16503526729.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/ford-ka-1.0-mpi-gl-8v-gasolina-2p-manual-wmimagem16503555610.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/ford-ka-1.0-mpi-gl-8v-gasolina-2p-manual-wmimagem16503590080.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/ford-ka-1.0-mpi-gl-8v-gasolina-2p-manual-wmimagem16503725378.jpg"
                    )
                )
            )
    }
}