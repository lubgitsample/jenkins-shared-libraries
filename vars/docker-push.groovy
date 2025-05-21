def call(String ProjectName, String ImageTag, String dockerHubUser){
  withCredentials([usernamePassword(
    credentialsId: "dockerhubcred",
    passwordVariable: "dockerHubPass",
    usernameVariable: "dockerHubUser"
  )]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    sh "docker image tag ${ProjectName}:latest ${dockerHubUser}/${ProjectName}:${ImageTag}"
    sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
  }
}
