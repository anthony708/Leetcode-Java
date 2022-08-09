<!--
 * @Author: Anthony
 * @Date: 2022-08-10 00:21:22
 * @LastEditTime: 2022-08-10 00:31:14
-->
### mvn相关操作
* install
    brew install maven
    mvn --version

* create maven project  
    ```
    mvn -B archetype:generate -DgroupId=com.github.Lexie -DartifactId=Leetcode-Java -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
### git
* create a new repository in github
* cmd
    ```git init
    git add .
    git commit -m 'init commit'
    git branch -M main 
    git remote add origin git@github.com:anthony708/Leetcode-Java.git
    git push -u origin main
     