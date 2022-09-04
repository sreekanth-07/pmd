pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  bat '''
          pmd.bat -d src  -R quickstart.xml -f text  -b -r log.txt
	  '''
        }
      }
    }
  }
}
