pipeline {

    agent {
        docker { 
            image 'node:7-alpine' 
        }
    }

    stages {
        stage('version') {
            steps {
                sh 'node --version'
            }
        }
    }
}
