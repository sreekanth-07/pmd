pipeline {
  agent any
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  bat '''
	  cd bin
          pmd.bat -d ../src/main -R ../basic.xml -f text -r ../log.txt --fail-on-violation false
	  '''
        }
      }
    }
  }
}
