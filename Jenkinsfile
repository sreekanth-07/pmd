pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  bat '''
	  cd bin
          pmd.bat -d ../src/main -R ../quickstart.xml -f csv -r ../log.csv --fail-on-violation false
	  '''
        }
      }
    }
    stage('Slack Upload'){
      steps {
	slackUploadFile filePath: 'log.csv', initialComment: 'trying to uploading file'    
      }   
    }
  }
}
