def call(String ProjectName,String ImageTag,String dockerHubUser){
  withCredentials([usernamePassword(
                    'credentialsId':"dockerhubcred",
                    passwordVariable:"dockerHubPass",
                    usernameVariable:"dockerHubUser")]){
                sh " docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                sh " docker image tag flask-web-app:latest ${dockerHubUser}/flask-web-app:latest "
                sh "docker push ${dockerHubUser}/flask-web-app:latest"
               }
}
