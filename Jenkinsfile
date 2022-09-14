pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
	   withCredentials([string(credentialsId: 'slackoutput', variable: 'pmdslack')]) {
           set +x
           curl -H 'Token: $pmdslack' https://some.api/
		   }
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
