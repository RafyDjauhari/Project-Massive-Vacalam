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
        // Add more items as needed

        return itemList
    }
}