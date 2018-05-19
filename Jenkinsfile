pipeline {
    agent any 
    tools {
        maven 'maven'
        jdk 'java'
    }	
    stages {
        stage('Build') {
            steps {
               sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Tests') {
            steps {
                sh 'mvn test'
            }        
        }    
    }
}
