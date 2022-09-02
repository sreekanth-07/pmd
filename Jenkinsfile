pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  bat '''
          pmd.bat -d src/main -R basic.xml -f text >> output.xml
	  echo $(cat output.xml | sed 's/a/1') > output.xml
	  '''
        }
      }
    }
  }
}
