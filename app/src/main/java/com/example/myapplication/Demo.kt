package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 강의에서 보여 준 예제를 그대로 돌려 볼 수 있게 모아 둔 파일이다.
// 오른쪽 위 Split 을 누르면 아래 @Preview 들이 슬라이드의 그림 그대로 나온다.
// 숫자를 바꿔 보고 그림이 어떻게 달라지는지 보는 용도다. 미션 코드는 새 파일에 쓰면 된다.

// ── 레이아웃 3종 : Column / Row 안의 Column / Box ──────────────────

@Preview(name = "1 Column", showBackground = true, widthDp = 460, heightDp = 260)
@Composable
private fun ColumnSample() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("제목")
        Text("본문")
    }
}

@Preview(name = "2 Row 안의 Column", showBackground = true, widthDp = 460, heightDp = 260)
@Composable
private fun RowColumnSample() {
    Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
        Box(Modifier.size(40.dp).background(Color(0xFF4A959C)))
        Spacer(Modifier.width(12.dp))
        Column {
            Text("이름")
            Text("설명")
        }
    }
}

@Preview(name = "3 Box", showBackground = true, widthDp = 460, heightDp = 260)
@Composable
private fun BoxSample() {
    Box(modifier = Modifier.padding(16.dp), contentAlignment = Alignment.Center) {
        Box(Modifier.size(120.dp, 70.dp).background(Color(0xFF4A959C)))
        Text("이미지 위의 글자", color = Color.White)
    }
}

// ── Modifier 순서 : 이은 순서대로 적용된다 ─────────────────────────

@Preview(name = "A padding 먼저", showBackground = true, widthDp = 420, heightDp = 180)
@Composable
private fun PaddingThenBackground() {
    Text("A", modifier = Modifier.padding(16.dp).background(Color(0xFFFFE082)))
}

@Preview(name = "B background 먼저", showBackground = true, widthDp = 420, heightDp = 180)
@Composable
private fun BackgroundThenPadding() {
    Text("B", modifier = Modifier.background(Color(0xFFFFE082)).padding(16.dp))
}

// ── 비율 코딩 : 같은 화면을 두 기기 폭으로 ──────────────────────────
// 아래 넷은 같은 카드를 Pixel 7 (411dp) 과 보급형 (360dp) 폭에 각각 올린 것이다.
// 고정 dp 쪽만 좁은 화면에서 오른쪽 카드가 줄어든다.

@Composable
private fun FixedCard() {
    Row(modifier = Modifier.width(380.dp)) {
        Box(Modifier.width(180.dp).height(80.dp).background(Color(0xFFE57373)))
        Spacer(Modifier.width(20.dp))
        Box(Modifier.width(180.dp).height(80.dp).background(Color(0xFFE57373)))
    }
}

@Composable
private fun RatioCard() {
    Row(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        Box(Modifier.weight(1f).height(80.dp).background(Color(0xFF81C784)))
        Spacer(Modifier.width(20.dp))
        Box(Modifier.weight(1f).height(80.dp).background(Color(0xFF81C784)))
    }
}

@Preview(name = "411dp 고정 dp", showBackground = true, widthDp = 411, heightDp = 120)
@Composable
private fun FixedOn411() {
    FixedCard()
}

@Preview(name = "360dp 고정 dp", showBackground = true, widthDp = 360, heightDp = 120)
@Composable
private fun FixedOn360() {
    FixedCard()
}

@Preview(name = "411dp 비율", showBackground = true, widthDp = 411, heightDp = 120)
@Composable
private fun RatioOn411() {
    RatioCard()
}

@Preview(name = "360dp 비율", showBackground = true, widthDp = 360, heightDp = 120)
@Composable
private fun RatioOn360() {
    RatioCard()
}
