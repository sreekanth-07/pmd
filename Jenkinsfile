pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  bat '''
	  cd bin
          pmd.bat -d ../src/main -R ../basic.xml -f csv -r ../log.csv 
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
