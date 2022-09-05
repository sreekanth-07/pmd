pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  bat '''
          pmd.bat -d src/main -R quickstart.xml -f text >> log.txt --fail-on-violation false
	  '''
        }
      }
    }
  }
}
