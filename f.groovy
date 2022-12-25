pipeline{
    agent any
    stages{
        stage('Compile'){
            steps{
                echo "Compile Pass"
            }
        }
        stage('JUnit'){
            steps{
                echo "JUnit Pass"
            }
        }
        stage('Quality Gate'){
            steps{
                echo "Quality Gate Pass"
            }
        }
        stage('Deploy'){
            steps{
                echo "Pass"
            }
        }
    }
    post{
        always{
            echo "always run"
        }
        success{
            echo "run on success"
        }
        failure{
            echo "run on failure"
        }
        unstable{
            echo "run if unstabble"
        }
        changed{
            echo "pipeline changed"
        }
    }
}