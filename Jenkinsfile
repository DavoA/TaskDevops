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
          sh '/usr/bin/docker-compose down -d'
        }
      }
    }
    stage('Docker Compose Up') {
      steps {
        script {
          sh '/usr/bin/docker-compose up -d'
        }
      }
    }
  }
}
    
