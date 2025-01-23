package com.example.vtmdiceroller
import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.vtmdiceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        //setContentView(R.layout.activity_main)
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
         //   val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
           // v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            //insets
        //}
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            var difficulty: Int = (binding.editTextText.text).toString().toInt()
            var numDice: Int = (binding.editText.text).toString().toInt()
            var outputt = (difficulty - numDice)

            var arrList = arrayListOf<Int>()
            var diceNumbers: String = ""
            for(i in 0 until numDice){
                var randomNumber = (1..10).random()
                arrList.add(randomNumber)
            }
            arrList.sort()
            for(i in 0 until numDice){
                diceNumbers += arrList.get(i).toString()+" "
            }
            var successes: Int = 0
            var size: Int = arrList.size
            var tens: Int = 0
            // counts the number of tens after the ones will remove some of them
            for(i in 0 until size){
                if(arrList[i]==10){
                    tens++
                }
                if(arrList[i]==1){
                    tens--
                }
            }
            while(size>0){
                //beggining of dealing with 1's
                if(arrList[0] ==1){
                    if(arrList[arrList.size-1]==10){
                        arrList.removeAt(arrList.size-1)
                        arrList.removeAt(0)
                        size--
                        size--
                        System.out.println(arrList)
                    }
                    else if(arrList[arrList.size-1]>=difficulty){
                        arrList.removeAt(0)
                        arrList.removeAt(arrList.size-1)
                        size--
                        size--
                    }
                    else if(arrList[arrList.size-1]>1){
                        arrList.removeAt(0)
                        arrList.removeAt(arrList.size-1)
                        size--
                        size--
                        successes -=1
                    }
                    else{
                        arrList.removeAt(0)
                        size--
                        successes-=1
                    }
                }
                // End of dealing with 1's
                //Beginning of dealing with 10's
                else if(arrList[size-1]==10&&tens>=2){
                    for(i in 0 until tens){
                        arrList.removeAt(arrList.size-1)
                        size--
                        successes+=2
                    }
                }
                else if(arrList[0] >=difficulty){
                    arrList.removeAt(0)
                    size--
                    successes += 1
                }
                else{
                    arrList.removeAt(0)
                    size--
                }
            }
            if(numDice>0){
                binding.textView4.text = "Sucesses "+successes+"\n\nDice:"+diceNumbers
            }
            tens = 0;
        }
    }
}
