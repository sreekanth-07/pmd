pipeline {
  agent any
//   parameters {
//     string(name: 'BRANCH', defaultValue: 'main', description: 'Namespace name', trim: true)
//   }
  stages {
    stage('PMD Scan') {
      steps {
        script {
          echo 'test'
//           bat '''  
//           cd bin
//           pmd -d ../src/main -R ../rulesetspmd.xml -f csv -r ../a.csv --fail-on-violation false
//           '''
        }
      }
    }
stage("git-push") {
               steps {
	       		//withCredentials([gitUsernamePassword(credentialsId: 'git_token', gitToolName: 'Default')]) {
		       withCredentials([string(credentialsId: 'git_token', variable: 'token')]) {
           
                    bat '''
		     git config --global user.email "kallepusreekanth7@gmail.com"
                     git config --global user.name "sreekanth-07"
		     
		     git branch -a
		     git checkout -b autodeploy
	             git status
	             git add .
                     git commit -m "update changes"
		     
		     git push https://github.com/sreekanth-07/pmd.git autodeploy
		     
	           '''
		   }
		 }
           }
  }
}
