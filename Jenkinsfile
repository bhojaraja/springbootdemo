pipeline {
    agent any

    stages {
        stage('S1') {
            steps {
                echo 'stage1'
		mvn package
            }
        }
        stage('S2') {
            steps {
                
                echo 'stage2'
java -jar target/springbootdemo-0.0.1-SNAPSHOT.jar
            }
        }
    }
}

