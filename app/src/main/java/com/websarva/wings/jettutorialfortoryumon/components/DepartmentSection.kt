package com.websarva.wings.jettutorialfortoryumon.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DepartmentSection() {
    Column(
        horizontalAlignment = Alignment.Start, //要素を左寄せにする(右寄せは.End)
        modifier = Modifier.fillMaxWidth() //大外枠(MainScreen.ktのColumn)に合わせる
    ) {
        //学科名
        Text(
            text = "情報工学科",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "ネットワーク分野",
            color = Color.Gray,
            fontSize = 16.sp
        )
    }
}