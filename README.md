****
# Table Of Content
1. [Introduction](#introduction)
2. [Initial Desgin](#initial-design)
3. [Network Flow](#network-flow)
4. [Configuration](#configuration)
5. [Usage](#usage)
6. [Related Reference](#related-reference)
7. [Code Convention](#code-convention)
8. [Todo](#todo)
9. [Maintainers](#maintainers)
****

## Introduction
Performance-Graph는 축구 선수들의 시즌별 성과 지표를(ex 골, 출전시간 등) 그래프화한 웹 프로젝트입니다. 이 프로젝트는 [네이버 스포츠](https://sports.news.naver.com/wfootball/record/index?category=epl&league=100&tab=player), [다음 스포츠](https://sports.daum.net/record/epl/person?season=20212022)에서 표 형태로 노출되는 축구 선수들의 성과 지표를 그래프로 시각화하여 비교합니다.  

이 프로젝트는 [Performance-Graph/Front](https://github.com/Performance-Graph/Front)와 [Performance-Graph/Api](https://github.com/Performance-Graph/Api)로 구성되어 있습니다. Performance-Graph/Front는 Javascript-React를 사용하고 Performance-Graph/Api는 Java-Spring-Mysql을 사용합니다.

## Initial Design

1. [draw.io](https://app.diagrams.net) 접속
2. `https://raw.githubusercontent.com/Performance-Graph/Front/master/design.drawio`을 이용하여 file open 

## Network Flow

1. [draw.io](https://app.diagrams.net) 접속
2. `https://raw.githubusercontent.com/Performance-Graph/Api/init-readme/network.drawio`을 이용하여 file open

## Configuration
- IDE : Intellij
- Language : Java 11(zulu11.50.19-ca-jdk11.0.12)
- Framework : Spring Boot ?.?.? (spring ?.?.?)
- Orm : Spring Data Jpa
- DB : Mysql ?.?.?

## Usage
### Prerequisites
```
1. ..
2. ..
```
### Environment Arguments
```
1. ..
2. ..
```
### run
```
1. ..
2. ..
```

## Related Reference
- 축구선수 지표 : [football-api](https://football-api.com/)
- 축구선수 이름 번역(한글->영문) : [파파고](https://developers.naver.com/docs/papago/papago-nmt-overview.md)

## Code Convention
*working(https://github.com/diffplug/spotless)*

## Todo

1. 로그인 구현
2. https 적용
3. ELB 적용
4. 타 스포츠 메뉴 추가

## Maintainers

[junghyunlyoo](https://github.com/JungHyunLyoo)
- project owner
- server developer
- infra

[pjhdev](https://github.com/pjhdev)
- server developer
- infra

[ChoHyungkeun](https://github.com/ChoHyungkeun)
- server developer
