# KUIT 8기 Android 1주차

건국대학교 KUIT 8기 안드로이드 파트 1주차 미션 저장소입니다.
코드 스타일 검사(ktlint)와 Compose 룰셋이 **이미 설정돼 있습니다.** 따로 만질 것 없습니다.

## 시작하기

```bash
git clone https://github.com/Konkuk-KUIT/KUIT8_Android_week1.git
cd KUIT8_Android_week1
git switch -c 본인이름   # 예: git switch -c 정일혁
```

Android Studio 에서 `Open` 으로 이 폴더를 엽니다. 첫 실행은 Gradle 이 라이브러리를 받느라 몇 분 걸립니다.

`main` 브랜치에는 직접 푸시할 수 없습니다. 본인 브랜치에서 작업하고 PR 을 올려 주세요.

## 강의 예제 다시 보기

`app/src/main/java/com/example/myapplication/Demo.kt` 에 강의에서 보여 준 예제가 그대로 들어 있습니다.
파일을 열고 오른쪽 위 `Split` 을 누르면 레이아웃 3종(Column / Row 안의 Column / Box), Modifier 순서,
비율 코딩 예제가 프리뷰로 나옵니다. 숫자를 바꿔 보고 그림이 어떻게 달라지는지 보면 됩니다.

미션 코드는 이 파일이 아니라 새 파일에 쓰세요. Demo.kt 는 그대로 두어도 됩니다.

## 제출

```bash
git add .
git commit -m "week1: 화면 구현"
git push -u origin 본인이름
```

푸시하면 깃허브가 `Compare & pull request` 버튼을 보여 줍니다. 눌러서 PR 을 올리면 됩니다.
PR 은 파트장이 봅니다. **머지는 하지 않아도 됩니다.**

## 올리기 전에 한 번

```bash
./gradlew ktlintFormat
```

들여쓰기, import 정렬, 마지막 줄 개행 같은 것은 이 명령이 알아서 고칩니다.
고친 게 있으면 그대로 커밋하면 됩니다.

## Android Studio 에 ktlint 붙이기 (선택)

터미널 대신 IDE 안에서 바로 보고 싶으면:

1. `Settings` (맥 `command ,`) → `Plugins` → `Marketplace` 에서 **ktlint** 검색 → Install → 재시작
2. `Settings` → `Tools` → `KtLint` → 모드를 **Distract free** 로

이렇게 두면 파일을 저장하거나 정렬할 때 ktlint 규칙까지 같이 맞춰 줍니다.
안 깔아도 됩니다. `./gradlew ktlintFormat` 이면 결과는 같습니다.

## PR 을 올리면 자동으로 도는 것

| 이름 | 무엇을 보나 | 빨개지면 |
|---|---|---|
| PR Build & Test | 빌드가 되는지, 단위 테스트가 통과하는지 | 코드가 컴파일이 안 되는 상태입니다. 로그의 첫 번째 에러부터 보세요 |
| PR Static Analysis | 코드 스타일(ktlint), 안드로이드 Lint | `./gradlew ktlintFormat` 후 다시 푸시하면 대부분 없어집니다 |
| Leftover Marker Check | 머지 충돌 마커가 남았는지 | 경고만 남습니다. PR 을 막지 않습니다 |
| Docs Link Check | 문서 안 링크가 살아 있는지 | 경고만 남습니다. PR 을 막지 않습니다 |

테스트 코드를 한 줄도 안 썼어도 초록입니다. 빨개지는 건 실제로 뭔가 깨졌을 때입니다.

Actions 탭에서 직접 눌러야 도는 것도 있습니다 — `Build Cache Warm`(학기 시작에 한 번 눌러 두면 이후 PR 이 빨라집니다), `Instrumented Test`(에뮬레이터에서 androidTest), `Release Build Check`(릴리스 빌드).

실패한 검사의 자세한 리포트는 PR 의 `Checks` 탭 → 해당 워크플로 → 아래쪽 `Artifacts` 에서 받을 수 있습니다.

## 코드 스타일 규칙에 대해

`.editorconfig` 에 1주차에 켤 규칙만 켜 뒀습니다.
아직 안 배운 개념(`remember`, `State`, `ViewModel`)을 근거로 지적하는 규칙은 언제 켤지 주석으로 적어 두고 꺼 뒀습니다.
주차가 올라가면 파트장이 그 줄을 하나씩 지웁니다.
