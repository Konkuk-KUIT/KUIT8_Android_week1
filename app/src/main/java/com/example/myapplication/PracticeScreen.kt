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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Color, TextStyle 한꺼번에 임포트
import com.example.myapplication.ui.theme.*

@Composable
fun MyStudentIdScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(profileBackground)
            .padding(horizontal = 24.dp)
            .padding(top = 32.dp, bottom = 24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Column {
            Text(text = "KUIT CAMPUS", style = studentBrandStyle, color = studentAccent)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "모바일 학생증", style = profileTitleStyle, color = profileText)
        }

        StudentIdCard()

        NoticeBox()

        Spacer(Modifier.weight(1f))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = studentHeader)
            ) {
                Text(text = "응원하기", style = profileActionStyle, color = profileWhite)
            }

            Button(
                onClick = {},
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = studentHeader)
            ) {
                Text(text = "공유하기", style = profileActionStyle, color = profileWhite)
            }
        }
    }
}

@Composable
fun StudentIdCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = profileBorder, shape = RoundedCornerShape(12.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = studentHeader
                )
                .padding(horizontal = 24.dp, vertical = 20.dp)
        ) {
            Text(text = "KUIT CAMPUS", style = studentSchoolStyle, color = profileWhite)
            Spacer(modifier = Modifier.height(2.dp))
            Text(text = "STUDENT IDENTIFICATION", style = studentEnglishLabelStyle, color = studentOnHeaderMuted)
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = profileWhite
                )
                .padding(horizontal = 24.dp, vertical = 24.dp)
        ) {
            Text(text = "남윤화", style = profileNameStyle, color = profileText)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "건국대학교 첨단바이오공학부", style = studentBodyStyle, color = profileText)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "학부생 • 재학", style = studentStatusStyle, color = studentAccent)

            Spacer(modifier = Modifier.height(24.dp))

            InfoRow(label = "학번", value = "202312482")
            Spacer(modifier = Modifier.height(12.dp))
            InfoRow(label = "학과", value = "첨단바이오공학부")
            Spacer(modifier = Modifier.height(12.dp))
            InfoRow(label = "발급", value = "20260918")
        }
    }
}

@Composable
fun InfoRow(label: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            style = studentFieldLabelStyle,
            color = studentFieldLabel,
            modifier = Modifier.width(48.dp)
        )
        Text(
            text = value,
            style = studentCaptionStyle,
            color = profileMuted
        )
    }
}

@Composable
fun NoticeBox(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = studentNoticeBackground,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(horizontal = 20.dp, vertical = 16.dp)
    ) {
        Text(text = "나를 소개하는 한 장", style = profileActionStyle, color = profileText)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "이름과 학적 정보를 확인해 주세요.", style = studentBodyStyle, color = profileMuted)
    }
}

@Preview(showBackground = true)
@Composable
private fun MyProfileScreenPreview() {
    MyStudentIdScreen()
}