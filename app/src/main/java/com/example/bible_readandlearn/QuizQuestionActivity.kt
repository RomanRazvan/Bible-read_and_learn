package com.example.bible_readandlearn

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.question_geneza.*

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener{

    private var mCurrentPosition:Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswers: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.question_geneza)

        mQuestionList = Întrebări_geneza.getQuestions()

        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        tv_option_five.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }
    private fun setQuestion(){

        val întrebare = mQuestionList!![mCurrentPosition - 1]

        defaultOptionsView()


        btn_submit.text =  "Verifică"


        progress_bar.progress =mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progress_bar.max

        tv_raspuns.text = întrebare!!.nimic
        tv_întrebare.text = întrebare!!.question
        tv_option_one.text = întrebare.optionOne
        tv_option_two.text = întrebare.optionTwo
        tv_option_three.text = întrebare.optionThree
        tv_option_four.text = întrebare.optionFour
        tv_option_five.text = întrebare.optionFive

    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0,tv_option_one)
        options.add(1,tv_option_two)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)
        options.add(4,tv_option_five)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {


        when(v?.id){
            R.id.tv_option_one ->{
                selectedOptionView(tv_option_one, 1)
            }
            R.id.tv_option_two ->{
                selectedOptionView(tv_option_two, 2)
            }
            R.id.tv_option_three ->{
                selectedOptionView(tv_option_three, 3)
            }
            R.id.tv_option_four ->{
                selectedOptionView(tv_option_four, 4)
            }
            R.id.tv_option_five ->{
                selectedOptionView(tv_option_five, 5)
            }

            R.id.btn_submit ->{
                val întrebare3 = mQuestionList!![mCurrentPosition - 1]
                tv_raspuns.text = întrebare3!!.nimic
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition ++
                    when{
                        mCurrentPosition <= mQuestionList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this,RezultatActivity::class.java)
                        intent.putExtra(Întrebări_geneza.SCOR,mCorrectAnswers)
                        intent.putExtra(Întrebări_geneza.TOTAL_ÎNTREBĂRI,mQuestionList!!.size)
                        startActivity(intent)
                        }
                    }
                }else{
                    val question = mQuestionList?.get(mCurrentPosition - 1)
                    if(question!!.correctAnswer!=mSelectedOptionPosition){

                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                        val întrebare2 = mQuestionList!![mCurrentPosition - 1]
                        tv_raspuns.text = întrebare2!!.raspuns
                    }else{

                        mCorrectAnswers++
                        val întrebare3 = mQuestionList!![mCurrentPosition - 1]
                        tv_raspuns.text = întrebare3!!.nimic
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionList!!.size){
                        btn_submit.text= "Sfârșit"
                    }else{
                        btn_submit.text = "Următoarea întrebare"

                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }
        //Toast.makeText(this, "Nu ați selectat răspunsul",Toast.LENGTH_SHORT).show()

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                tv_option_one.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 ->{
                tv_option_two.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 ->{
                tv_option_three.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 ->{
                tv_option_four.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg)

    }
}