package com.example.onboardingcompose.screen


import android.graphics.LinearGradient
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.onboardingcompose.ui.theme.bab
import com.example.onboardingcompose.ui.theme.c1
import com.example.onboardingcompose.ui.theme.c2
import com.google.accompanist.pager.ExperimentalPagerApi


@Composable
fun GradientButton(
    text :String,
    textColor : Color,
    gradient : Brush,
    onClick: () -> Unit,
) {

    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor =  Color.Transparent
        ),
        contentPadding = PaddingValues(),
        shape = RoundedCornerShape(20.dp),
        onClick = onClick) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 30.dp, bottom = 30.dp, start = 10.dp, end = 10.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = textColor,
                fontSize = 25.sp, textAlign = TextAlign.Center
            )
        }
    }

}

@Composable
fun GradientButton2(
    text :String,
    textColor : Color,
    gradient : Brush,
    onClick: () -> Unit,
) {

    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor =  Color.Transparent
        ),
        contentPadding = PaddingValues(),
        shape = RoundedCornerShape(20.dp),
        onClick = {onClick}) {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(top = 20.dp, bottom = 20.dp, start = 10.dp, end = 10.dp)
                .height(60.dp)
                .width(150.dp),
            contentAlignment = Alignment.Center) {
            Text(text = text, color = textColor,
                fontSize = 30.sp,  textAlign = TextAlign.Center
            )
        }
    }

}
//commit try
@Preview
@Composable
fun GradientPreview() {
    GradientButton(
        text = "Button",
        textColor = Color.Black,
        gradient = Brush.horizontalGradient(
            colors = listOf(
               c1, c2
            )
        )
    ) {

    }
}

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientB1(
    gradient: Brush,
    onClick: () -> Unit,
    text: String,
    img: Painter
) {
    Button(

        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),

        contentPadding = PaddingValues(),

        modifier = Modifier
            //.padding(150.dp)
            .padding(top = 5.dp, start = 1.dp, end = 1.dp, bottom = 5.dp)
            .height(100.dp)
            .width(170.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            //.fillMaxSize()
            //.padding(horizontal = 1.dp, vertical = 8.dp)
            .background(gradient),


        onClick = onClick
    ) {

        Image(
            //painterResource(id = R.drawable.exam),
            painter = img,
            contentDescription = "Cart button icon",
            alignment = Alignment.Center,
            modifier = Modifier.height(60.dp)

        )
        Text(
            text = text,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = bab,
        )
    }
}


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun GradientB2(
    gradient: Brush,
    onClick: () -> Unit,
    text: String,
    img: Painter
) {
    Button(

        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),

        contentPadding = PaddingValues(),

        modifier = Modifier
            //.padding(150.dp)
            .padding(top = 5.dp, start = 1.dp, end = 1.dp, bottom = 5.dp)
            .height(100.dp)
            .width(170.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            //.fillMaxSize()
            //.padding(horizontal = 1.dp, vertical = 8.dp)
            .background(gradient),
        //commentline


        onClick = onClick
    ) {

        Image(
            //painterResource(id = R.drawable.exam),
            painter = img,
            contentDescription = "Cart button icon",
            alignment = Alignment.Center,
            modifier = Modifier.height(60.dp)

        )
        Text(
            text = text,
            color = Color.Black,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = bab,
        )
    }
}

