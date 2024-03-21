pipeline {
  agent any
  triggers {
        GenericTrigger(
            genericVariables: [
                [key: 'myHash', value: '$.after'],
            ],
            token: 'devops'
        )
  }
  stages {
    stage('Docker Compose Down') {
      steps {
        script {
          sh '/usr/local/bin/docker-compose down'
        }
      }
    }
    stage('Docker Compose Up') {
      steps {
        script {
          sh '/usr/local/bin/docker-compose up'
        }
      }
    }
  }
}
    
