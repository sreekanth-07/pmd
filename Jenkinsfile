pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Clones the repository to the workspace
                    //git url: 'https://github.com/sreekanth-07/pmd.git'
                     checkout scmGit(branches: [[name: 'main']], 
                                userRemoteConfigs: [[url: 'https://github.com/sreekanth-07/pmd.git']])
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
