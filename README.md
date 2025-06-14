# 🛠 Spring Boot + GitHub Actions 기반 CI/CD 프로젝트 정리

## 📅 프로젝트 진행 일자
- 시작일: (사용자 입력 필요)
- 마지막 업데이트: 2025-06-14

---

## ✅ 프로젝트 목표
GitHub에 코드 Push 시 자동으로 원격 서버에 배포되도록 하는 CI/CD 파이프라인 구축  
(Spring Boot 기반 `.jar` 실행 방식으로 시작)

---

## 📦 시스템 구성

| 구성 요소 | 역할 |
|-----------|------|
| **Spring Boot** | 웹 애플리케이션 서버 |
| **MySQL**       | 데이터베이스 서버 (Docker 사용 가능) |
| **GitHub**      | 코드 저장소 및 CI/CD 트리거 |
| **GitHub Actions** | 자동 빌드 및 배포 수행 |
| **SSH**         | 배포 서버 원격 접속 |
| **deploy.sh**   | 서버 내 배포 스크립트 |

---

## 🧱 프로젝트 디렉토리 구조 (요약)

```
bootStudy/
├── bootBoard/                 # 실제 스프링 프로젝트
│   ├── src/...
│   └── target/*.jar           # 빌드 산출물
├── .github/
│   └── workflows/
│       └── deploy.yml         # GitHub Actions 워크플로우
├── deploy.sh                  # 서버 배포용 스크립트
└── README.md                  # 프로젝트 정리 문서
```

---

## ⚙️ GitHub Actions 설정

### ✅ `deploy.yml` 내용 요약

```yaml
on:
  push:
    branches:
      - master

jobs:
  deploy:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout
        uses: actions/checkout@v3
      - name: SSH Deploy
        uses: appleboy/ssh-action@master
        with:
          host: ${ secrets.DEPLOY_HOST }
          username: ${ secrets.DEPLOY_USER }
          key: ${ secrets.SSH_PRIVATE_KEY }
          script: |
            cd /home/cook/bootBoard
            git pull origin master
            ./deploy.sh
```

---

## 🔐 GitHub Secrets 설정

| 이름 | 설명 |
|------|------|
| `SSH_PRIVATE_KEY` | 서버 접속용 개인키 내용 |
| `DEPLOY_USER`     | SSH 사용자명 |
| `DEPLOY_HOST`     | 배포 서버의 IP 주소 |

---

## 📝 deploy.sh 내용

```bash
#!/bin/bash
set -e
cd /home/cook/bootBoard
git pull origin master
pkill -f 'java -jar' || true
nohup java -jar target/*.jar > app.log 2>&1 &
```

---

## 🚧 겪었던 문제와 해결 과정

| 문제 | 원인 | 해결 방법 |
|------|------|-----------|
| Actions 탭에 아무것도 안 뜸 | `.yml`이 `bootBoard` 내부에 있었음 | `.github` 폴더를 루트로 이동 |
| `.yml` Git에 안 올라감 | `.gitignore`에 `*.yml` 설정 | 예외 설정: `!.github/workflows/deploy.yml` |
| 브랜치 mismatch | `main` → 실제 브랜치는 `master` | `branches: master`로 수정 |
| Push 후에도 실행 안 됨 | CI 트리거용 커밋 없음 | `README.md` 수정 후 push |

---

## ✅ 최종 점검 결과

- [x] GitHub Actions 실행 확인
- [x] SSH 비밀번호 없이 접속 성공
- [x] 서버에서 `git pull` 및 `deploy.sh` 실행
- [x] Spring Boot jar 실행 정상
- [x] 웹 접속 성공 및 로그인 가능

---

