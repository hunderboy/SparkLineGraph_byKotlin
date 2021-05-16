package kr.co.everex.sparklinegraphtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.everex.sparklinegraphtestapp.databinding.ActivityMainBinding
import kr.co.everex.sparklinegraphtestapp.databinding.ActivitySparkLineBinding

class SparkLineActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySparkLineBinding

//    val arrayData_test : ArrayList<Int>(10,12,18,22,32,40)
    val arrayData = arrayListOf(80,74,32,45,66,100,25)
//    val arrayData = arrayListOf(10,12,18,22,32,40)
//    val arrayData = arrayListOf(10,12,18,22,32,40)
//    val arrayData = arrayListOf(10,12,18,22,32,40)

    // 커스텀
    val arrayDataCustom = arrayListOf(80,74,32,45,100,100,25)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySparkLineBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view) // 뷰 바인딩 적용 완료

        // 라인에 데이터 설정
        binding.sparkline.setData(arrayData)
        binding.sparklineCustom.setData(arrayDataCustom)
    }


}