pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  sh '''
          run.sh -d src/main -R quickstart.xml -f text >> log.txt --fail-on-violation false
	  '''
        }
      }
    }
  }
}
