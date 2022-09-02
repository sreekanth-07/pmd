pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test'
	  bat '''
          pmd.bat -d src/main -R basic.xml -f text > C:/Users/002XJB744/.jenkins/workspace/output.txt
	  '''
        }
      }
    }
  }
}
