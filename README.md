# ✈️ JORANG 여행에 대한 모든 것

## 📃 프로젝트 개발 동기
개인적으로 해외 여행을 좋아하는데, 다른 사람들은 내가 가고 싶은 여행지에 대해 어떻게 생각하고 계획과 경비를 어떻게 짰는지 확인하기 위해 서비스를 개발하였습니다.

## 📃 프로젝트 소개
나의 여행 계획, 일지, 실제 사용한 경비를 관리하고 사람들과 공유하여 다른 사람들의 여행기를 읽고 소통하면서 내 여행을 준비하는데 필요한 정보를 얻을 수 있다.

## 📃 핵심 기능
### 1. 여행기, 경비, 계획 작성 및 공유

- 날짜별 여행기, 경비 작성 및 공유
- Google cloud storage를 이용하여 사진 업로드 및 가져오기
- 이미지 슬라이더 구현
- 경비를 도표로 구현
- 여행 일지 최신순, 좋아요순 정렬 및 여행 기간에 따른 여행 일지 필터 구현
- 유저 아이디, 이메일 변경 시 이메일로 임시 비밀번호 발송

### 2. 챗봇 (아래 Langchain server 참고)

- Langchain을 이용하여 명소, 여행지, 여행 계획 추천 기능 및 내 맞춤 여행 계획 추천 구현
  (LLM : Google Gemini, Framework : FastAPI)

### Langchain server
https://github.com/encore-full-stack-5/JORANG-TRAVEL-FE

### Front-End
https://github.com/encore-full-stack-5/JORANG-TRAVEL-FE


## ⚙️ 기술스택

### Server Framework
![Spring-Boot](https://img.shields.io/badge/spring--boot-%236DB33F.svg?style=for-the-badge&logo=springboot&logoColor=white)

### Database
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">

### Infra Framework
![Google Cloud](https://img.shields.io/badge/GoogleCloud-%234285F4.svg?style=for-the-badge&logo=google-cloud&logoColor=white)

## 🧑🏻‍💻 멤버구성
 - 조진호
 - 김세현
 - 임서연
   
## 프로젝트 구조

📦src<br>
┣ 📂main<br>
┃ ┣ 📂generated<br>
┃ ┣ 📂java<br>
┃ ┃ ┗ 📂com<br>
┃ ┃ ┃ ┗ 📂example<br>
┃ ┃ ┃ ┃ ┗ 📂travel_diary<br>
┃ ┃ ┃ ┃ ┃ ┣ 📂controller<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂exceptionController<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AuthExceptionController.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DiaryExceptionController.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PhotoExceptionController.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PostExceptionController.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AuthController.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CountryInfoController.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DiaryController.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseController.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseDetailController.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LikeController.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PhotoController.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PostController.java<br>
┃ ┃ ┃ ┃ ┃ ┣ 📂global<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂config<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomSecurityConfig.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ElasticSearchConfig.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂domain<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂elasticSearch<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PostDocument.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CountryInfo.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Diary.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Expense.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseDetail.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FindLoginIdEmailSender.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FindPasswordEmailSender.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Like.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PasswordGenerator.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Photo.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Post.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜User.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CountryInfoRepository.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DiaryRepository.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseDetailRepository.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseRepository.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LikeRepository.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PhotoRepository.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PostRepository.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserRepository.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂type<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Scope.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂exception<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DiaryNotFoundException.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜EmailAlreadyExistsException.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginFailedException.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginIdAlreadyExistsException.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PhotoLimitExceededException.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PhotoNotFoundException.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PostNotFoundException.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PostNotPublicException.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserNotFoundException.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂request<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DiaryRequestDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseDetailRequestDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseRequestDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FindLoginIdRequestDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜FindPasswordRequestDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PhotoRequestDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PostRequestDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SignInRequestDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SignUpRequestDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UpdateUserRequestDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂response<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DiaryResponseDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseDetailByUserAndCountryResponseDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseDetailChartResponseDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseDetailChartTempResponseDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseDetailResponseDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseResponseDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜GetUserByIdResponseDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LikeResponse.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginInResponseDto.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PostResponse.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂utils<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JwtAuthenticationFilter.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜JwtUtil.java<br>
┃ ┃ ┃ ┃ ┃ ┣ 📂service<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AuthService.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AuthServiceImpl.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CountryInfoService.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CountryInfoServiceImpl.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DiaryService.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DiaryServiceImpl.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseDetailService.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseDetailServiceImpl.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseService.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseServiceImpl.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LikeService.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LikeServiceImpl.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PhotoService.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PhotoServiceImpl.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PostSearchService.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜PostService.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PostServiceImpl.java<br>
┃ ┃ ┃ ┃ ┃ ┗ 📜TravelDiaryApplication.java<br>
┃ ┗ 📂resources<br>
┃ ┃ ┣ 📜application-prod.yml<br>
┃ ┃ ┗ 📜application.yml<br>
┗ 📂test<br>
┃ ┗ 📂java<br>
┃ ┃ ┗ 📂com<br>
┃ ┃ ┃ ┗ 📂example<br>
┃ ┃ ┃ ┃ ┗ 📂travel_diary<br>
┃ ┃ ┃ ┃ ┃ ┣ 📂service<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜AuthServiceImplTest.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExpenseServiceTest.java<br>
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜PostServiceImplTest.java<br>
┃ ┃ ┃ ┃ ┃ ┗ 📜TravelDiaryApplicationTests.java<br>

## 🔗 ERD
![image](https://github.com/user-attachments/assets/4266a2da-99d2-4027-a9fe-c7a8451c26a4)

## 트러블 슈팅
1. Google cloud storage를 사용할 때 Front에서 file type의 input을 보낼 때 이로부터 파일 경로를 읽어올 수 없음<br><br>
원인 : Front에서 file type의 input을 보낼 때는 파일 경로를 back으로 보내지 않는다.<br>
개선 : Server에서 MultipartFile[] type으로 받고 front에서 FormData형식으로 server로 보내서 해결<br>

2. Post entity를 Page type으로 가져올 때, 요청한 size 보다 적은 데이터를 가져옴<br><br> 
원인 : 아래 그림과 같이 1개의 Post id에 여러 개의 Diary id가 join되어있어, size가 5라고 하면, post_id 가 4번인 것까지 가져온다.<br>
![image](https://github.com/user-attachments/assets/9408e91b-6ef9-4266-a486-cc0004a66a8f)<br>
개선 : Front 에서 최신순과 같은 정렬을 할 때 전체 Post를 기준으로 정렬하지 못하고, 현재 page내에서만 정렬을 하여 Page<Post> → List<Post>를 return 하는 것으로 변경<br>

3. Post service에서 Post와 OneToMany 관계에 있는 Diary entity의 scope(공개 범위) column가 공개인 것만 가져오는 jpa method 작성하였을 때, 비공개 데이터도 가져옴.<br><br> 
원인 : Diary entity가 Post 기준 OneToMany관계에 있기 때문에 기본적으로 lazy loading 상태이다. 이 때, Diary를 아직 읽어오지 않은 상태에서 Diary의 scope column에 where절을 적용하기 때문에, 해당 조건은 적용되지 않는다.<br> 
개선1 : Fetch join으로 Diary entity를 첫 query부터 가져와 조건 적용<br>
개선2 : 결국 table 구조 변경으로 fetch join 불필요로 삭제<br>

## 느낀 점
진호 : 전체적으로 프로젝트의 front에서 back을 A부터 Z까지 경험을 하여 크게 성장할 수 있는 프로젝트 였다. 이 과정에서 에러를 많이 마주치고 해결해나가면서 각종 에러 케이스에 대한 시야를 넓힐 수 있었다. 특히, join 관계에 따라 query를 어떻게 쳐야하는지에 대해 심도 있게 알게 되었다. 이를 통해 N+1 loading이 왜 발생하고 fetch join으로 해결하는 과정을 몸소 느낄 수 있었다. 또한, 팀장으로서 다른 사람들의 코드를 읽어야 하는 경우가 많았는데, 이를 통해 다른 사람의 코드를 이해하는 눈을 기르고 미처 알지 못하거나 간과했던 부분에 대해 깨달았다. 이러한 과정을 통해 내 코드 뿐만 아니라, 다른 사람의 코드를 읽는 것이 실력 향상에 굉장히 도움이 된다는 것을 느꼈다.<br>
<br>세현 : 이번 JORANG 프로젝트를 진행하면서 여러 가지 어려움을 극복하고 많은 것을 배울 수 있었습니다. 처음에는 여러 에러들을 보고 오류를 수정하는 것이 힘들었지만, 반복되는 에러를 몇 번 경험하고 나서 직접 오류를 고칠 수 있게 되었습니다. 초기 ERD를 설계하고 수정하는 과정에서 Redis를 활용하지 못한 점이 아쉬웠으며, 다음 프로젝트에서는 꼭 사용해보고 싶다고 생각했습니다. 챗봇 페이지를 구현하면서 스프링부트와는 다른 파이썬 서버를 연결하는 것이 처음에는 복잡하게 느껴졌지만, 직접 서버를 연결해 보면서 생각보다 간단하다는 것을 깨달았습니다. 이를 통해 랭체인을 활용하는 법도 배웠으나, 시간 부족으로 인해 충분히 활용하지 못한 점이 아쉬움으로 남습니다. 또한 프론트엔드와 서버 간 Axios를 활용하여 데이터를 주고받는 방법을 학습했습니다. 이를 통해 데이터 통신의 기초를 이해하게 되었습니다. 처음에는 비동기 함수를 잘 알지 못해 사용하는 데 어려움이 있었지만, 프로젝트를 진행하면서 async와 await에 대해 공부하고 비동기 함수를 이해하게 되었습니다. 프론트엔드 화면을 처음부터 구성하는 것이 초반에는 헷갈렸지만, 처음부터 직접 화면을 구성해보면서 리액트의 전체적인 흐름과 구조 및 작동 방식을 더욱 자세하게 이해할 수 있었습니다. 또한 CSS를 사용할 때 팀원과 클래스 이름이 겹치는 문제가 발생했지만, 이후에 클래스 이름을 신중하게 관리하고 네이밍 규칙을 정하면서 충돌을 방지했습니다. 리액트에서 화면이 원하는 대로 렌더링되지 않는 문제도 겪었으나, 리액트의 렌더링 기준과 useEffect에 대해 자세히 공부한 후 리액트의 렌더링 메커니즘을 이해하게 되어 원하는 대로 화면을 구성할 수 있었습니다. 이번 프로젝트를 진행하면서 백엔드와 프론트엔드에서 다양한 기술적 어려움을 극복하고 많은 것을 배울 수 있는 시간이었습니다.<br>
<br>서연 : API를 통한 요청과 응답 과정을 직접 구현하면서 이를 통해 어떻게 서버가 클라이언트의 요구에 반응하여 필요한 데이터를 제공하는지 프로젝트의 전체적인 흐름을 알게되는 프로젝트였다
프론트 컴포넌트 구성에 있어서 컴포넌트를 명확히 분리하지 않음으로써 코드가 지나치게 길어지고
이로 인해 전체적인 코드의 가독성이 떨어지는 문제를 경험했다
이는 코드 내에서 정보를 찾기가 어려웠고, 유지보수의 효율을 저하시켰다
또한 CSS 클래스 이름이 겹치는 문제도 발생했다
앞으로는 컴포넌트 설계에서 주의를 기울여야겠다는 생각이 들었다.



