package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.*

@Composable
fun StudentIdScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(profileBackground)
            .padding(horizontal = 24.dp, vertical = 32.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        StudentTitle()
        StudentIdCard()
        StudentNotice()

        Spacer(modifier = Modifier.weight(1f))

        StudentButtons()
    }
}

@Composable
fun StudentTitle(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier, verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "KUIT CAMPUS", style = studentBrandStyle, color = studentAccent
        )

        Text(
            text = "모바일 학생증", style = profileTitleStyle, color = profileText
        )
    }
}

@Composable
fun StudentIdCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .border(
                width = 1.dp, color = profileBorder
            )
            .background(profileWhite)
    ) {
        StudentCardHeader()
        StudentCardInfo()
    }
}

@Composable
fun StudentCardHeader(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(studentHeader)
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "KUIT CAMPUS", style = studentSchoolStyle, color = profileWhite
        )

        Text(
            text = "STUDENT IDENTIFICATION",
            style = studentEnglishLabelStyle,
            color = studentOnHeaderMuted
        )
    }
}

@Composable
fun StudentCardInfo(modifier: Modifier = Modifier) {
    val studentInfo = listOf(
        "학번" to "202412359", "입학" to "2024.03", "발급" to "2026.09.17"
    )

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Text(
            text = "박태희", style = profileNameStyle, color = profileText
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "컴퓨터공학부", style = studentBodyStyle, color = profileMuted
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "학부생 · 재학", style = studentStatusStyle, color = studentAccent
        )

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            studentInfo.forEach { (label, value) ->
                StudentInfoRow(
                    label = label, value = value
                )
            }
        }
    }
}

@Composable
fun StudentInfoRow(
    label: String, value: String, modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth()
    ) {
        Text(
            text = label,
            style = studentFieldLabelStyle,
            color = studentFieldLabel,
            modifier = Modifier.width(68.dp)
        )

        Text(
            text = value, style = profileActionStyle, color = profileText
        )
    }
}

@Composable
fun StudentNotice(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(studentNoticeBackground)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = "나를 소개하는 한 장", style = profileActionStyle, color = studentHeader
        )

        Text(
            text = "안녕하세요! KUIT 8기 Android + Server 부원 박태희 입니다.",
            style = studentCaptionStyle,
            color = profileMuted
        )
    }
}

@Composable
fun StudentButtons(modifier: Modifier = Modifier) {
    val buttons = listOf(
        "학생 정보", "이용 안내"
    )

    Row(
        modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        buttons.forEach { buttonText ->
            StudentButton(
                text = buttonText, modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun StudentButton(
    text: String, modifier: Modifier = Modifier
) {
    Button(
        onClick = {}, modifier = modifier, colors = ButtonDefaults.buttonColors(
            containerColor = baseButtonColor
        )
    ) {
        Text(
            text = text, style = profileActionStyle, color = profileWhite
        )
    }
}