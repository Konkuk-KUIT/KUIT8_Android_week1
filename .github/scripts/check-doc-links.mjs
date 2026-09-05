// 저장소 안 마크다운의 로컬 링크가 실제 파일을 가리키는지 검사한다.
// 외부 http(s) 링크는 건드리지 않는다. 깨진 링크가 있어도 종료 코드는 0 이다(경고만).
import { readFileSync, existsSync, statSync } from 'node:fs'
import { execSync } from 'node:child_process'
import { dirname, resolve, join } from 'node:path'

const files = execSync("git ls-files '*.md'", { encoding: 'utf8' }).split('\n').filter(Boolean)
const linkPattern = /\[[^\]]*\]\(([^)\s]+)(?:\s+"[^"]*")?\)/g
let broken = 0

for (const file of files) {
  const text = readFileSync(file, 'utf8')
  for (const match of text.matchAll(linkPattern)) {
    const raw = match[1]
    if (/^(https?:|mailto:|#)/.test(raw)) continue
    const target = raw.split('#')[0]
    if (!target) continue
    const full = target.startsWith('/')
      ? join(process.cwd(), target)
      : resolve(dirname(file), target)
    if (!existsSync(full)) {
      console.log(`::warning file=${file}::깨진 링크: ${raw}`)
      broken += 1
    } else if (statSync(full).isDirectory() && !raw.endsWith('/')) {
      console.log(`::notice file=${file}::디렉터리를 가리키는 링크: ${raw}`)
    }
  }
}

console.log(broken === 0 ? `마크다운 ${files.length}개, 깨진 로컬 링크 없음` : `깨진 로컬 링크 ${broken}건`)
