package com.example.bible_readandlearn

object Întrebări_geneza{

    const val TOTAL_ÎNTREBĂRI: String = "total_întrebări"
    const val SCOR: String = "Scor"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Cum a numit Dumnezeu lumina?",
            "zi",
            "strălucire",
            "soare",
            "astru",
                "nu știu",
                "",
            "Geneza 1:5",
            1
        )
        questionList.add(que1)
        // 1

        val que2 = Question(
            2,
            "În a câta zi a creat Dumnezeu omul?",
            "4",
            "5",
            "6",
            "7",
                "nu știu",
                "",
                "Geneza 1:31",
            3
        )
        questionList.add(que2)
        // 2

        val que3 = Question(
            3,
            "Din ce lemn a zis Dumnezeu lui Noe să construiască corabia?",
            "stejar",
            "gofer",
            "salcâm",
            "mesteacăn",
                "nu știu",
                "",
                "Geneza 6:14",
            2
        )
        questionList.add(que3)
        // 3

        val que4 = Question(
            4,
            "Cum se numea prima soția a lui Avram?",
            "Rebeca",
            "Rahela",
            "Agar",
            "Sarai",
                "nu știu",
                "",
                "Geneza 11:29",
            4
        )
        questionList.add(que4)
        // 4

        val que5 = Question(
            5,
            "Câți ani a trăit Avram?",
            "175",
            "147",
            "120",
            "100",
                "nu știu",
                "",
                "Geneza 25:7",
            1
        )
        questionList.add(que5)
        // 5

        val que6 = Question(
            6,
            "Cât timp a muncit Iacov pentru Rahela?",
            "14 zile",
            "7 luni",
            "7 ani",
            "14 ani",
                "nu știu",
                "",
                "Geneza 29:18-30",
            4
        )
        questionList.add(que6)
        // 6

        val que7 = Question(
            7,
            "Ce înseamna numele Dina, singara fată a lui Iacov ?",
            "Fericit",
            "Judecată",
            "Adaos",
            "Ascultare",
                "nu știu",
                "",
                "Geneza 30:21",
            2
        )
        questionList.add(que7)
        // 7

        val que8 = Question(
            8,
            "Cu cât a fost vândut Iosif de către frații săi?",
            "20 de siclii de argint",
            "30 de siclii de argint",
            "40 de siclii de argint",
            "50 de siclii de argint",
                "nu știu",
                "",
                "Geneza 37:28",
            1
        )
        questionList.add(que8)
        // 8

        val que9 = Question(
            9,
            "Cine dintre frații lui Iosif a rămas în Egipt până la a doua întoarcere a fraților lui?",
            "Iuda",
            "Ruben",
            "Simeon",
            "Beniamin",
                "nu știu",
                "",
                "Geneza 42:24",
            3
        )
        questionList.add(que9)
        // 9

        val que10 = Question(
            10,
            "Câți ani a trăit Iosif?",
            "80",
            "99",
            "100",
            "110",
                "nu știu",
                "",
                "Geneza 50:22",
            4
        )
        questionList.add(que10)
        // 10

        return questionList
    }
}