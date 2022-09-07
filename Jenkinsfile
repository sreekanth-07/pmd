pipeline {
  agent any
  stages {
     stage('GitCheckout') {
        steps {
            checkout \
                scm: [ $class : 'GitSCM', branches: [[name: '*/main']], extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'pmd-files']], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/sreekanth-07/pmd-files.git']]]
        }
    }
    stage('PMD Scan') {
      steps {
        script {
          echo 'test' 
	  bat '''
	  pmd.bat -d ../src/main -R ../basic.xml -f text -r ../log.txt --fail-on-violation false
	  '''
        }
      }
    }
  }
}
