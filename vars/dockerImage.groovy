def dockerFunction(String param1,String param2,String param3){
  def tmp = ${param1}
  def mytag = tmp.substring(0, 7)
  docker.withRegistry('https://index.docker.io/v1/', ${param2}) {
    docker.image(${param3}).push(mytag)
  }
}
