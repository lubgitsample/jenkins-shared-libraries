def call(String ProjectName, String ImageTag, String dockerHubUser) {
  sh "docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag} ."
}
