pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'well come to new word   World'
            }
        }
    }
}
