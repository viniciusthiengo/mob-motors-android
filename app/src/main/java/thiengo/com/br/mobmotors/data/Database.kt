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
                        "Veículo em Bom Estado, Detalhes Apenas de Uso! " +
                                "Melhor Custo-benefício da Categoria, Super Econômico. " +
                                "Versão GL 1.0 MPI C/ Travas e Vidros Elétricos + Alarme " +
                                "+ 4 Pneus Novos. Contate Nossa Central e Fale com um " +
                                "Personal Car Agora Mesmo: Aprovamos seu Crédito em Minutos; " +
                                "Trabalhamos com as Menores Taxas do Mercado; Financiamos Com " +
                                "e Sem Entrada em até 60x; Parcelamos sua Entrada no Cartão " +
                                "de Crédito; Avaliamos seu Carro em Tempo Real; Garantimos " +
                                "a Melhor Avaliação do seu Usado na Troca;"
                    ),
                    listOf(
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/ford-ka-1.0-mpi-gl-8v-gasolina-2p-manual-wmimagem16503502368.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/ford-ka-1.0-mpi-gl-8v-gasolina-2p-manual-wmimagem16503526729.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/ford-ka-1.0-mpi-gl-8v-gasolina-2p-manual-wmimagem16503555610.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/ford-ka-1.0-mpi-gl-8v-gasolina-2p-manual-wmimagem16503590080.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/ford-ka-1.0-mpi-gl-8v-gasolina-2p-manual-wmimagem16503725378.jpg"
                    )
                ),
                Car(
                    "106",
                    "Peugeot",
                    7900.0F,
                    "1.0 XN 8V GASOLINA 4P MANUAL",
                    1994,
                    1995,
                    189200,
                    "Manual",
                    Seller("11999887766", "Loja", "São Bernado do Campo (SP)"),
                    MoreInfo(
                        "Branco",
                        "Hatchback",
                        9,
                        "Gasolina",
                        "Veículo 2º Dono, Muito Bem Conservado por Conta do Ano. " +
                                "Apenas 106 Unidades Fabricadas no Brasil, Super Raro! Edição " +
                                "Limitada Kid 1.0 4pts C/ Bancos de Couro Azul, Imperdível. " +
                                "Exemplar Ótimo Para Colocar Placa Preta, Perfeito Para " +
                                "Colecionadores. Contate Nossa Central e Fale com um Personal " +
                                "Car Agora Mesmo: Aprovamos seu Crédito em Minutos; " +
                                "Trabalhamos com as Menores Taxas do Mercado; Financiamos " +
                                "Com e Sem Entrada em até 60x; Parcelamos sua Entrada no Cartão " +
                                "de Crédito;"
                    ),
                    listOf(
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180811/peugeot-106-1.0-xn-8v-gasolina-4p-manual-wmimagem11320892426.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180811/peugeot-106-1.0-xn-8v-gasolina-4p-manual-wmimagem11320925461.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180811/peugeot-106-1.0-xn-8v-gasolina-4p-manual-wmimagem11320981874.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180811/peugeot-106-1.0-xn-8v-gasolina-4p-manual-wmimagem11321041354.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180811/peugeot-106-1.0-xn-8v-gasolina-4p-manual-wmimagem11321068786.jpg"
                    )
                ),
                Car(
                    "Tempra",
                    "FIAT",
                    8900.0F,
                    "2.0 IE 8V GASOLINA 4P MANUAL",
                    1995,
                    1995,
                    157800,
                    "Manual",
                    Seller("11999887766", "Loja", "Serra (ES)"),
                    MoreInfo(
                        "Cinza",
                        "Sedã",
                        3,
                        "Gasolina",
                        "Veículo Muito Bem Conservado, Realmente Diferenciado! " +
                                "Primeiro Que Ver Fecha Negócio, Preço Sensacional. Versão " +
                                "SX 2.0 IE C/ DH/TE/VE + Alarme + Faróis de Milha + Rodas. " +
                                "Contate Nossa Central e Fale com um Personal Car Agora " +
                                "Mesmo: Aprovamos seu Crédito em Minutos; Trabalhamos com " +
                                "as Menores Taxas do Mercado; Financiamos Com e Sem Entrada " +
                                "em até 60x; Parcelamos sua Entrada no Cartão de Crédito; " +
                                "Avaliamos seu Carro em Tempo Real; Garantimos a Melhor " +
                                "Avaliação do seu Usado na Troca; Outros Opcionais: Farol " +
                                "de neblina, MP3 Player."
                    ),
                    listOf(
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/fiat-tempra-2.0-ie-8v-gasolina-4p-manual-wmimagem16492872565.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/fiat-tempra-2.0-ie-8v-gasolina-4p-manual-wmimagem16492938637.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/fiat-tempra-2.0-ie-8v-gasolina-4p-manual-wmimagem16492975328.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/fiat-tempra-2.0-ie-8v-gasolina-4p-manual-wmimagem16493017038.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201808/20180810/fiat-tempra-2.0-ie-8v-gasolina-4p-manual-wmimagem16493056165.jpg"
                    )
                ),
                Car(
                    "Celta",
                    "Chevrolet",
                    8990.0F,
                    "1.0 MPFI VHC 8V GASOLINA 2P MANUAL",
                    2002,
                    2003,
                    199000,
                    "Manual",
                    Seller("11999887766", "Loja", "Vitória (ES)"),
                    MoreInfo(
                        "Azul",
                        "Hatchback",
                        8,
                        "Gasolina",
                        "SPINER MOTORS, SEU JEITO INTELIGENTE DE COMPRAR E " +
                                "VENDER CARRO !!! Veículo em Bom Estado, Detalhes a Serem " +
                                "Feitos. Excelente Custo-benefício, Vale a Pena Conferir. " +
                                "Versão VHC 2pts Básico, Preço Sensacional. Contate Nossa " +
                                "Central e Fale com um Personal Car Agora Mesmo: Aprovamos " +
                                "seu Crédito em Minutos; Trabalhamos com as Menores Taxas " +
                                "do Mercado; Financiamos Com e Sem Entrada em até 60x; " +
                                "Parcelamos sua Entrada no Cartão de Crédito; Avaliamos seu " +
                                "Carro em Tempo Real;"
                    ),
                    listOf(
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201804/20180428/chevrolet-celta-1.0-mpfi-vhc-8v-gasolina-2p-manual-wmimagem15534633290.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201804/20180428/chevrolet-celta-1.0-mpfi-vhc-8v-gasolina-2p-manual-wmimagem15534842822.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201804/20180428/chevrolet-celta-1.0-mpfi-vhc-8v-gasolina-2p-manual-wmimagem15534666961.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201804/20180428/chevrolet-celta-1.0-mpfi-vhc-8v-gasolina-2p-manual-wmimagem15535103319.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201804/20180428/chevrolet-celta-1.0-mpfi-vhc-8v-gasolina-2p-manual-wmimagem15534692958.jpg"
                    )
                ),
                Car(
                    "Palio",
                    "FIAT",
                    9900.0F,
                    "1.0 MPI 6M WEEKEND 8V GASOLINA 4P MANUAL",
                    1999,
                    2000,
                    317400,
                    "Manual",
                    Seller("11999887766", "Loja", "Fortaleza (CE)"),
                    MoreInfo(
                        "Cinza",
                        "Perua/SW",
                        0,
                        "Gasolina",
                        "Veículo em Bom Estado, Vale a Pena Conferir! Primeiro " +
                                "Que Ver Fecha Negócio, Ótimo Custo-benefício. Versão " +
                                "Weekend 1.0 6 Marchas C/ DH/TE/VE + Alarme + Rodas, Preço " +
                                "Imperdível. Contate Nossa Central e Fale com um Personal " +
                                "Car Agora Mesmo: Aprovamos seu Crédito em Minutos; " +
                                "Trabalhamos com as Menores Taxas do Mercado; Financiamos " +
                                "Com e Sem Entrada em até 60x; Parcelamos sua Entrada no " +
                                "Cartão de Crédito; Avaliamos seu Carro em Tempo Real; " +
                                "Garantimos a Melhor Avaliação do seu Usado na Troca; Outros " +
                                "Opcionais: MP3 Player."
                    ),
                    listOf(
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201807/20180704/fiat-palio-1.0-mpi-6m-weekend-8v-gasolina-4p-manual-wmimagem19135786445.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201807/20180704/fiat-palio-1.0-mpi-6m-weekend-8v-gasolina-4p-manual-wmimagem19135872522.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201807/20180704/fiat-palio-1.0-mpi-6m-weekend-8v-gasolina-4p-manual-wmimagem19135816796.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201807/20180704/fiat-palio-1.0-mpi-6m-weekend-8v-gasolina-4p-manual-wmimagem19135895798.jpg",
                        "https://image.webmotors.com.br/_fotos/anunciousados/gigante/2018/201807/20180704/fiat-palio-1.0-mpi-6m-weekend-8v-gasolina-4p-manual-wmimagem19135843541.jpg"
                    )
                )
            )
    }
}