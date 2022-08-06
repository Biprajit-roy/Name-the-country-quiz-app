package com.example.namethecountry

import java.util.ArrayList

object Constants{

    fun getQuestions():ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()

        //1
        val que1 = Questions(
            1,"Which country the flag belong to?",R.drawable.flag_of_cuba,"Puerto Rico","Colombia","Cuba","Peru",
            3
        )
        questionsList.add(que1)

        //2
        val que2 = Questions(
            2,"Which country the flag belong to?",R.drawable.fiji,"Australia","Fiji","Spain","Armenia",
            2
        )
        questionsList.add(que1)

        //3
        val que3 = Questions(
            3,"Which country the flag belong to?",R.drawable.flag_of_indonesia,"Vietnam","Indonesia","Malaysia","Austria",
            2
        )
        questionsList.add(que3)

        //4
        val que4 = Questions(
            4,"Which country the flag belong to?",R.drawable.flag_of_new_zealand,"USA","Austalia","New Zealand","UK",
            3
        )
        questionsList.add(que4)

        //5
        val que5 = Questions(
            5,"Which country the flag belong to?",R.drawable.flag_of_norway,"Norway","Finland","Poland","Sri Lanka",
            1
        )
        questionsList.add(que5)

        //6
        val que6 = Questions(
            6,"Which country the flag belong to?",R.drawable.flag_of_qatar,"Israel","Hungary","Qatar","Iran",
            3
        )
        questionsList.add(que6)

        //7
        val que7 = Questions(
            7,"Which country the flag belong to?",R.drawable.flag_of_singapore,"Indonesia","Turky","Yemen","Singapore",
            4
        )
        questionsList.add(que7)

        //8
        val que8 = Questions(
            8,"Which country the flag belong to?",R.drawable.flag_of_the_republic_of_china_taiwan,"South Korea","Vietnam","Taiwan","Thailand",
            3
        )
        questionsList.add(que8)

        //9
        val que9 = Questions(
            9,"Which country the flag belong to?",R.drawable.flag_of_venezuela,"venezuela","Nigeria","Portugal","Chile",
            1
        )
        questionsList.add(que9)

        //10
        val que10 = Questions(
            10,"Which country the flag belong to?",R.drawable.flag_of_zimbabwe,"Ireland","Zimbabwe","Mexico","Ghana",
            2
        )
        questionsList.add(que10)

        return questionsList
    }


}