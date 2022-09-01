pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test'
	  bat '''
          pmd -d src/main -R ruletest.xml -f text
	  '''
        }
      }
    }
  }
}
