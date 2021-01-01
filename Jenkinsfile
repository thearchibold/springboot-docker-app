node{
    stage("scm-checkout"){
        git credentialsId: 'github-creds', url: 'https://github.com/thearchibold/spring-boot-unittest.git'
    }
    stage('docker build'){
        sh './gradlew assemble docker'
    }
    stage('push docker image to docker hub'){
         withCredentials([string(credentialsId: 'dockerHubPwd', variable: 'docker_hub_password')]) {
             sh "docker login -u thearchibold -p ${docker_hub_password}"
         }
         sh './gradlew assemble dockerPush'
    }


}

