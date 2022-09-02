pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test'
	  @echo off 
	  bat '''
          pmd.bat -d src/main -R basic.xml -f text >> output.txt
	  echo $(cat output.txt | sed 's/a/1') > output.txt
	  '''
        }
      }
    }
  }
}
