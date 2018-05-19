pipeline {
    agent any 
    tools {
        maven 'maven'
        jdk 'java'
    }	
    stages {
        stage('Initialize') {
            steps {
                sh 'mvn -v'            
            }        
        }    
    }
}
