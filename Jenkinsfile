pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  bat '''
          run.bat -d src/main  -R basic.xml -f text 
	  '''
        }
      }
    }
  }
}
