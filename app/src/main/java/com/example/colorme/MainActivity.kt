package com.example.colorme
  import android.graphics.Color
  import androidx.appcompat.app.AppCompatActivity
  import android.os.Bundle
  import android.view.View
  import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        finder()

    }
}
     private fun finder() {
         val clickableView: List<View> =listOf(Box_1_text,Box_2_text,Box_3_text,Box_4_text,Box_5_text,constraint_layout)
         for(item in clickableView)
         {
             item.setOnClickListener {
                 colour(it)
             }
         }

     }
private fun colour(view:View)
{
   when(view.id)
   {
   R.id.Box_1_text->view.setBackgroundColor(Color.LTGRAY)
       R.id.Box_2_text->view.setBackgroundColor(Color.DKGRAY)
       R.id.Box_3_text->view.setBackgroundColor(android.R.color.holo_green_light)
       R.id.Box_4_text->view.setBackgroundColor(android.R.color.holo_green_dark)
       R.id.Box_5_text->view.setBackgroundColor(android.R.color.holo_green_light)
       else->view.setBackgroundColor(Color.LTGRAY)
   }
}