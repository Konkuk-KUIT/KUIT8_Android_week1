package com.example.myapplication

import android.R.attr.name
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.profileActionStyle
import com.example.myapplication.ui.theme.profileBackground
import com.example.myapplication.ui.theme.profileBorder
import com.example.myapplication.ui.theme.profileMuted
import com.example.myapplication.ui.theme.profileNameStyle
import com.example.myapplication.ui.theme.profileText
import com.example.myapplication.ui.theme.profileTitleStyle
import com.example.myapplication.ui.theme.profileWhite
import com.example.myapplication.ui.theme.studentAccent
import com.example.myapplication.ui.theme.studentBodyStyle
import com.example.myapplication.ui.theme.studentBrandStyle
import com.example.myapplication.ui.theme.studentCaptionStyle
import com.example.myapplication.ui.theme.studentEnglishLabelStyle
import com.example.myapplication.ui.theme.studentFieldLabel
import com.example.myapplication.ui.theme.studentFieldLabelStyle
import com.example.myapplication.ui.theme.studentHeader
import com.example.myapplication.ui.theme.studentNoticeBackground
import com.example.myapplication.ui.theme.studentOnHeaderMuted
import com.example.myapplication.ui.theme.studentSchoolStyle
import com.example.myapplication.ui.theme.studentStatusStyle

@Composable
fun StudentIdScreen(screenModifier: Modifier = Modifier) {
    Column(
        modifier = screenModifier
            .fillMaxSize()
            .background(profileBackground)
            .padding(horizontal = 24.dp)
            .padding(top = 32.dp, bottom = 24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ){
        ScreenHeadline()
        IdCardContainer()
        SelfIntroBox()
        Spacer(Modifier.weight(1f))
        BottomActionRow()
    }
}

@Composable
fun ScreenHeadline(headlineModifier: Modifier = Modifier) {
    Column(modifier = headlineModifier.fillMaxWidth()) {
        Text(text = "KUIT CAMPUS", style = studentBrandStyle, color = studentAccent)
        Spacer(Modifier.height(4.dp))
        Text(text = "모바일 학생증", style = profileTitleStyle, color = profileText)


    }
}

@Composable
fun IdCardContainer(cardModifier: Modifier = Modifier) {
    Column(
        modifier = cardModifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = profileBorder
            )
    ) {
        CardTopBanner()
        CardContentArea()}
}

@Composable
fun CardTopBanner(bannerModifier: Modifier = Modifier) {
    Column(
        modifier= bannerModifier
            .fillMaxWidth()
            .height(88.dp)
            .background(studentHeader)
            .padding(20.dp)
    ) {
        Text(text = "KUIT CAMPUS", style =studentSchoolStyle, color = profileWhite)
        Spacer(Modifier.height(4.dp))
        Text(text = "STUDENT IDENTIFICATION", style =studentEnglishLabelStyle, color = studentOnHeaderMuted)


    }
}

@Composable
fun CardContentArea(contentModifier: Modifier = Modifier) {
    Column(
        modifier = contentModifier
            .fillMaxWidth()
            .background(profileWhite)
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        OwnerNameBlock()
        DetailFieldList()
    }
}

@Composable
fun OwnerNameBlock(nameModifier: Modifier = Modifier) {
    Column(modifier = nameModifier) {
        Text(text = "김수빈", style = profileNameStyle, color = profileText)
        Spacer(Modifier.height(8.dp))
        Text(text = "컴퓨터공학부", style = studentBodyStyle, color = profileMuted)
        Spacer(Modifier.height(8.dp))
        Text(text = "학부생 · 재학", style = studentStatusStyle, color = studentAccent)
    }
}

@Composable
fun DetailFieldList(fieldModifier: Modifier = Modifier) {
    val fieldNames : List<String> = listOf("학번", "입학","발급")
    val fieldValues: List<String> = listOf("202214310", "2022.03","2026.09.18")

    Column(
        modifier = fieldModifier,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        fieldNames.zip(fieldValues).forEach { (name, value) ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(22.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ){
                Text(
                    text = name,
                    style = studentFieldLabelStyle,
                    color = studentFieldLabel,
                    modifier = Modifier.width(56.dp)
                )
                Text(
                    text = value,
                    style = profileActionStyle,
                    color = profileText,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
fun SelfIntroBox(introModifier: Modifier = Modifier) {
    Column(
        modifier = introModifier
            .fillMaxWidth()
            .background(studentNoticeBackground)
            .padding(16.dp)
    ) {
        Text(text = "나를 소개하는 한 장", style = profileActionStyle, color = studentHeader)
        Spacer(Modifier.height(4.dp))
        Text(text = "김수빈입니다..", style = studentCaptionStyle, color = profileMuted)
    }
}

@Composable
fun BottomActionRow(actionModifier: Modifier = Modifier) {
    val buttonTexts: List<String> = listOf("학생 정보", "이용 안내")

    Row(
        modifier = actionModifier
            .fillMaxWidth()
            .height(48.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        buttonTexts.forEach { buttonText ->
            Button(
                onClick = {},
                modifier = Modifier.weight(1f)
            ) {
                Text(text = buttonText, style = profileActionStyle, color = profileWhite)
            }
        }

    }
}