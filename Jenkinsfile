pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  sh '''
          run.sh -d src/main -R basic.xml -f text >> output.xml
	  echo $(cat output.xml | sed 's/a/1') > output.xml
	  '''
        }
      }
    }
  }
}
