package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.ProfileBackground
import com.example.myapplication.ui.theme.ProfileBorder
import com.example.myapplication.ui.theme.ProfileMuted
import com.example.myapplication.ui.theme.ProfileText
import com.example.myapplication.ui.theme.ProfileWhite
import com.example.myapplication.ui.theme.StudentAccent
import com.example.myapplication.ui.theme.StudentHeader
import com.example.myapplication.ui.theme.profileActionStyle
import com.example.myapplication.ui.theme.profileBodyStyle
import com.example.myapplication.ui.theme.profileFontFamily
import com.example.myapplication.ui.theme.profileTitleStyle
import com.example.myapplication.ui.theme.studentBrandStyle

@Composable
fun StudentIdScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(ProfileBackground)
            .padding(horizontal = 24.dp)
            .padding(top = 32.dp, bottom = 24.dp),
    ) {
        Text(
            text = "KUIT CAMPUS",
            style = studentBrandStyle,
            color = StudentAccent
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "모바일 학생증",
            style = profileTitleStyle,
            color = ProfileText
        )
        Spacer(modifier = Modifier.height(24.dp))
        StudentIdCard()
        Spacer(modifier = Modifier.height(24.dp))
        InfoCard()
        Spacer(modifier = Modifier.weight(1f))
        BottomButtons()
    }
}

@Composable
fun StudentIdCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(ProfileWhite)
            .border(
                width = 1.dp,
                color = ProfileBorder
            )
    ) {
        StudentIdHeader()
        StudentIdBody()
    }
}

@Composable
fun StudentIdHeader(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(StudentHeader)
            .padding(20.dp)
    ) {
        Text(
            fontFamily = profileFontFamily,
            text = "KUIT CAMPUS",
            color = ProfileWhite,
            fontSize = 18.sp,
            lineHeight = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            fontFamily = profileFontFamily,
            text = "STUDENT IDENTIFICATION",
            color = Color(0xFFB8CBE6),
            fontSize = 10.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
fun StudentIdBody(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Text(
            text = "변수혁",
            fontSize = 24.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Bold,
            color = ProfileText
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "컴퓨터공학부",
            style = profileBodyStyle,
            lineHeight = 22.sp,
            color = ProfileMuted
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "학부생 · 재학",
            style = studentBrandStyle,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = StudentAccent
        )
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            StudentInfoRow("학번", "202311302")
            StudentInfoRow("학과", "컴퓨터공학부")
            StudentInfoRow("발급", "2026.09.16")
        }
    }
}

//학생증 본문 행
@Composable
fun StudentInfoRow(
    label: String,
    value: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = label,
            modifier = Modifier.width(56.dp), //이거 56맞는지 레이아웃 너비로 일단 설정
            color = Color(0xFF7A879A),
            lineHeight = 22.sp,
            fontSize = 12.sp

        )
        Text(
            text = value,
            style = profileActionStyle,
        )
    }
}

//중간 인포카드
@Composable
fun InfoCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFFE7EFFF))
            .padding(16.dp)
    ) {
        Text(
            text = "나를 소개하는 한 장",
            style = profileActionStyle,
            color = StudentHeader
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "이름과 학적 정보를 확인해 주세요.",
            fontFamily = profileFontFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = 20.sp,
            color = ProfileMuted
        )

    }
}

//맨밑버튼 질문:버튼 분리하는법
@Composable
fun BottomButtons(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Button(
            onClick = {},
            modifier = Modifier
                .weight(1f)
                .height(48.dp)

        ) {
            Text(
                text = "학생 정보",
                style = profileActionStyle,
                color = ProfileWhite
            )
        }
        Button(
            onClick = {},
            modifier = Modifier
                .weight(1f)
                .height(48.dp)
        ) {
            Text(
                text = "이용 안내",
                style = profileActionStyle,
                color = ProfileWhite
            )
        }
    }
}

@Preview
@Composable
private fun StudentIdScreenPreview() {
    StudentIdScreen()
}