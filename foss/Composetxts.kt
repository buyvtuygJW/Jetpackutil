package foss.utils

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
/**
 * Btn imports,v1min
 * */
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextField
import androidx.compose.runtime.saveable.rememberSaveable
import kotlin.reflect.KFunction

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