package sg.edu.rp.webservices.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    var msg = ""
    var addmsg2 = 0

    var addchecker = false
    var subchecker = false
    var dividesubchecker = false
    var mulchecker = false
    var msgresult = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            addmsg2 = txtResult.text.toString().toInt()
            msg = ""
            addchecker = true
            txtResult.text = ""
        }

        btnDivide.setOnClickListener {
            addmsg2 = txtResult.text.toString().toInt()
            msg = ""
            dividesubchecker = true
            txtResult.text = ""
        }

        btnSub.setOnClickListener {
            addmsg2 = txtResult.text.toString().toInt()
            msg = ""
            txtResult.text = ""
            subchecker = true
        }

        btnMultiple.setOnClickListener {
            addmsg2 = txtResult.text.toString().toInt()
            msg = ""
            txtResult.text = ""
            mulchecker = true
        }

        btnEquals.setOnClickListener {
            if(addchecker == true){
                txtResult.text = (txtResult.text.toString().toInt() + addmsg2).toString()
                addchecker = false
            }else if(subchecker == true){
                txtResult.text = (txtResult.text.toString().toInt() - addmsg2).toString()
                subchecker = false
            }else if(dividesubchecker == true){
                txtResult.text = (txtResult.text.toString().toInt() / addmsg2).toString()
            }else if(mulchecker == true){
                txtResult.text = (txtResult.text.toString().toInt() * addmsg2).toString()
            }
        }

    }

    fun btnOnClick(view: View){

        val btnSelected = view as Button

        when(btnSelected.id){
            btnNumber0.id -> msg += "0"
            btnNumber1.id -> msg += "1"
            btnNumber2.id -> msg += "2"
            btnNumber3.id -> msg += "3"
            btnNumber4.id -> msg += "4"
            btnNumber5.id -> msg += "5"
            btnNumber6.id -> msg += "6"
            btnNumber7.id -> msg += "7"
            btnNumber8.id -> msg += "8"
            btnNumber9.id -> msg += "9"
            btnAC.id -> msg = ""
            buttonperc.id -> msg = (msg.toInt() /100).toString()

//            btnSub.id -> result = 0
//            btnDivide.id -> result = 0
//            btnDot.id -> result = 0
//            btnPlusMinus.id -> msg = (msg.toInt() /100).toString()
//            btnMultiple.id -> result = 1
        }
        txtResult.text = "$msg"
    }


}