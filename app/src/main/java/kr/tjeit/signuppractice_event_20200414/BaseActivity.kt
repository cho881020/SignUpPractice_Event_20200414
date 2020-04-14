package kr.tjeit.signuppractice_event_20200414

import androidx.appcompat.app.AppCompatActivity

// 프로젝트에서 모든 액티비티가 공통적으로 사용하는
// 변수 or 함수들을 모아두는 클래스

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

}