def call(String ProjectName,String ImageTag,String dockerHubUser){
  sh " docker build -t ${dockerHubUser}/${dockerHubUser}:${ImageTag} ."
}
