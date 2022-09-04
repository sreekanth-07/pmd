pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  bat '''
          pmd.bat -d src  -R quickstart.xml -f text -r log.txt --fail-on-violation false
	  '''
        }
      }
    }
  }
}
