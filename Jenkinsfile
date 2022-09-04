pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  sh '''
          ./run.sh pmd -d src/main/sample.java  -R basic.xml -f text 
	  '''
        }
      }
    }
  }
}
