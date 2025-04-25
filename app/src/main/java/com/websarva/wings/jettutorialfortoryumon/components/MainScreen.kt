package com.websarva.wings.jettutorialfortoryumon.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.websarva.wings.jettutorialfortoryumon.R

@Composable
fun MainScreen(innerPadding: PaddingValues) {
    //要素を縦に並べる
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, //要素を中央に並べる
        modifier = Modifier //要素の修飾に用いる
            .padding(innerPadding) //Columnの周りに余白を設定
            .padding(start = 20.dp, end = 20.dp) //Columnの外側に余白を設定
            .fillMaxSize() //Columnのサイズを画面いっぱいに広げる
            .verticalScroll(rememberScrollState()) //縦スクロールを可能にする
    ){  //プロフィール画像
        Image(
            painter = painterResource(id = R.drawable.image), //画像の指定
            contentDescription = "Profile", //画像の説明
            modifier = Modifier
                .size(100.dp) //縦横両方が100dpに設定される
                .clip(RoundedCornerShape(10.dp)) //画像の角を丸くする
        )

        Spacer(modifier = Modifier.height(20.dp)) //20dp分のスペースを設定

        //名前
        Text(
            text = "h_ryo", //表示するテキスト
            color = Color.Gray, //文字色を設定
            fontSize = 24.sp, //文字サイズを設定(原則spを用いる)
            fontWeight = FontWeight.Bold //文字の太さを設定
        )

        Spacer(modifier = Modifier.height(20.dp))

        //学年
        Text(
            text = "学年：3年生",
            color = Color.Gray,
            fontSize = 16.sp,
        )

        Spacer(modifier = Modifier.height(20.dp))

        DepartmentSection()
    }
}