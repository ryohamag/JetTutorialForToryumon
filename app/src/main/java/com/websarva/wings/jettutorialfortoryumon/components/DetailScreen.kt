package com.websarva.wings.jettutorialfortoryumon.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.websarva.wings.jettutorialfortoryumon.R

//textの内容は自由に変えてください
@Composable
fun DetailScreen() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(top = 50.dp, start = 20.dp, end = 20.dp)
    ) {
        Column( //ここが要素を囲んでいる枠の部分(Columnの範囲が可視化されたイメージ)
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(Color.LightGray.copy(alpha = 0.3f)) //ここで背景色を設定(設定しなければ透明)
                .padding(horizontal = 10.dp, vertical = 20.dp)
        ) {
            Label(
                painter = painterResource(id = R.drawable.baseline_cake_24),
                text = "生年月日：2004年6月21日"
            )

            Spacer(modifier = Modifier.height(10.dp))

            Label(
                painter = painterResource(id = R.drawable.baseline_bloodtype_24),
                text = "血液型：AB型"
            )

            Spacer(modifier = Modifier.height(10.dp))

            Label(
                vector = Icons.Default.LocationOn,
                text = "出身地：愛知県"
            )

            Spacer(modifier = Modifier.height(10.dp))

            Label(
                vector = Icons.Default.Favorite,
                text = "趣味：野球,ゲーム,ギター"
            )

            Spacer(modifier = Modifier.height(10.dp))

            Label(
                painter = painterResource(id = R.drawable.outline_person_play_24),
                text = "所属団体：C0de,NITMic,準硬式野球部"
            )
        }
    }
}