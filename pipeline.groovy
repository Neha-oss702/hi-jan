pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'well come to new hhbujof word hiuohiuhihuoihhihihibhio'
            }             
        }
        stage('build') {
            steps {
                echo 'well build  hiuohiuhihuoihhihihibhio'
            }             
        }
        stage('test') {
            steps {
                echo 'well test d hiuohiuhihuoihhihihibhio'
            }             
        }
        stage('deploy') {
            steps {
                echo 'thios kldee'
            }             
        }
    }
}
