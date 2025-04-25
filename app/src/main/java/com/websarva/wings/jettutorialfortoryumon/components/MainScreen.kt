package com.websarva.wings.jettutorialfortoryumon.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.websarva.wings.jettutorialfortoryumon.R

@Composable
fun MainScreen(innerPadding: PaddingValues) {
    //要素を縦に並べる
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, //要素を中央に並べる
        modifier = Modifier //要素の修飾に用いる
            .padding(innerPadding) //Columnの周りに余白を設定
            .fillMaxSize() //Columnのサイズを画面いっぱいに広げる
            .verticalScroll(rememberScrollState()) //縦スクロールを可能にする
    ){
        Image(
            painter = painterResource(id = R.drawable.image), //画像の指定
            contentDescription = "Profile", //画像の説明
            modifier = Modifier
                .size(100.dp) //縦横両方が100dpに設定される
                .clip(RoundedCornerShape(10.dp)) //画像の角を丸くする
        )
    }
}