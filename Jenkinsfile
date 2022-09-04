pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  sh '''
         ./run.sh pmd -d src/main -f text -R basic.xml
	  '''
        }
      }
    }
  }
}
