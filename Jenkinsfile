pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  sh '''
          ./run.sh -d src/main  -R basic.xml -f text 
	  '''
        }
      }
    }
  }
}
