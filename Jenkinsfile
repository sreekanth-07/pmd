pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  pmd '''
          ./run.bat -d src/main  -R basic.xml -f text 
	  '''
        }
      }
    }
  }
}
