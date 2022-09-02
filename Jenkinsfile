pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test'
	  pmd '''
          pmd.bat -d src/main -R basic.xml -f text
	  '''
        }
      }
    }
  }
}
