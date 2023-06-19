package com.example.project_massive_vacalam

class DataSourceEvent {
    fun getItemDataList(): ArrayList<EventData> {
        val itemList = ArrayList<EventData>()

        // Add items to the list
        itemList.add(
            EventData(
                R.drawable.bukit_sakura,
                "Bukit Sakura",
                "Kec. Langkapura, Kota Bandar Lampung, Lampung",
                "Dinamakan Pantai Gigi Hiu sebab memiliki bebatuan karang yang bentuknya tajam layaknya gigi hiu. Selain itu, pantai ini pula disebut sebagai Pantai Batu Layar oleh masyarakat sekitar. Karena adanya batuan yang mengembang sehingga terbentuk seperti layar pada perahu. Pantai ini dipenuhi dengan batu-batu karang yang artistik menumpuk di sepanjang bibir pantai. Hal ini pula menjadi ciri khas dari pantai ini karena tidak ditemukan di pantai lainnya.",
                listOf(R.drawable.bukit_sakura, R.drawable.gigi_hiu, R.drawable.kebun_karet_trikora, R.drawable.bukit_sakura, R.drawable.gigi_hiu, R.drawable.kebun_karet_trikora)
            )
        )
        itemList.add(
            EventData(
                R.drawable.gigi_hiu,
                "Gigi Hiu",
                "Kec. Jati Agung, Kabupaten Lampung Selatan",
                "Dinamakan Pantai Gigi Hiu sebab memiliki bebatuan karang yang bentuknya tajam layaknya gigi hiu. Selain itu, pantai ini pula disebut sebagai Pantai Batu Layar oleh masyarakat sekitar. Karena adanya batuan yang mengembang sehingga terbentuk seperti layar pada perahu. Pantai ini dipenuhi dengan batu-batu karang yang artistik menumpuk di sepanjang bibir pantai. Hal ini pula menjadi ciri khas dari pantai ini karena tidak ditemukan di pantai lainnya.",
                listOf(R.drawable.bukit_sakura, R.drawable.gigi_hiu, R.drawable.kebun_karet_trikora)
            )
        )
        itemList.add(
            EventData(
                R.drawable.kebun_karet_trikora,
                "Kebun Karet Trikora",
                "Kec. Jati Agung, Kabupaten Lampung Selatan",
                "Dinamakan Pantai Gigi Hiu sebab memiliki bebatuan karang yang bentuknya tajam layaknya gigi hiu. Selain itu, pantai ini pula disebut sebagai Pantai Batu Layar oleh masyarakat sekitar. Karena adanya batuan yang mengembang sehingga terbentuk seperti layar pada perahu. Pantai ini dipenuhi dengan batu-batu karang yang artistik menumpuk di sepanjang bibir pantai. Hal ini pula menjadi ciri khas dari pantai ini karena tidak ditemukan di pantai lainnya.",
                listOf(R.drawable.bukit_sakura, R.drawable.gigi_hiu, R.drawable.kebun_karet_trikora)
            )
        )
        // Add more items as needed

        return itemList
    }
}