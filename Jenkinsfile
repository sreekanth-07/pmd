pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Clones the repository to the workspace
                    git url: 'https://github.com/sreekanth-07/pmd-pipeline.git'
                }
            }
        }
         stage('testing') {
            steps {
                script {
                    fileExists 'sample.txt'
                    sh 'cat sample1'
                }
            }
        }
          stage('Eco') {
            steps {
                script {
                    sh 'echo "this is sneha"'
                }
            }
        }
        stage('Access File') {
            steps {
                script {
                    // Read the content of the file
                    sh 'echo "inside gradle stage"'
                    sh "pwd"
                    def fileContent = readFile './sample.txt'
                    sh "pwd"
                    // Print the content
                    echo fileContent
                }
            }
        }
    }
}
