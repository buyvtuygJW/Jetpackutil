package foss.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
/**
 * Btn imports,v1min
 * */

import androidx.compose.foundation.text.KeyboardActions

class Composetxts{

    companion object {

        @JvmStatic
        @Composable
        fun txtobjv2(txt:String,optfontsz:Int?=null,optmodifier: Modifier?=null){
            val finalmod:Modifier= if(optmodifier==null){
                Modifier.fillMaxWidth()
                    .background(color = Color.Cyan)
                    .wrapContentWidth(align = Alignment.CenterHorizontally)
                // Modifier.width(100.dp)
                //optional,.height(100.dp)
            }else{
                optmodifier
            }

            if(optfontsz!=null){
                val finalunit= optfontsz.sp
                Text(text=txt,fontSize = finalunit, modifier = finalmod)
            }else{
                Text(text=txt, modifier = finalmod)
            }
        }


    }

}
