pipeline {
	agent any
	tools{
	maven 'maven'
	jdk 'jdk'
	}
	
	stages {

stage('Build') {
	steps{
		sh 'mvn -B'
	}
}
stage('Test') {
	steps{
		sh 'mvn test'
	}
}
}
}