package com.example.lectureassets

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyGreeting(name: String) {
    Text(text = name)
}

class AppColors(
    val normal: Color = Color(0xFF212121),
    val active: Color = Color(0xFF328BFF),
    val onButton: Color = Color.White,
)
val appColors = AppColors()


class AppTypography(
    val title: TextStyle = TextStyle(
        fontSize = 24.sp, lineHeight = 32.sp,
        fontWeight = FontWeight.Bold,
    ),
    val body: TextStyle = TextStyle(
        fontSize = 16.sp, lineHeight = 24.sp,
    ),
)
val appTypography = AppTypography()


// Theme.kt
class AppStyle(
    val colors: AppColors,
    val typography: AppTypography,
)

val AppTheme = AppStyle(
    colors = appColors,
    typography = appTypography,
)

enum class AppButtonType { Default, Active }
@Composable
fun AppButton(
    text: String, onClick: () -> Unit,
    modifier: Modifier = Modifier,
    type: AppButtonType = AppButtonType.Default,
    containerColor: Color? = null,
) {
    val color = containerColor ?: when (type) {
        AppButtonType.Default -> AppTheme.colors.normal
        AppButtonType.Active -> AppTheme.colors.active
    }
    Box(
        modifier = modifier.background(color)
            .clickable(onClick = onClick).padding(16.dp),
    ) {
        Text(text, color = AppTheme.colors.onButton,
            style = AppTheme.typography.body)
    }
}

@Composable
fun Message(text: String, modifier: Modifier = Modifier) {
    Text(text, modifier = modifier)
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun MyGreetingPreview() {
    MyGreeting("KUIT")
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun BasicTextPreview() {
    Text(text = "안녕하세요")
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun BasicButtonPreview() {
    Button(onClick = { /* 클릭 시 실행할 코드 */ }) { Text("확인") }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun LayoutColumnPreview() {
    Column { Text("첫째 줄"); Text("둘째 줄") }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun LayoutRowPreview() {
    Row { Text("왼쪽"); Text("오른쪽") }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun LayoutBoxPreview() {
    Box { Text("가나다"); Text("ABC") }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun NestedPreview() {
    Row {
        Column {
            Text("이름")
            Text("일혁")
        }
        Column {
            Text("분야")
            Text("Android")
        }
    }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun TextSizePreview() {
    Column { Text("작은 글자", fontSize = 16.sp); Text("큰 글자", fontSize = 28.sp) }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun BackgroundPreview() {
    Text(
        text = "확인",
        modifier = Modifier.background(Color.Yellow),
    )
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun SizesPreview() {
    Row {
        Box(Modifier.size(64.dp).background(Color.Cyan))
        Spacer(Modifier.width(16.dp))
        Box(Modifier.size(64.dp).background(Color.Yellow))
    }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun PaddingZeroPreview() {
    Box(
        Modifier.border(2.dp, Color.Black)
            .background(Color.Yellow)
            .padding(0.dp),
    ) {
        Text("콘텐츠", Modifier.background(Color.Cyan))
    }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun PaddingPreview() {
    Box(
        Modifier.border(2.dp, Color.Black)
            .background(Color.Yellow)
            .padding(24.dp),
    ) {
        Text("콘텐츠", Modifier.background(Color.Cyan))
    }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun OrderAPreview() {
    Box(Modifier.border(2.dp, Color.Black).padding(24.dp).background(Color.Yellow)) { Text("내용") }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun OrderBPreview() {
    Box(Modifier.border(2.dp, Color.Black).background(Color.Yellow).padding(24.dp)) { Text("내용") }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun MessagePreview() {
    Message("확인", modifier = Modifier.background(Color.Yellow).clickable { println("클릭") }.padding(16.dp))
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640", widthDp = 360)
@Composable
fun WeightEqualPreview() {
    Row(Modifier.fillMaxWidth()) { Text("A", Modifier.weight(1f).background(Color.Cyan)); Spacer(Modifier.width(16.dp)); Text("B", Modifier.weight(1f).background(Color.Yellow)) }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640", widthDp = 360)
@Composable
fun WeightSpacerPreview() {
    Row(Modifier.fillMaxWidth()) { Text("제목"); Spacer(Modifier.weight(1f)); Text("날짜") }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun ColorPreview() {
    Text("강조", color = appColors.active)
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun TypographyPreview() {
    Column { Text("제목", style = appTypography.title); Text("본문", style = appTypography.body) }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun ThemePreview() {
    Column { Text(
        text = "제목",
        style = AppTheme.typography.title,
    )
    Text(
        text = "강조",
        color = AppTheme.colors.active,
        style = AppTheme.typography.body,
    ) }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun FinalDefaultPreview() {
    AppButton(text = "확인", onClick = {})
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640")
@Composable
fun FinalActivePreview() {
    AppButton(text = "확인", onClick = {}, type = AppButtonType.Active)
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640", widthDp = 360)
@Composable
fun RatioFixed360Preview() {
    Row(Modifier.width(380.dp)) {
        Box(Modifier.width(180.dp).height(80.dp).background(Color.Cyan))
        Spacer(Modifier.width(20.dp))
        Box(Modifier.width(180.dp).height(80.dp).background(Color.Yellow))
    }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640", widthDp = 360)
@Composable
fun RatioWeight360Preview() {
    Row(Modifier.fillMaxWidth()) {
        Box(Modifier.weight(1f).height(80.dp).background(Color.Cyan))
        Spacer(Modifier.width(20.dp))
        Box(Modifier.weight(1f).height(80.dp).background(Color.Yellow))
    }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640", widthDp = 411)
@Composable
fun RatioFixed411Preview() {
    Row(Modifier.width(380.dp)) {
        Box(Modifier.width(180.dp).height(80.dp).background(Color.Cyan))
        Spacer(Modifier.width(20.dp))
        Box(Modifier.width(180.dp).height(80.dp).background(Color.Yellow))
    }
}

@Preview(showBackground = true, apiLevel = 35, device = "spec:width=411dp,height=891dp,dpi=640", widthDp = 411)
@Composable
fun RatioWeight411Preview() {
    Row(Modifier.fillMaxWidth()) {
        Box(Modifier.weight(1f).height(80.dp).background(Color.Cyan))
        Spacer(Modifier.width(20.dp))
        Box(Modifier.weight(1f).height(80.dp).background(Color.Yellow))
    }
}
