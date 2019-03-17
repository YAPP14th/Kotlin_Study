# IntelliJ에서 작업하기

### 일단 Pull Request를 제가 다 날렸을꺼에요.
Pull Request 날린거 선택하고, 각자 레포를 Merge 해주세요

### 1. IntelliJ Idea를 실행하여 각자 자기 레포를 clone 받는다.
(ex> https://github.com/ridickle7/Kotlin_Study.git)

### 2. 초기 세팅
위에 꺼 선택하고 계속 Next와 Yes만 누른다.
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/00_select_top%20&%20only%20next%20and%20yes.png?raw=true)
그러면 아래 화면과 같이 세팅이 될 것이다.  
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/first_status_project.png?raw=true)

### 3. Project Structure > Project 
**sdk**를 설정해준다.
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/01_setting_sdk.png?raw=true)

### 4. Project Structure > Modules
원래 있던 Kotlin_Study 모듈을 지운다.
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/02_prev_module_delete.png?raw=true)

### 5. + 버튼을 누르고 New Module을 선택한다.
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/03_plus_new_module.png?raw=true)

### 6. Kotlin > Kotlin/JVM 을 선택한다.
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/04_select_jvm.png?raw=true)

### 7. module name / content root / module file location 을 설정한다.
- module name : 프로젝트 디렉토리 이름
- content root : 프로젝트 디렉토리
- module file location : 프로젝트 디렉토리

**content root를 먼저 수정하면 손쉽게 작업할 수 있다.**
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/05_1_set_content_root_project_directory.png?raw=true)

### 8. More Settings
- **Create source root**를 반드시!! 체크 해제한다.  
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/05_2_not_checked_src.png?raw=true)

### 9. Project Structure > Modules > Source 
- 원하는 폴더를 **Source Folder** 로 지정한다.
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/06_set_sources_dir.png?raw=true)

### 10. Project Structure > Modules > Path 
- Output Path, Test output path 가 비어있을 경우 Inherit project compile output path 를 선택해준다.
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/07_set_path.png?raw=true)

### 11. Project Structure > Modules > Dependencies 
- **KotlinJavaRuntime**을 체크한다.
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/08_check_dependencies_KotlinJavaRuntime.png?raw=true)

### 12. Kotlin not configured 
- 해당 경고가 뜰 경우 **configure**를 클릭하여 **Java**를 선택한다.
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/09_set_kotlin_configure.png?raw=true)

### 13. kts 파일을 이용하는 경우 
- **script runtime library**를 **import** 한다. (아래같이 진행하면 됨)  
![image](https://github.com/ridickle7/Kotlin_Study/blob/master/0_study/0_reference/10_add_script_library.png?raw=true)
