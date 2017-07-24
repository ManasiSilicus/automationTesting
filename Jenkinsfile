pipeline {
  agent any
  stages {
    stage('Compile') {
      steps {
        echo 'Compiling'
        bat(script: 'mvn clean compile', returnStatus: true)
      }
    }
  }
}