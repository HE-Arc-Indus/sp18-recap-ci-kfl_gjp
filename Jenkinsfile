pipeline {
	agent {
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