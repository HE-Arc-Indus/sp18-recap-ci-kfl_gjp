pipeline {
    agent any 
    tools {
        maven 'maven'
        jdk 'java'
    }	
    stages {
        stage('Tests') {
            steps {
                sh 'mvn test'
            }        
        }    
    }
}
