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
                sh 
                '''
                echo
                "PATH = ${PATH}"
                echo
                "M2_HOME = ${M2_HOME}"
                '''
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
