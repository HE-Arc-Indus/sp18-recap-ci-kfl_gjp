pipeline {
    agent any 
    tools {
        maven 'maven'
        jdk 'java'
    }	
    stages {
      stage('Initialize') {
            steps
            {
              arch
            }
        }
      stage('Build') {
            echo "build"
        }
      stage('Test') {
            mvn -v
        }
     }
}
