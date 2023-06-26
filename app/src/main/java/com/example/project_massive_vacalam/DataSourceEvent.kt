package com.example.project_massive_vacalam

class DataSourceEvent {
    fun getItemDataList(): ArrayList<EventData> {
        val itemList = ArrayList<EventData>()

        // Add items to the list
        itemList.add(
            EventData(
                R.drawable.event1,
                "Festival Kuliner Krakatau",
                "Taman Engal, Bandar Lampung",
                "Festival Krakatau sendiri digelar untuk mengenang peristiwa meletusnya Gunung Krakatau pada 26-27 Agustus 1883 dimana termasuk salah satu letusan gunung api terbesar di muka Bumi.",
                listOf(R.drawable.event1_1, R.drawable.event1_2, R.drawable.event1_3, R.drawable.event1_4, R.drawable.event1_5, R.drawable.event1)
            )
        )
        itemList.add(
            EventData(
                R.drawable.event2,
                "Festival Sarapan Pagi",
                "Taman Gajah, Kota Bandar Lampung",
                "Festival itu merupakan bagian dari Road to Lampung Krakatau Festival Untuk menumbuhkan pariwisata Lampung, Pemprov berkomitmen memperbanyak even pariwisata. Sebab kunci pariwisata adalah even, karena melalui even juga bisa menyampaikan informasi kepada masyarakat..",
                listOf(R.drawable.event2_1, R.drawable.event2_2, R.drawable.event2_3, R.drawable.event2_4, R.drawable.event2_5, R.drawable.event2_6)
            )
        )
        itemList.add(
            EventData(
                R.drawable.event3,
                "Festival Teluk Stabas",
                "Kab. Pesisir Barat, Lampung",
                "    Nama Teluk Stabas diambil dari salah satu kawasan Teluk di Krui-Lambar yang menjadi tempat berlabuh kapal Belanda dan asing di sana sejak zaman dulu, sehingga terus digunakan namanya karena telah dikenal kalangan dunia internasional\n" +
                        " Festival Teluk Stabas adalah event tahunan yang diselanggarakan oleh Pemerintah Lampung Barat. festival ini juga sering disebut dengan festival sekura. Di festival ini merupakan suatu wadah untuk menampilkan kesenian yang ada di Lampung Barat sepeti tarian dan seni lainnya.",
                listOf(R.drawable.event3_1, R.drawable.event3_2, R.drawable.event3_3, R.drawable.event3_4)
            )
        )

        itemList.add(
            EventData(
                R.drawable.event4,
                "Lampung Krakatau Festival",
                "Lampung, Krakatau",
                "Festival yang menjadi salah satu kebanggaan pariwisata Lampung ini biasa digelar setiap tahunnya sejak tahun 1990.Apa tujuan di adakan festival Krakatau?\n" +
                        "Festival Krakatau sendiri digelar untuk mengenang peristiwa meletusnya Gunung Krakatau pada 26-27 Agustus 1883 dimana termasuk salah satu letusan gunung api terbesar di muka Bumi.",
                listOf(R.drawable.event4_1, R.drawable.event4_2, R.drawable.event4_3, R.drawable.event4_4)
            )
        )
        itemList.add(
            EventData(
                R.drawable.event5,
                "Festival Way Kambas",
                "Taman Nasional Way Kambas.",
                "      Festival Way Kambas merupakan agenda wisata yang digelar Pemerintah Kabupaten (Pemkab) Lampung Timur (Lamtim). Festival Way Kambas dilaksanakan pertama kali pada 2016. Agenda wisata tahunan tersebut diadakan setiap bulan November. Gelaran Festival Way Kambas dipusatkan di Taman Nasional Way Kambas (TNWK). Festival Way Kambas adalah acara promosi pariwisata, seni, dan budaya daerah serta kampanye konservasi yang diharapkan acara tersebut membawa wisatawan ke daerah Lampung Timur. Festival way Kambas merupakan acara promosi wisata unggulan kementerian pariwisata, acara tersebut akan rutin digelar setiap tahunnya.\n" +
                        "             Pada 2018, Festival Way Kambas berlangsung pada 9-11 November 2018. Pada hari pertama, festival berisi parade budaya dari 24 kecamatan di Lamtim, festival kuliner, jejak petualang, dan Forest Photography Festival. Berikutnya pada hari kedua, acara berupa lomba kreasi souvenir, Way Kambas 10K, Sketsa Way Kambas, Mocaf Colour Fun, Jalan-jalan 4x4, Way Kambas Adventure Trail, Lomba Tari Kreasi dan Lomba Tari Bali, Parade Band Way Kambas, serta Tari Melinting Massal. Pada hari terakhir, agenda acara berupa Way Kambas Idol, Lomba Tari Bedana dan Tari Bedana Massal, Festival Buah Nusantara, Festival Motor Antik, Fun Bike/Sepeda Nusantara dan XC/MTB, serta Mocaf Colour Kamba\n",
                listOf(R.drawable.event5_1, R.drawable.event5_2, R.drawable.event5_3, R.drawable.event5_4)
            )
        )
        itemList.add(
            EventData(
                R.drawable.event6,
                "Bamboo Rafting Way Besay",
                "Kab Lampung Selatan.",
                " Festival ini merupakan kegiatan menyusuri Sungai Way Besay menggunakan rakitan bambu, mulai dari kampung wisata Banjar Masin ke Banjar Sari di Kecamatan Baradatu, Kabupten Way Kanan.Ini merupakan salah satu kegiatan yang dilakukan masyarakat Lampung untuk memperingati Hari Ulang Tahun Republik Indonesia setiap tahunnya.Untuk itu, rafting dilakukan dengan menyematkan bendera Merah Putih dalam setiap rakit bambu yang akan berjalan menyusuri Sungai Way Besay dengan panjang sekitar 12 kilometer. Adapun dalam satu rakit, biasanya diisi oleh empat sampai lima orang peserta. Lalu, mereka akan diberikan jaket keselamatan dan dua bilah bambu untuk menjalankan rakit.Sembari menyusuri Sungai Way Besay, para peserta rafting ini dapat menikmati keindahan alam hutan Lampung yang masih asri.     ",
                listOf(R.drawable.event6_1, R.drawable.event6_2, R.drawable.event6_3, R.drawable.event6)
            )
        )
        itemList.add(
            EventData(
                R.drawable.event7,
                "Lampung Fashion Week",
                "Kab. Lampung Barat.",
                "          Seperti pekan pameran fashion (fashion week) pada umumnya, Lampung rupanya juga punya acara serupa. Pembedanya, sebagai acara daerah, fashion week ini mengedepankan nama-nama desainer lokal.Tujuannya, agar memberi ruang bagi desainer lokal untuk mengembangkan dan mengenalkan ide-ide berbusananya ke masyarakat.Selain mengangkat nama-nama desainer lokal, pagelaran fashion show ini juga mengangkat kain khas sekaligus kebanggaan masyarakat Lampung.\n" +
                        "       Bila masyarakat Jawa punya kain Batik, masyarakat Lampung punya kain Tapis. Tapis sendiri merupakan kain tenun dengan kebanyakan motif berupa alam, flora, dan fauna.Untuk melihat pagelaran Lampung Fashion Week ini, turis bisa mengunjungi pusat perbelanjaan di kota Bandar Lampung pada minggu pertama bulan November setiap tahunnya dan gratis.",
                listOf(R.drawable.event7_1, R.drawable.event7_2, R.drawable.event7_3, R.drawable.event7_4)
            )
        )
        itemList.add(
            EventData(
                R.drawable.event8,
                "Festival Sekala Bekhak",
                "Lampung Barat.",
                "Festival Sekala Bekhak merupakan event tahunan Pemerintah Kabupaten Lampung Barat yang diselenggarakan pada setiap tahun, perhelatan ini menitikberatkan kepada kebudayaan asli masyarakat Lampung Barat, selain itu menjadi pendamping dari kegiatan budaya tersebut, kami juga menjual keindahan alam dengan kealamiannya, sehingga menjadi satu paket yang saling mengisi, dengan yaitu “Menikmati Alam dan Budaya”, Enjoy the Nature and Culture.",
                listOf(R.drawable.event8_1, R.drawable.event8_2, R.drawable.event8_3, R.drawable.event8_4)
            )
        )
        itemList.add(
            EventData(
                R.drawable.event9,
                "Festival Teluk Semangka",
                "Kabupaten Tenggamus.",
                "Sebuah gelaran seni dan budaya, Festival Teluk Semaka di Kabupaten Tanggamus, Lampung. kembali dihelat di Kabupaten Tanggamus, Lampung. Beragam tarian tradisional ditampilkan dan diharapkan ajang ini bisa menjadi alat untuk kian meningkatkan angka wisatawan. salah satu kabupaten di Provinsi Lampung menyelenggarakan event seni budaya dan pariwisata tahunan daerah yang bertajuk Festival Teluk Semaka. Dalam penyelenggaraannya yang ke tujuh di tahun ini, Pemerinah Daerah tampak berupaya semaksimal mungkin mengangkat beragam seni budaya yang berakar dari masyarakat asli Tanggamus hingga memperkenalkan beragam object wisata unggulan di kabupaten yang bagian selatan nya berbatasan langsung dengan samudera hindia tersebut. ",
                listOf(R.drawable.event9_1, R.drawable.event9_2, R.drawable.event9_3, R.drawable.event9_4)
            )
        )
        // Add more items as needed

        return itemList
    }
}